# MetaLib (name is up for up for change), Unreleased!

[![Platforms](https://img.shields.io/badge/platforms-Paper%20%7C%20Velocity-00bcd4.svg)](#)
[![PacketEvents](https://img.shields.io/badge/dependency-PacketEvents-ff6f00.svg)](https://github.com/retrooper/packetevents)
[![Minecraft Versions](https://img.shields.io/badge/minecraft%20versions-1.14.4%2B-brightgreen.svg)](#)

**MetaLib** is a high-performance, developer library designed to abstract Minecraft's protocol-level entity system.
Built on top of **PacketEvents**, it allows you to easily create, control, and manipulate packet-based entities without the overhead of heavy server-side entities.

Whether you are targeting backend game servers or proxy-side systems, 
MetaLib handles the heavy lifting of version-agnostic metadata/object data,
spawn packets, and entity tracking seamlessly across **Minecraft 1.14.4 through the latest versions**.

## Getting Started

### 1. Add Dependencies

First, ensure you have **PacketEvents** shaded or installed on your platform. Then, 
add MetaLib to your build system and relocate it to avoid conflicts with other plugins:
#### Gradle kotlin dsl
```gradle.kts
plugins {
    id("java")
    id("com.gradleup.shadow") version "9.1.0"
}

repositories {
    // TODO (not published anywhere yet, probably going to use jitpack?)
}

dependencies {
    implementation("dev.threeadd.metalib:spigot:1.0-SNAPSHOT")
}

tasks {
    shadowJar {
        archiveFileName = project.name + "-" + project.version + ".jar"
        relocate("dev.threeadd.metalib.", "dev.threeadd.metalibtest.metalib.")
    }
}
### maven
TODO
```
### 2. Setup the api
Choose a platform (The example uses paper, but other platforms have similar setups)
```java
// in YourPlugin.java

@Ovveride void onEnable() {
    MetaLibAPISettings settings = new MetaLibAPISettings();
    PaperMetaLibPlatform platform = new PaperMetaLibPlatform(this, settings);
    MetaLib.init(platform);
  
    // other logic...
}
```
## Example Usage
### Entities
for a player
```java
Location loc = /*...*/;
UUID uuid = UUID.randomUUID();
ProtocolEntity entity = ProtocolEntity.builder()
    .entityType(EntityTypes.PLAYER)
    .extensions(extensions ->
            extensions.extension(new PlayerExtension(
                    new UserProfile(uuid, "notch"),
                    GameMode.CREATIVE,
                    67,
                    true,
                    Component.text("Notch", NamedTextColor.GREEN)
            )))
    .viewers(viewers -> viewers
            .viewers(Bukkit.getOnlinePlayers().stream().map(Player::getUniqueId).toList())
    )
    .meta(meta -> {
        meta.get(PlayerMetaProperties.SHARED_FLAGS).setGlowing(true);
        meta.set(PlayerMetaProperties.SCORE, 200);
        meta.set(PlayerMetaProperties.POSE, EntityPose.SITTING);
    })
    .uuid(uuid)
    .velocity(new Vector3d(1, 1, 1))
    .version(PacketEvents.getAPI().getServerManager().getVersion().toClientVersion())
    .buildAndSpawn(ProtocolWorld.of(loc.getWorld().getName()), loc);
```
### Meta
from packet
```java
WrapperPlayServerEntityMetadata metadataPacket = /*...*/;
EntityMetadata metadata = new EntityMetadata(/*...*/); // provided you know the entity type of the packet's data
metadata.setDataFromPacket(metadataPacket);
```
to packet
```java
EntityMetadata metadata = /*...*/;
int entityId = /*...*/;
ClientVersion version = PacketEvents.getAPI().getServerManager().getVersion().toClientVersion();
WrapperPlayServerEntityMetadata metadataPacket = metadata.createPacket(entityId, version);
```
