package dev.threeadd.metalib.codegen.metaproperties.data.mapping;

import com.github.retrooper.packetevents.protocol.component.builtin.item.ItemProfile;
import com.github.retrooper.packetevents.protocol.entity.armadillo.ArmadilloState;
import com.github.retrooper.packetevents.protocol.entity.cat.CatSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.cat.CatVariant;
import com.github.retrooper.packetevents.protocol.entity.chicken.ChickenSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.chicken.ChickenVariant;
import com.github.retrooper.packetevents.protocol.entity.cow.CowSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.cow.CowVariant;
import com.github.retrooper.packetevents.protocol.entity.data.struct.CopperGolemState;
import com.github.retrooper.packetevents.protocol.entity.data.struct.WeatheringCopperState;
import com.github.retrooper.packetevents.protocol.entity.frog.FrogVariant;
import com.github.retrooper.packetevents.protocol.entity.nautilus.ZombieNautilusVariant;
import com.github.retrooper.packetevents.protocol.entity.pig.PigSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.pig.PigVariant;
import com.github.retrooper.packetevents.protocol.entity.pose.EntityPose;
import com.github.retrooper.packetevents.protocol.entity.sniffer.SnifferState;
import com.github.retrooper.packetevents.protocol.entity.villager.VillagerData;
import com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfVariant;
import com.github.retrooper.packetevents.protocol.item.ItemStack;
import com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import com.github.retrooper.packetevents.protocol.particle.Particle;
import com.github.retrooper.packetevents.protocol.player.HumanoidArm;
import com.github.retrooper.packetevents.protocol.world.BlockFace;
import com.github.retrooper.packetevents.protocol.world.painting.PaintingVariant;
import com.github.retrooper.packetevents.util.Quaternion4f;
import com.github.retrooper.packetevents.util.Vector3f;
import com.github.retrooper.packetevents.util.Vector3i;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.ParameterizedTypeName;
import com.palantir.javapoet.TypeName;
import com.palantir.javapoet.WildcardTypeName;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DataTypeMapper {

    public DataTypeMapping mapDataType(String rawDataType) {
        TypeName wildcardParticle = ParameterizedTypeName.get(ClassName.get(Particle.class), WildcardTypeName.subtypeOf(Object.class));

        return switch (rawDataType) {
            // java lang
            case "Byte" -> DataTypeMapping.of(Byte.class, "BYTE");
            case "Integer" -> DataTypeMapping.of(Integer.class, "INT");
            case "Float" -> DataTypeMapping.of(Float.class, "FLOAT");
            case "Long" -> DataTypeMapping.of(Long.class, "LONG");
            case "Boolean" -> DataTypeMapping.of(Boolean.class, "BOOLEAN");
            case "String" -> DataTypeMapping.of(String.class, "STRING");
            case "OptionalInt", "Optional<Integer>" -> DataTypeMapping.optionalOf(Integer.class, "OPTIONAL_INT");

            // adventure
            case "Component" -> DataTypeMapping.of(Component.class, "ADV_COMPONENT");
            case "Optional<Component>" -> DataTypeMapping.optionalOf(Component.class, "OPTIONAL_ADV_COMPONENT");

            // misc
            case "ParticleOptions" -> DataTypeMapping.of(wildcardParticle, "PARTICLE");
            case "List<ParticleOptions>" ->
                    DataTypeMapping.builder(List.class).parameterizedWith(wildcardParticle).peDataType("PARTICLES").build();
            case "Pose" -> DataTypeMapping.of(EntityPose.class, "ENTITY_POSE");
            case "BlockState", "Optional<BlockState>" ->
                    DataTypeMapping.of(Integer.class, rawDataType.contains("Optional") ? "OPTIONAL_BLOCK_STATE" : "BLOCK_STATE");
            case "ResolvableProfile" -> DataTypeMapping.of(ItemProfile.class, "RESOLVABLE_PROFILE");
            case "CompoundTag" -> DataTypeMapping.of(NBTCompound.class, "NBT");
            case "ItemStack" -> DataTypeMapping.of(ItemStack.class, "ITEMSTACK");
            case "Optional<UUID>", "Optional<EntityReference<LivingEntity>>" ->
                    DataTypeMapping.optionalOf(UUID.class, "OPTIONAL_UUID");

            // math
            case "Rotations", "Vector3f", "Vector3fc" -> DataTypeMapping.of(Vector3f.class, "VECTOR3F");
            case "BlockPos" -> DataTypeMapping.of(Vector3i.class, "BLOCK_POSITION");
            case "Optional<BlockPos>" -> DataTypeMapping.optionalOf(Vector3i.class, "OPTIONAL_BLOCK_POSITION");
            case "Quaternionf", "Quaternionfc" -> DataTypeMapping.of(Quaternion4f.class, "QUATERNION");

            // entity specific
            case "Sniffer.State" -> DataTypeMapping.of(SnifferState.class, "SNIFFER_STATE");
            case "VillagerData" -> DataTypeMapping.of(VillagerData.class, "VILLAGER_DATA");
            case "HumanoidArm" -> DataTypeMapping.of(HumanoidArm.class, "HUMANOID_ARM");
            case "Direction" -> DataTypeMapping.of(BlockFace.class, "BLOCK_FACE");
            case "CopperGolemState" -> DataTypeMapping.of(CopperGolemState.class, "COPPER_GOLEM_STATE");
            case "WeatheringCopper.WeatherState" ->
                    DataTypeMapping.of(WeatheringCopperState.class, "WEATHERING_COPPER_STATE");
            case "Armadillo.ArmadilloState" -> DataTypeMapping.of(ArmadilloState.class, "ARMADILLO_STATE");

            // entity variants
            case "FrogVariant", "Holder<FrogVariant>" -> DataTypeMapping.of(FrogVariant.class, "TYPED_FROG_VARIANT");
            case "CatVariant", "Holder<CatVariant>" -> DataTypeMapping.of(CatVariant.class, "TYPED_CAT_VARIANT");
            case "Holder<ChickenVariant>" -> DataTypeMapping.of(ChickenVariant.class, "CHICKEN_VARIANT");
            case "Holder<CowVariant>" -> DataTypeMapping.of(CowVariant.class, "COW_VARIANT");
            case "Holder<PaintingVariant>" -> DataTypeMapping.of(PaintingVariant.class, "PAINTING_VARIANT");
            case "Holder<PigVariant>" -> DataTypeMapping.of(PigVariant.class, "PIG_VARIANT");
            case "Holder<WolfVariant>" -> DataTypeMapping.of(WolfVariant.class, "TYPED_WOLF_VARIANT");
            case "Holder<ZombieNautilusVariant>" ->
                    DataTypeMapping.of(ZombieNautilusVariant.class, "ZOMBIE_NAUTILUS_VARIANT");

            // sound variants
            case "Holder<WolfSoundVariant>" -> DataTypeMapping.of(WolfSoundVariant.class, "WOLF_SOUND_VARIANT");
            case "Holder<CatSoundVariant>" -> DataTypeMapping.of(CatSoundVariant.class, "CAT_SOUND_VARIANT");
            case "Holder<PigSoundVariant>" -> DataTypeMapping.of(PigSoundVariant.class, "PIG_SOUND_VARIANT");
            case "Holder<ChickenSoundVariant>" -> DataTypeMapping.of(ChickenSoundVariant.class, "CHICKEN_SOUND_VARIANT");
            case "Holder<CowSoundVariant>" -> DataTypeMapping.of(CowSoundVariant.class, "COW_SOUND_VARIANT");

            default -> DataTypeMapping.excluded();
        };
    }

    private static final Map<FieldTarget, ClassName> VIEW_PROPERTIES = FieldTarget.registry()

            // bitmasks
            .inPackage("dev.threeadd.metalib.meta.protocol.bitmask.view")
            .add("AbstractArrowMetaProperties", "ID_FLAGS", "AbstractArrowIdFlagsView")
            .add("AbstractHorseMetaProperties", "FLAGS", "AbstractHorseFlagsView")
            .add("ArmorStandMetaProperties", "CLIENT_FLAGS", "ArmorStandClientFlagsView")
            .add("AvatarMetaProperties", "PLAYER_MODE_CUSTOMISATION", "AvatarPlayerModeCustomizationFlagsView")
            .add("EntityMetaProperties", "SHARED_FLAGS", "BatFlagsView")
            .add("BeeMetaProperties", "FLAGS", "BeeFlagsView")
            .add("BatMetaProperties", "FLAGS", "BatFlagsView")
            .add("BlazeMetaProperties", "FLAGS", "BlazeFlagsView")
            .add("EntityMetaProperties", "SHARED_FLAGS", "EntitySharedFlagsView")
            .add("VexMetaProperties", "FLAGS", "VexFlagsView")

            // enums
            .inPackage("dev.threeadd.metalib.meta.protocol.enums.view")
            .add("AxolotlMetaProperties", "VARIANT", "AxolotlVariantView")
            .add("CreeperMetaProperties", "SWELL_DIR", "CreeperSwellStateView")
            .add("DisplayMetaProperties", "BILLBOARD_RENDER_CONSTRAINTS", "DisplayBillboardView")
            .add("EnderDragonMetaProperties", "PHASE", "EnderDragonPhaseView")
            .add("ParrotMetaProperties", "VARIANT", "ParrotVariantView")
            .add("SalmonMetaProperties", "TYPE", "SalmonTypeView")
            .add("SpellcasterIllagerMetaProperties", "SPELL_CASTING", "SpellcasterIllagerSpellCastingView")

            .build();

    public @Nullable ClassName getViewClass(String metaClassName, String propertyName) {
        return VIEW_PROPERTIES.get(FieldTarget.of(metaClassName, propertyName));
    }

}
