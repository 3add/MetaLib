// Auto-generated file. Do not edit manually.
//
package dev.threeadd.packetentities.meta.protocol;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.protocol.component.builtin.item.ItemProfile;
import com.github.retrooper.packetevents.protocol.entity.armadillo.ArmadilloState;
import com.github.retrooper.packetevents.protocol.entity.cat.CatSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.cat.CatVariant;
import com.github.retrooper.packetevents.protocol.entity.chicken.ChickenSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.chicken.ChickenVariant;
import com.github.retrooper.packetevents.protocol.entity.cow.CowSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.cow.CowVariant;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.data.struct.CopperGolemState;
import com.github.retrooper.packetevents.protocol.entity.data.struct.WeatheringCopperState;
import com.github.retrooper.packetevents.protocol.entity.frog.FrogVariant;
import com.github.retrooper.packetevents.protocol.entity.nautilus.ZombieNautilusVariant;
import com.github.retrooper.packetevents.protocol.entity.pig.PigSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.pig.PigVariant;
import com.github.retrooper.packetevents.protocol.entity.pose.EntityPose;
import com.github.retrooper.packetevents.protocol.entity.sniffer.SnifferState;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
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
import dev.threeadd.packetentities.meta.EntityMetaSchema;
import dev.threeadd.packetentities.meta.field.IEntityMetaFieldHolder;
import dev.threeadd.packetentities.meta.field.SimpleField;
import dev.threeadd.packetentities.meta.field.ViewField;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.AbstractArrowIdFlagsView;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.AbstractHorseFlagsView;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.ArmorStandClientFlagsView;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.AvatarPlayerModeCustomizationFlagsView;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.BatFlagsView;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.BeeFlagsView;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.BlazeFlagsView;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.EntitySharedFlagsView;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.TamableAnimalFlagsView;
import dev.threeadd.packetentities.meta.protocol.bitmask.view.VexFlagsView;
import dev.threeadd.packetentities.meta.protocol.enums.view.AxolotlVariantView;
import dev.threeadd.packetentities.meta.protocol.enums.view.CreeperSwellStateView;
import dev.threeadd.packetentities.meta.protocol.enums.view.DisplayBillboardView;
import dev.threeadd.packetentities.meta.protocol.enums.view.EnderDragonPhaseView;
import dev.threeadd.packetentities.meta.protocol.enums.view.ParrotVariantView;
import dev.threeadd.packetentities.meta.protocol.enums.view.SalmonTypeView;
import dev.threeadd.packetentities.meta.protocol.enums.view.SpellcasterIllagerSpellCastingView;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import net.kyori.adventure.text.Component;

/**
 * Container for all auto-generated packet entity metadata schemas and fields.
 */
@SuppressWarnings("unused")
public final class EntityMetaFields {

    /**
     * Metadata properties for the {@code Entity} meta
     * <p>Supported Versions: {@code All Supported Versions}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Entity">Entity on the minecraft.wiki</a></p>
     */
    public static class Entity implements IEntityMetaFieldHolder {

        /**
         * Property representing the metadata field {@code AIR_SUPPLY}
         *
         * <p>Supported Versions: {@code All Supported Versions}</p>
         */
        public static final SimpleField<Integer> AIR_SUPPLY = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_26_2, 1, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code CUSTOM_NAME}
         *
         * <p>Supported Versions: {@code All Supported Versions}</p>
         */
        public static final SimpleField<Optional<Component>> CUSTOM_NAME = SimpleField.<Optional<Component>>builder()
            // TODO type changed from 'String' to 'Optional<Component>', converter required
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_26_2, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
            .build();

        /**
         * Property representing the metadata field {@code CUSTOM_NAME_VISIBLE}
         *
         * <p>Supported Versions: {@code All Supported Versions}</p>
         */
        public static final SimpleField<Boolean> CUSTOM_NAME_VISIBLE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_26_2, 3, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code NO_GRAVITY}
         *
         * <p>Supported Versions: {@code 1.11.2+}</p>
         */
        public static final SimpleField<Boolean> NO_GRAVITY = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_26_2, 5, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code POSE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<EntityPose> POSE = SimpleField.<EntityPose>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_26_2, 6, EntityDataTypes.ENTITY_POSE)
            .build();

        /**
         * Property representing the metadata field {@code SHARED_FLAGS}
         *
         * <p>Wrapped by view: {@link EntitySharedFlagsView}</p>
         * <p>Supported Versions: {@code All Supported Versions}</p>
         */
        public static final ViewField<Byte, EntitySharedFlagsView> SHARED_FLAGS = ViewField.builder(EntitySharedFlagsView::new)
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_26_2, 0, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code SILENT}
         *
         * <p>Supported Versions: {@code All Supported Versions}</p>
         */
        public static final SimpleField<Boolean> SILENT = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_26_2, 4, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code TICKS_FROZEN}
         *
         * <p>Supported Versions: {@code 1.17+}</p>
         */
        public static final SimpleField<Integer> TICKS_FROZEN = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 7, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMetaSchema.builder(EntityTypes.ENTITY)
            .add(Entity.AIR_SUPPLY)
            .add(Entity.CUSTOM_NAME)
            .add(Entity.CUSTOM_NAME_VISIBLE)
            .add(Entity.NO_GRAVITY)
            .add(Entity.POSE)
            .add(Entity.SHARED_FLAGS)
            .add(Entity.SILENT)
            .add(Entity.TICKS_FROZEN)
            .build();

    }

    /**
     * Metadata properties for the {@code Projectile} meta
     * <p>Supported Versions: {@code 1.16+}</p>
     */
    public static class Projectile extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.PROJECTILE_ABSTRACT)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Arrow} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Arrow">Abstract Arrow on the minecraft.wiki</a></p>
     */
    public static class AbstractArrow extends Projectile {

        /**
         * Property representing the metadata field {@code ID_FLAGS}
         *
         * <p>Wrapped by view: {@link AbstractArrowIdFlagsView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Byte, AbstractArrowIdFlagsView> ID_FLAGS = ViewField.builder(AbstractArrowIdFlagsView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code IN_GROUND}
         *
         * <p>Supported Versions: {@code 1.21.2+}</p>
         */
        public static final SimpleField<Boolean> IN_GROUND = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_26_2, 10, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code OWNERUUID}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.15}</p>
         */
        public static final SimpleField<Optional<UUID>> OWNERUUID = SimpleField.<Optional<UUID>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_15, 8, EntityDataTypes.OPTIONAL_UUID)
            .build();

        /**
         * Property representing the metadata field {@code PIERCE_LEVEL}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> PIERCE_LEVEL = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_15, 9, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 8, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 9, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Projectile.SCHEMA.extend(EntityTypes.ABSTRACT_ARROW)
            .add(AbstractArrow.ID_FLAGS)
            .add(AbstractArrow.IN_GROUND)
            .add(AbstractArrow.OWNERUUID)
            .add(AbstractArrow.PIERCE_LEVEL)
            .build();

    }

    /**
     * Metadata properties for the {@code Vehicle Entity} meta
     * <p>Supported Versions: {@code 1.20.3+}</p>
     */
    public static class VehicleEntity extends Entity {

        /**
         * Property representing the metadata field {@code DAMAGE}
         *
         * <p>Supported Versions: {@code 1.20.3+}</p>
         */
        public static final SimpleField<Float> DAMAGE = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_20_3, ServerVersion.V_26_2, 10, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code HURT}
         *
         * <p>Supported Versions: {@code 1.20.3+}</p>
         */
        public static final SimpleField<Integer> HURT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_20_3, ServerVersion.V_26_2, 8, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HURTDIR}
         *
         * <p>Supported Versions: {@code 1.20.3+}</p>
         */
        public static final SimpleField<Integer> HURTDIR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_20_3, ServerVersion.V_26_2, 9, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(VehicleEntity.DAMAGE)
            .add(VehicleEntity.HURT)
            .add(VehicleEntity.HURTDIR)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Boat} meta
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static class AbstractBoat extends VehicleEntity {

        /**
         * Property representing the metadata field {@code BUBBLE_TIME}
         *
         * <p>Supported Versions: {@code 1.21.2+}</p>
         */
        public static final SimpleField<Integer> BUBBLE_TIME = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_26_2, 13, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code PADDLE_LEFT}
         *
         * <p>Supported Versions: {@code 1.21.2+}</p>
         */
        public static final SimpleField<Boolean> PADDLE_LEFT = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_26_2, 11, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code PADDLE_RIGHT}
         *
         * <p>Supported Versions: {@code 1.21.2+}</p>
         */
        public static final SimpleField<Boolean> PADDLE_RIGHT = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_26_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = VehicleEntity.SCHEMA.extend(EntityTypes.BOAT)
            .add(AbstractBoat.BUBBLE_TIME)
            .add(AbstractBoat.PADDLE_LEFT)
            .add(AbstractBoat.PADDLE_RIGHT)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Chest Boat} meta
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static class AbstractChestBoat extends AbstractBoat {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractBoat.SCHEMA.extend(EntityTypes.CHEST_BOAT)
            .build();

    }

    /**
     * Metadata properties for the {@code Living Entity} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Living_Entity">Living Entity on the minecraft.wiki</a></p>
     */
    public static class LivingEntity extends Entity {

        /**
         * Property representing the metadata field {@code ARROW_COUNT}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> ARROW_COUNT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 11, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 12, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code EFFECT_AMBIENCE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> EFFECT_AMBIENCE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 10, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 11, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code EFFECT_COLOR}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.20.3}</p>
         */
        public static final SimpleField<Integer> EFFECT_COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 9, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_3, 10, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code EFFECT_PARTICLES}
         *
         * <p>Supported Versions: {@code 1.20.5+}</p>
         */
        public static final SimpleField<List<Particle<?>>> EFFECT_PARTICLES = SimpleField.<List<Particle<?>>>builder()
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_26_2, 10, EntityDataTypes.PARTICLES)
            .build();

        /**
         * Property representing the metadata field {@code HEALTH}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Float> HEALTH = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 8, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 9, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code LIVING_ENTITY_FLAGS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> LIVING_ENTITY_FLAGS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code SLEEPING_POS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Optional<Vector3i>> SLEEPING_POS = SimpleField.<Optional<Vector3i>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 12, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 13, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
            .build();

        /**
         * Property representing the metadata field {@code STINGER_COUNT}
         *
         * <p>Supported Versions: {@code 1.15+}</p>
         */
        public static final SimpleField<Integer> STINGER_COUNT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 12, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 13, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.LIVINGENTITY)
            .add(LivingEntity.ARROW_COUNT)
            .add(LivingEntity.EFFECT_AMBIENCE)
            .add(LivingEntity.EFFECT_COLOR)
            .add(LivingEntity.EFFECT_PARTICLES)
            .add(LivingEntity.HEALTH)
            .add(LivingEntity.LIVING_ENTITY_FLAGS)
            .add(LivingEntity.SLEEPING_POS)
            .add(LivingEntity.STINGER_COUNT)
            .build();

    }

    /**
     * Metadata properties for the {@code Mob} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Mob">Mob on the minecraft.wiki</a></p>
     */
    public static class Mob extends LivingEntity {

        /**
         * Property representing the metadata field {@code MOB_FLAGS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> MOB_FLAGS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 13, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 14, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 15, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = LivingEntity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(Mob.MOB_FLAGS)
            .build();

    }

    /**
     * Metadata properties for the {@code Pathfinder Mob} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class PathfinderMob extends Mob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Mob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Ageable Mob} meta
     * <p>Supported Versions: {@code 1.17+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Ageable_Mob">Ageable Mob on the minecraft.wiki</a></p>
     */
    public static class AgeableMob extends PathfinderMob {

        /**
         * Property representing the metadata field {@code AGE_LOCKED}
         *
         * <p>Supported Versions: {@code 26.1+}</p>
         */
        public static final SimpleField<Boolean> AGE_LOCKED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code BABY}
         *
         * <p>Supported Versions: {@code 1.17+}</p>
         */
        public static final SimpleField<Boolean> BABY = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = PathfinderMob.SCHEMA.extend(EntityTypes.ABSTRACT_AGEABLE)
            .add(AgeableMob.AGE_LOCKED)
            .add(AgeableMob.BABY)
            .build();

    }

    /**
     * Metadata properties for the {@code Animal} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Animal">Animal on the minecraft.wiki</a></p>
     */
    public static class Animal extends AgeableMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AgeableMob.SCHEMA.extend(EntityTypes.ABSTRACT_ANIMAL)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Horse} meta
     * <p>Supported Versions: {@code 1.11.2+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Horse">Abstract Horse on the minecraft.wiki</a></p>
     */
    public static class AbstractHorse extends Animal {

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Wrapped by view: {@link AbstractHorseFlagsView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Byte, AbstractHorseFlagsView> FLAGS = ViewField.builder(AbstractHorseFlagsView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code OWNER_UUID}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.19.3}</p>
         */
        public static final SimpleField<Optional<UUID>> OWNER_UUID = SimpleField.<Optional<UUID>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_19_3, 18, EntityDataTypes.OPTIONAL_UUID)
            .build();

        /**
         * Property representing the metadata field {@code STATUS}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<Byte> STATUS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.ABSTRACT_HORSE)
            .add(AbstractHorse.FLAGS)
            .add(AbstractHorse.OWNER_UUID)
            .add(AbstractHorse.STATUS)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Chest Horse} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class AbstractChestHorse extends AbstractHorse {

        /**
         * Property representing the metadata field {@code CHEST}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Boolean> CHEST = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHorse.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(AbstractChestHorse.CHEST)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Chested Horse} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class AbstractChestedHorse extends AbstractHorse {

        /**
         * Property representing the metadata field {@code CHEST}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> CHEST = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_19_3, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHorse.SCHEMA.extend(EntityTypes.CHESTED_HORSE)
            .add(AbstractChestedHorse.CHEST)
            .build();

    }

    /**
     * Metadata properties for the {@code Avatar} meta
     * <p>Supported Versions: {@code 1.21.9+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Avatar">Avatar on the minecraft.wiki</a></p>
     */
    public static class Avatar extends LivingEntity {

        /**
         * Property representing the metadata field {@code PLAYER_MAIN_HAND}
         *
         * <p>Supported Versions: {@code 1.21.9+}</p>
         */
        public static final SimpleField<HumanoidArm> PLAYER_MAIN_HAND = SimpleField.<HumanoidArm>builder()
            // TODO type changed from 'Byte' to 'HumanoidArm', converter required
            .addVersionRange(ServerVersion.V_1_21_11, ServerVersion.V_26_2, 15, EntityDataTypes.HUMANOID_ARM)
            .build();

        /**
         * Property representing the metadata field {@code PLAYER_MODE_CUSTOMISATION}
         *
         * <p>Wrapped by view: {@link AvatarPlayerModeCustomizationFlagsView}</p>
         * <p>Supported Versions: {@code 1.21.9+}</p>
         */
        public static final ViewField<Byte, AvatarPlayerModeCustomizationFlagsView> PLAYER_MODE_CUSTOMISATION = ViewField.builder(AvatarPlayerModeCustomizationFlagsView::new)
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 16, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = LivingEntity.SCHEMA.extend(EntityTypes.AVATAR)
            .add(Avatar.PLAYER_MAIN_HAND)
            .add(Avatar.PLAYER_MODE_CUSTOMISATION)
            .build();

    }

    /**
     * Metadata properties for the {@code Player} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Player">Player on the minecraft.wiki</a></p>
     */
    public static class Player extends Avatar {

        /**
         * Property representing the metadata field {@code PLAYER_ABSORPTION}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Float> PLAYER_ABSORPTION = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 13, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 14, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_6, 15, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 17, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code PLAYER_MAIN_HAND}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.6}</p>
         */
        public static final SimpleField<Byte> PLAYER_MAIN_HAND = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_6, 18, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code PLAYER_MODE_CUSTOMISATION}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.6}</p>
         */
        public static final SimpleField<Byte> PLAYER_MODE_CUSTOMISATION = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_6, 17, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code SCORE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> SCORE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_6, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code SHOULDER_LEFT}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.6}</p>
         */
        public static final SimpleField<NBTCompound> SHOULDER_LEFT = SimpleField.<NBTCompound>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.NBT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.NBT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_6, 19, EntityDataTypes.NBT)
            .build();

        /**
         * Property representing the metadata field {@code SHOULDER_PARROT_LEFT}
         *
         * <p>Supported Versions: {@code 1.21.9+}</p>
         */
        public static final SimpleField<Optional<Integer>> SHOULDER_PARROT_LEFT = SimpleField.<Optional<Integer>>builder()
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 19, EntityDataTypes.OPTIONAL_INT)
            .build();

        /**
         * Property representing the metadata field {@code SHOULDER_PARROT_RIGHT}
         *
         * <p>Supported Versions: {@code 1.21.9+}</p>
         */
        public static final SimpleField<Optional<Integer>> SHOULDER_PARROT_RIGHT = SimpleField.<Optional<Integer>>builder()
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 20, EntityDataTypes.OPTIONAL_INT)
            .build();

        /**
         * Property representing the metadata field {@code SHOULDER_RIGHT}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.6}</p>
         */
        public static final SimpleField<NBTCompound> SHOULDER_RIGHT = SimpleField.<NBTCompound>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 18, EntityDataTypes.NBT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 19, EntityDataTypes.NBT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_6, 20, EntityDataTypes.NBT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Avatar.SCHEMA.extend(EntityTypes.PLAYER)
            .add(Player.PLAYER_ABSORPTION)
            .add(Player.PLAYER_MAIN_HAND)
            .add(Player.PLAYER_MODE_CUSTOMISATION)
            .add(Player.SCORE)
            .add(Player.SHOULDER_LEFT)
            .add(Player.SHOULDER_PARROT_LEFT)
            .add(Player.SHOULDER_PARROT_RIGHT)
            .add(Player.SHOULDER_RIGHT)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Client Player} meta
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static class AbstractClientPlayer extends Player {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Player.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Cow} meta
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static class AbstractCow extends Animal {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.COW)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Cube Mob} meta
     * <p>Supported Versions: {@code 26.2+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Cube_Mob">Abstract Cube Mob on the minecraft.wiki</a></p>
     */
    public static class AbstractCubeMob extends AgeableMob {

        /**
         * Property representing the metadata field {@code ID_SIZE}
         *
         * <p>Supported Versions: {@code 26.2+}</p>
         */
        public static final SimpleField<Integer> ID_SIZE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_26_2, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AgeableMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(AbstractCubeMob.ID_SIZE)
            .build();

    }

    /**
     * Metadata properties for the {@code Water Animal} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class WaterAnimal extends PathfinderMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = PathfinderMob.SCHEMA.extend(EntityTypes.ABSTRACT_WATERMOB)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Fish} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Fish">Abstract Fish on the minecraft.wiki</a></p>
     */
    public static class AbstractFish extends WaterAnimal {

        /**
         * Property representing the metadata field {@code FROM_BUCKET}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> FROM_BUCKET = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = WaterAnimal.SCHEMA.extend(EntityTypes.ABSTRACT_FISHES)
            .add(AbstractFish.FROM_BUCKET)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Golem} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class AbstractGolem extends PathfinderMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = PathfinderMob.SCHEMA.extend(EntityTypes.ABSTRACT_GOLEM)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Hurting Projectile} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class AbstractHurtingProjectile extends Projectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Projectile.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Monster} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Monster">Monster on the minecraft.wiki</a></p>
     */
    public static class Monster extends PathfinderMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = PathfinderMob.SCHEMA.extend(EntityTypes.ABSTRACT_MONSTER)
            .build();

    }

    /**
     * Metadata properties for the {@code Patrolling Monster} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class PatrollingMonster extends Monster {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Raider} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Raider">Raider on the minecraft.wiki</a></p>
     */
    public static class Raider extends PatrollingMonster {

        /**
         * Property representing the metadata field {@code IS_CELEBRATING}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> IS_CELEBRATING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = PatrollingMonster.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(Raider.IS_CELEBRATING)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Illager} meta
     * <p>Supported Versions: {@code 1.12+}</p>
     */
    public static class AbstractIllager extends Raider {

        /**
         * Property representing the metadata field {@code AGGRESSIVE}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Byte> AGGRESSIVE = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Raider.SCHEMA.extend(EntityTypes.ABSTRACT_ILLAGER_BASE)
            .add(AbstractIllager.AGGRESSIVE)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Minecart} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Minecart">Abstract Minecart on the minecraft.wiki</a></p>
     */
    public static class AbstractMinecart extends VehicleEntity {

        /**
         * Property representing the metadata field {@code CUSTOM_DISPLAY}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.4}</p>
         */
        public static final SimpleField<Boolean> CUSTOM_DISPLAY = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 12, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 13, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code CUSTOM_DISPLAY_BLOCK}
         *
         * <p>Supported Versions: {@code 1.21.5+}</p>
         */
        public static final SimpleField<Integer> CUSTOM_DISPLAY_BLOCK = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_26_2, 11, EntityDataTypes.OPTIONAL_BLOCK_STATE)
            .build();

        /**
         * Property representing the metadata field {@code DAMAGE}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.20.2}</p>
         */
        public static final SimpleField<Float> DAMAGE = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 9, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_2, 10, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code DISPLAY_BLOCK}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.4}</p>
         */
        public static final SimpleField<Integer> DISPLAY_BLOCK = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 10, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 11, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code DISPLAY_OFFSET}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> DISPLAY_OFFSET = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 11, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 12, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HURT}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.20.2}</p>
         */
        public static final SimpleField<Integer> HURT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_2, 8, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HURTDIR}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.20.2}</p>
         */
        public static final SimpleField<Integer> HURTDIR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 8, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_2, 9, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = VehicleEntity.SCHEMA.extend(EntityTypes.MINECART_ABSTRACT)
            .add(AbstractMinecart.CUSTOM_DISPLAY)
            .add(AbstractMinecart.CUSTOM_DISPLAY_BLOCK)
            .add(AbstractMinecart.DAMAGE)
            .add(AbstractMinecart.DISPLAY_BLOCK)
            .add(AbstractMinecart.DISPLAY_OFFSET)
            .add(AbstractMinecart.HURT)
            .add(AbstractMinecart.HURTDIR)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Minecart Container} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class AbstractMinecartContainer extends AbstractMinecart {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractMinecart.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Tamable Animal} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class TamableAnimal extends Animal {

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Wrapped by view: {@link TamableAnimalFlagsView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Byte, TamableAnimalFlagsView> FLAGS = ViewField.builder(TamableAnimalFlagsView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code OWNERUUID}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Optional<UUID>> OWNERUUID = SimpleField.<Optional<UUID>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 18, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 18, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.OPTIONAL_UUID)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(TamableAnimal.FLAGS)
            .add(TamableAnimal.OWNERUUID)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Nautilus} meta
     * <p>Supported Versions: {@code 1.21.11+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Nautilus">Abstract Nautilus on the minecraft.wiki</a></p>
     */
    public static class AbstractNautilus extends TamableAnimal {

        /**
         * Property representing the metadata field {@code DASH}
         *
         * <p>Supported Versions: {@code 1.21.11+}</p>
         */
        public static final SimpleField<Boolean> DASH = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_11, ServerVersion.V_1_21_11, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = TamableAnimal.SCHEMA.extend(EntityTypes.ABSTRACT_NAUTILUS)
            .add(AbstractNautilus.DASH)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Piglin} meta
     * <p>Supported Versions: {@code 1.16.2+}</p>
     */
    public static class AbstractPiglin extends Monster {

        /**
         * Property representing the metadata field {@code IMMUNE_TO_ZOMBIFICATION}
         *
         * <p>Supported Versions: {@code 1.16.2+}</p>
         */
        public static final SimpleField<Boolean> IMMUNE_TO_ZOMBIFICATION = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16_2, ServerVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.ABSTRACT_PIGLIN)
            .add(AbstractPiglin.IMMUNE_TO_ZOMBIFICATION)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Schooling Fish} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class AbstractSchoolingFish extends AbstractFish {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractFish.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Skeleton} meta
     * <p>Supported Versions: {@code 1.11.2+}</p>
     */
    public static class AbstractSkeleton extends Monster {

        /**
         * Property representing the metadata field {@code SWINGING_ARMS}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<Boolean> SWINGING_ARMS = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.ABSTRACT_SKELETON)
            .add(AbstractSkeleton.SWINGING_ARMS)
            .build();

    }

    /**
     * Metadata properties for the {@code Throwable Projectile} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class ThrowableProjectile extends Projectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Projectile.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Throwable Item Projectile} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class ThrowableItemProjectile extends ThrowableProjectile {

        /**
         * Property representing the metadata field {@code ITEM_STACK}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<ItemStack> ITEM_STACK = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.ITEMSTACK)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = ThrowableProjectile.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(ThrowableItemProjectile.ITEM_STACK)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Thrown Potion} meta
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static class AbstractThrownPotion extends ThrowableItemProjectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = ThrowableItemProjectile.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Villager} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Villager">Abstract Villager on the minecraft.wiki</a></p>
     */
    public static class AbstractVillager extends AgeableMob {

        /**
         * Property representing the metadata field {@code UNHAPPY_COUNTER}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> UNHAPPY_COUNTER = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AgeableMob.SCHEMA.extend(EntityTypes.VILLAGER)
            .add(AbstractVillager.UNHAPPY_COUNTER)
            .build();

    }

    /**
     * Metadata properties for the {@code Abstract Wind Charge} meta
     * <p>Supported Versions: {@code 1.20.5+}</p>
     */
    public static class AbstractWindCharge extends AbstractHurtingProjectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHurtingProjectile.SCHEMA.extend(EntityTypes.ABSTRACT_WIND_CHARGE)
            .build();

    }

    /**
     * Metadata properties for the {@code Agable Mob} meta
     * <p>Supported Versions: {@code 1.14.4 - 1.16.2}</p>
     */
    public static class AgableMob extends PathfinderMob {

        /**
         * Property representing the metadata field {@code BABY}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.16.2}</p>
         */
        public static final SimpleField<Boolean> BABY = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = PathfinderMob.SCHEMA.extend(EntityTypes.ABSTRACT_AGEABLE)
            .add(AgableMob.BABY)
            .build();

    }

    /**
     * Metadata properties for the {@code Ageable Water Creature} meta
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static class AgeableWaterCreature extends AgeableMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AgeableMob.SCHEMA.extend(EntityTypes.ABSTRACT_WATERMOB)
            .build();

    }

    /**
     * Metadata properties for the {@code Allay} meta
     * <p>Supported Versions: {@code 1.19+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Allay">Allay on the minecraft.wiki</a></p>
     */
    public static class Allay extends PathfinderMob {

        /**
         * Property representing the metadata field {@code CAN_DUPLICATE}
         *
         * <p>Supported Versions: {@code 1.19.1+}</p>
         */
        public static final SimpleField<Boolean> CAN_DUPLICATE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_19_1, ServerVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code DANCING}
         *
         * <p>Supported Versions: {@code 1.19.1+}</p>
         */
        public static final SimpleField<Boolean> DANCING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_19_1, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = PathfinderMob.SCHEMA.extend(EntityTypes.ALLAY)
            .add(Allay.CAN_DUPLICATE)
            .add(Allay.DANCING)
            .build();

    }

    /**
     * Metadata properties for the {@code Ambient Creature} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class AmbientCreature extends Mob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Mob.SCHEMA.extend(EntityTypes.ABSTRACT_AMBIENT)
            .build();

    }

    /**
     * Metadata properties for the {@code Area Effect Cloud} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Area_Effect_Cloud">Area Effect Cloud on the minecraft.wiki</a></p>
     */
    public static class AreaEffectCloud extends Entity {

        /**
         * Property representing the metadata field {@code COLOR}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.20.3}</p>
         */
        public static final SimpleField<Integer> COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 8, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_3, 9, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code PARTICLE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Particle<?>> PARTICLE = SimpleField.<Particle<?>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 10, EntityDataTypes.PARTICLE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_3, 11, EntityDataTypes.PARTICLE)
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_26_2, 10, EntityDataTypes.PARTICLE)
            .build();

        /**
         * Property representing the metadata field {@code RADIUS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Float> RADIUS = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code WAITING}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> WAITING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 9, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_3, 10, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_26_2, 9, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.AREA_EFFECT_CLOUD)
            .add(AreaEffectCloud.COLOR)
            .add(AreaEffectCloud.PARTICLE)
            .add(AreaEffectCloud.RADIUS)
            .add(AreaEffectCloud.WAITING)
            .build();

    }

    /**
     * Metadata properties for the {@code Armadillo} meta
     * <p>Supported Versions: {@code 1.20.5+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Armadillo">Armadillo on the minecraft.wiki</a></p>
     */
    public static class Armadillo extends Animal {

        /**
         * Property representing the metadata field {@code ARMADILLO_STATE}
         *
         * <p>Supported Versions: {@code 1.20.5+}</p>
         */
        public static final SimpleField<ArmadilloState> ARMADILLO_STATE = SimpleField.<ArmadilloState>builder()
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_1_21_11, 17, EntityDataTypes.ARMADILLO_STATE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.ARMADILLO_STATE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.ARMADILLO)
            .add(Armadillo.ARMADILLO_STATE)
            .build();

    }

    /**
     * Metadata properties for the {@code Armor Stand} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Armor_Stand">Armor Stand on the minecraft.wiki</a></p>
     */
    public static class ArmorStand extends LivingEntity {

        /**
         * Property representing the metadata field {@code BODY_POSE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Vector3f> BODY_POSE = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code CLIENT_FLAGS}
         *
         * <p>Wrapped by view: {@link ArmorStandClientFlagsView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Byte, ArmorStandClientFlagsView> CLIENT_FLAGS = ViewField.builder(ArmorStandClientFlagsView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 13, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 14, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 15, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code HEAD_POSE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Vector3f> HEAD_POSE = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code LEFT_ARM_POSE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Vector3f> LEFT_ARM_POSE = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 18, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code LEFT_LEG_POSE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Vector3f> LEFT_LEG_POSE = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 18, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 19, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 20, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code RIGHT_ARM_POSE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Vector3f> RIGHT_ARM_POSE = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 19, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code RIGHT_LEG_POSE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Vector3f> RIGHT_LEG_POSE = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 19, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 20, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 21, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = LivingEntity.SCHEMA.extend(EntityTypes.ARMOR_STAND)
            .add(ArmorStand.BODY_POSE)
            .add(ArmorStand.CLIENT_FLAGS)
            .add(ArmorStand.HEAD_POSE)
            .add(ArmorStand.LEFT_ARM_POSE)
            .add(ArmorStand.LEFT_LEG_POSE)
            .add(ArmorStand.RIGHT_ARM_POSE)
            .add(ArmorStand.RIGHT_LEG_POSE)
            .build();

    }

    /**
     * Metadata properties for the {@code Arrow} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Arrow">Arrow on the minecraft.wiki</a></p>
     */
    public static class Arrow extends AbstractArrow {

        /**
         * Property representing the metadata field {@code ID_EFFECT_COLOR}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> ID_EFFECT_COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_15, 10, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 9, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 10, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_26_2, 11, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractArrow.SCHEMA.extend(EntityTypes.ARROW)
            .add(Arrow.ID_EFFECT_COLOR)
            .build();

    }

    /**
     * Metadata properties for the {@code Axolotl} meta
     * <p>Supported Versions: {@code 1.17+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Axolotl">Axolotl on the minecraft.wiki</a></p>
     */
    public static class Axolotl extends Animal {

        /**
         * Property representing the metadata field {@code FROM_BUCKET}
         *
         * <p>Supported Versions: {@code 1.17+}</p>
         */
        public static final SimpleField<Boolean> FROM_BUCKET = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code PLAYING_DEAD}
         *
         * <p>Supported Versions: {@code 1.17+}</p>
         */
        public static final SimpleField<Boolean> PLAYING_DEAD = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Wrapped by view: {@link AxolotlVariantView}</p>
         * <p>Supported Versions: {@code 1.17+}</p>
         */
        public static final ViewField<Integer, AxolotlVariantView> VARIANT = ViewField.builder(AxolotlVariantView::new)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.AXOLOTL)
            .add(Axolotl.FROM_BUCKET)
            .add(Axolotl.PLAYING_DEAD)
            .add(Axolotl.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Bat} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Bat">Bat on the minecraft.wiki</a></p>
     */
    public static class Bat extends AmbientCreature {

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Wrapped by view: {@link BatFlagsView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Byte, BatFlagsView> FLAGS = ViewField.builder(BatFlagsView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AmbientCreature.SCHEMA.extend(EntityTypes.BAT)
            .add(Bat.FLAGS)
            .build();

    }

    /**
     * Metadata properties for the {@code Bee} meta
     * <p>Supported Versions: {@code 1.15+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Bee">Bee on the minecraft.wiki</a></p>
     */
    public static class Bee extends Animal {

        /**
         * Property representing the metadata field {@code ANGER_END_TIME}
         *
         * <p>Supported Versions: {@code 1.21.11+}</p>
         */
        public static final SimpleField<Long> ANGER_END_TIME = SimpleField.<Long>builder()
            .addVersionRange(ServerVersion.V_1_21_11, ServerVersion.V_1_21_11, 18, EntityDataTypes.LONG)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.LONG)
            .build();

        /**
         * Property representing the metadata field {@code ANGER_TIME}
         *
         * <p>Supported Versions: {@code 1.15}</p>
         */
        public static final SimpleField<Integer> ANGER_TIME = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_15, 17, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Wrapped by view: {@link BeeFlagsView}</p>
         * <p>Supported Versions: {@code 1.15+}</p>
         */
        public static final ViewField<Byte, BeeFlagsView> FLAGS = ViewField.builder(BeeFlagsView::new)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code REMAINING_ANGER_TIME}
         *
         * <p>Supported Versions: {@code 1.16 - 1.21.9}</p>
         */
        public static final SimpleField<Integer> REMAINING_ANGER_TIME = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_9, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.BEE)
            .add(Bee.ANGER_END_TIME)
            .add(Bee.ANGER_TIME)
            .add(Bee.FLAGS)
            .add(Bee.REMAINING_ANGER_TIME)
            .build();

    }

    /**
     * Metadata properties for the {@code Blaze} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Blaze">Blaze on the minecraft.wiki</a></p>
     */
    public static class Blaze extends Monster {

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Wrapped by view: {@link BlazeFlagsView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Byte, BlazeFlagsView> FLAGS = ViewField.builder(BlazeFlagsView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.BLAZE)
            .add(Blaze.FLAGS)
            .build();

    }

    /**
     * Metadata properties for the {@code Block Attached Entity} meta
     * <p>Supported Versions: {@code 1.21+}</p>
     */
    public static class BlockAttachedEntity extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Display} meta
     * <p>Supported Versions: {@code 1.19.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Display">Display on the minecraft.wiki</a></p>
     */
    public static class Display extends Entity {

        /**
         * Property representing the metadata field {@code BILLBOARD_RENDER_CONSTRAINTS}
         *
         * <p>Wrapped by view: {@link DisplayBillboardView}</p>
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final ViewField<Byte, DisplayBillboardView> BILLBOARD_RENDER_CONSTRAINTS = ViewField.builder(DisplayBillboardView::new)
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 14, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 15, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code BRIGHTNESS_OVERRIDE}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Integer> BRIGHTNESS_OVERRIDE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 16, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code GLOW_COLOR_OVERRIDE}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Integer> GLOW_COLOR_OVERRIDE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 21, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 22, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HEIGHT}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Float> HEIGHT = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 20, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 21, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code INTERPOLATION_DURATION}
         *
         * <p>Supported Versions: {@code 1.19.4}</p>
         */
        public static final SimpleField<Integer> INTERPOLATION_DURATION = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 9, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code INTERPOLATION_START_DELTA_TICKS}
         *
         * <p>Supported Versions: {@code 1.19.4}</p>
         */
        public static final SimpleField<Integer> INTERPOLATION_START_DELTA_TICKS = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 8, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code LEFT_ROTATION}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Quaternion4f> LEFT_ROTATION = SimpleField.<Quaternion4f>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 12, EntityDataTypes.QUATERNION)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_1_21_9, 13, EntityDataTypes.QUATERNION)
            .addVersionRange(ServerVersion.V_1_21_11, ServerVersion.V_26_2, 13, EntityDataTypes.QUATERNION)
            .build();

        /**
         * Property representing the metadata field {@code POS_ROT_INTERPOLATION_DURATION}
         *
         * <p>Supported Versions: {@code 1.20.2+}</p>
         */
        public static final SimpleField<Integer> POS_ROT_INTERPOLATION_DURATION = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 10, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code RIGHT_ROTATION}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Quaternion4f> RIGHT_ROTATION = SimpleField.<Quaternion4f>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 13, EntityDataTypes.QUATERNION)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_1_21_9, 14, EntityDataTypes.QUATERNION)
            .addVersionRange(ServerVersion.V_1_21_11, ServerVersion.V_26_2, 14, EntityDataTypes.QUATERNION)
            .build();

        /**
         * Property representing the metadata field {@code SCALE}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Vector3f> SCALE = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 11, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_1_21_9, 12, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_21_11, ServerVersion.V_26_2, 12, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code SHADOW_RADIUS}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Float> SHADOW_RADIUS = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 17, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 18, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code SHADOW_STRENGTH}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Float> SHADOW_STRENGTH = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 18, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 19, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code TRANSFORMATION_INTERPOLATION_DURATION}
         *
         * <p>Supported Versions: {@code 1.20.2+}</p>
         */
        public static final SimpleField<Integer> TRANSFORMATION_INTERPOLATION_DURATION = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 9, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code TRANSFORMATION_INTERPOLATION_START_DELTA_TICKS}
         *
         * <p>Supported Versions: {@code 1.20.2+}</p>
         */
        public static final SimpleField<Integer> TRANSFORMATION_INTERPOLATION_START_DELTA_TICKS = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 8, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code TRANSLATION}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Vector3f> TRANSLATION = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 10, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_1_21_9, 11, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_21_11, ServerVersion.V_26_2, 11, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code VIEW_RANGE}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Float> VIEW_RANGE = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 16, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 17, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code WIDTH}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Float> WIDTH = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 19, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 20, EntityDataTypes.FLOAT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.DISPLAY)
            .add(Display.BILLBOARD_RENDER_CONSTRAINTS)
            .add(Display.BRIGHTNESS_OVERRIDE)
            .add(Display.GLOW_COLOR_OVERRIDE)
            .add(Display.HEIGHT)
            .add(Display.INTERPOLATION_DURATION)
            .add(Display.INTERPOLATION_START_DELTA_TICKS)
            .add(Display.LEFT_ROTATION)
            .add(Display.POS_ROT_INTERPOLATION_DURATION)
            .add(Display.RIGHT_ROTATION)
            .add(Display.SCALE)
            .add(Display.SHADOW_RADIUS)
            .add(Display.SHADOW_STRENGTH)
            .add(Display.TRANSFORMATION_INTERPOLATION_DURATION)
            .add(Display.TRANSFORMATION_INTERPOLATION_START_DELTA_TICKS)
            .add(Display.TRANSLATION)
            .add(Display.VIEW_RANGE)
            .add(Display.WIDTH)
            .build();

    }

    /**
     * Metadata properties for the {@code Block Display} meta
     * <p>Supported Versions: {@code 1.19.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Block_Display">Block Display on the minecraft.wiki</a></p>
     */
    public static class BlockDisplay extends Display {

        /**
         * Property representing the metadata field {@code BLOCK_STATE}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Integer> BLOCK_STATE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 22, EntityDataTypes.BLOCK_STATE)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 23, EntityDataTypes.BLOCK_STATE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Display.SCHEMA.extend(EntityTypes.BLOCK_DISPLAY)
            .add(BlockDisplay.BLOCK_STATE)
            .build();

    }

    /**
     * Metadata properties for the {@code Boat} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Boat">Boat on the minecraft.wiki</a></p>
     */
    public static class Boat extends AbstractBoat {

        /**
         * Property representing the metadata field {@code BUBBLE_TIME}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21}</p>
         */
        public static final SimpleField<Integer> BUBBLE_TIME = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 13, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 14, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code DAMAGE}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.20.2}</p>
         */
        public static final SimpleField<Float> DAMAGE = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 9, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_2, 10, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code HURT}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.20.2}</p>
         */
        public static final SimpleField<Integer> HURT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_2, 8, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HURTDIR}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.20.2}</p>
         */
        public static final SimpleField<Integer> HURTDIR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 8, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_20_2, 9, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code PADDLE_LEFT}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21}</p>
         */
        public static final SimpleField<Boolean> PADDLE_LEFT = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 11, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code PADDLE_RIGHT}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21}</p>
         */
        public static final SimpleField<Boolean> PADDLE_RIGHT = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 12, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 13, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code TYPE}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21}</p>
         */
        public static final SimpleField<Integer> TYPE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 10, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 11, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractBoat.SCHEMA.extend(EntityTypes.BOAT)
            .add(Boat.BUBBLE_TIME)
            .add(Boat.DAMAGE)
            .add(Boat.HURT)
            .add(Boat.HURTDIR)
            .add(Boat.PADDLE_LEFT)
            .add(Boat.PADDLE_RIGHT)
            .add(Boat.TYPE)
            .build();

    }

    /**
     * Metadata properties for the {@code Bogged} meta
     * <p>Supported Versions: {@code 1.20.5+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Bogged">Bogged on the minecraft.wiki</a></p>
     */
    public static class Bogged extends AbstractSkeleton {

        /**
         * Property representing the metadata field {@code SHEARED}
         *
         * <p>Supported Versions: {@code 1.20.5+}</p>
         */
        public static final SimpleField<Boolean> SHEARED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSkeleton.SCHEMA.extend(EntityTypes.BOGGED)
            .add(Bogged.SHEARED)
            .build();

    }

    /**
     * Metadata properties for the {@code Breeze} meta
     * <p>Supported Versions: {@code 1.20.3+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Breeze">Breeze on the minecraft.wiki</a></p>
     */
    public static class Breeze extends Monster {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.BREEZE)
            .build();

    }

    /**
     * Metadata properties for the {@code Breeze Wind Charge} meta
     * <p>Supported Versions: {@code 1.20.5+}</p>
     */
    public static class BreezeWindCharge extends AbstractWindCharge {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractWindCharge.SCHEMA.extend(EntityTypes.BREEZE_WIND_CHARGE)
            .build();

    }

    /**
     * Metadata properties for the {@code Camel} meta
     * <p>Supported Versions: {@code 1.19.3+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Camel">Camel on the minecraft.wiki</a></p>
     */
    public static class Camel extends AbstractHorse {

        /**
         * Property representing the metadata field {@code DASH}
         *
         * <p>Supported Versions: {@code 1.19.3+}</p>
         */
        public static final SimpleField<Boolean> DASH = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_19_3, ServerVersion.V_1_19_3, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code LAST_POSE_CHANGE_TICK}
         *
         * <p>Supported Versions: {@code 1.19.3+}</p>
         */
        public static final SimpleField<Long> LAST_POSE_CHANGE_TICK = SimpleField.<Long>builder()
            .addVersionRange(ServerVersion.V_1_19_3, ServerVersion.V_1_19_3, 20, EntityDataTypes.LONG)
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_21_11, 19, EntityDataTypes.LONG)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.LONG)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHorse.SCHEMA.extend(EntityTypes.CAMEL)
            .add(Camel.DASH)
            .add(Camel.LAST_POSE_CHANGE_TICK)
            .build();

    }

    /**
     * Metadata properties for the {@code Camel Husk} meta
     * <p>Supported Versions: {@code 1.21.11+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Camel_Husk">Camel Husk on the minecraft.wiki</a></p>
     */
    public static class CamelHusk extends Camel {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Camel.SCHEMA.extend(EntityTypes.CAMEL_HUSK)
            .build();

    }

    /**
     * Metadata properties for the {@code Cat} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Cat">Cat on the minecraft.wiki</a></p>
     */
    public static class Cat extends TamableAnimal {

        /**
         * Property representing the metadata field {@code COLLAR_COLOR}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> COLLAR_COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 20, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 21, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 22, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 23, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code IS_LYING}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> IS_LYING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 20, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 21, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code RELAX_STATE_ONE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> RELAX_STATE_ONE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 20, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 21, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 22, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code SOUND_VARIANT}
         *
         * <p>Supported Versions: {@code 26.1+}</p>
         */
        public static final SimpleField<CatSoundVariant> SOUND_VARIANT = SimpleField.<CatSoundVariant>builder()
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 24, EntityDataTypes.CAT_SOUND_VARIANT)
            .build();

        /**
         * Property representing the metadata field {@code TYPE}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.17}</p>
         */
        public static final SimpleField<Integer> TYPE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_17, 19, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.19+}</p>
         */
        public static final SimpleField<CatVariant> VARIANT = SimpleField.<CatVariant>builder()
            .addVersionRange(ServerVersion.V_1_19, ServerVersion.V_1_20_3, 19, EntityDataTypes.TYPED_CAT_VARIANT)
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_1_21_11, 19, EntityDataTypes.TYPED_CAT_VARIANT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.TYPED_CAT_VARIANT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = TamableAnimal.SCHEMA.extend(EntityTypes.CAT)
            .add(Cat.COLLAR_COLOR)
            .add(Cat.IS_LYING)
            .add(Cat.RELAX_STATE_ONE)
            .add(Cat.SOUND_VARIANT)
            .add(Cat.TYPE)
            .add(Cat.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Spider} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Spider">Spider on the minecraft.wiki</a></p>
     */
    public static class Spider extends Monster {

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> FLAGS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.SPIDER)
            .add(Spider.FLAGS)
            .build();

    }

    /**
     * Metadata properties for the {@code Cave Spider} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Cave_Spider">Cave Spider on the minecraft.wiki</a></p>
     */
    public static class CaveSpider extends Spider {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Spider.SCHEMA.extend(EntityTypes.CAVE_SPIDER)
            .build();

    }

    /**
     * Metadata properties for the {@code Chest Boat} meta
     * <p>Supported Versions: {@code 1.19+}</p>
     */
    public static class ChestBoat extends AbstractChestBoat {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractChestBoat.SCHEMA.extend(EntityTypes.CHEST_BOAT)
            .build();

    }

    /**
     * Metadata properties for the {@code Chest Raft} meta
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static class ChestRaft extends AbstractChestBoat {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractChestBoat.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Chicken} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Chicken">Chicken on the minecraft.wiki</a></p>
     */
    public static class Chicken extends Animal {

        /**
         * Property representing the metadata field {@code SOUND_VARIANT}
         *
         * <p>Supported Versions: {@code 26.1+}</p>
         */
        public static final SimpleField<ChickenSoundVariant> SOUND_VARIANT = SimpleField.<ChickenSoundVariant>builder()
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.CHICKEN_SOUND_VARIANT)
            .build();

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.21.5+}</p>
         */
        public static final SimpleField<ChickenVariant> VARIANT = SimpleField.<ChickenVariant>builder()
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 17, EntityDataTypes.CHICKEN_VARIANT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.CHICKEN_VARIANT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.CHICKEN)
            .add(Chicken.SOUND_VARIANT)
            .add(Chicken.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Mannequin} meta
     * <p>Supported Versions: {@code 1.21.9+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Mannequin">Mannequin on the minecraft.wiki</a></p>
     */
    public static class Mannequin extends Avatar {

        /**
         * Property representing the metadata field {@code DESCRIPTION}
         *
         * <p>Supported Versions: {@code 1.21.9+}</p>
         */
        public static final SimpleField<Optional<Component>> DESCRIPTION = SimpleField.<Optional<Component>>builder()
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 19, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
            .build();

        /**
         * Property representing the metadata field {@code IMMOVABLE}
         *
         * <p>Supported Versions: {@code 1.21.9+}</p>
         */
        public static final SimpleField<Boolean> IMMOVABLE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code PROFILE}
         *
         * <p>Supported Versions: {@code 1.21.9+}</p>
         */
        public static final SimpleField<ItemProfile> PROFILE = SimpleField.<ItemProfile>builder()
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 17, EntityDataTypes.RESOLVABLE_PROFILE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Avatar.SCHEMA.extend(EntityTypes.MANNEQUIN)
            .add(Mannequin.DESCRIPTION)
            .add(Mannequin.IMMOVABLE)
            .add(Mannequin.PROFILE)
            .build();

    }

    /**
     * Metadata properties for the {@code Client Mannequin} meta
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static class ClientMannequin extends Mannequin {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Mannequin.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Cod} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Cod">Cod on the minecraft.wiki</a></p>
     */
    public static class Cod extends AbstractSchoolingFish {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSchoolingFish.SCHEMA.extend(EntityTypes.COD)
            .build();

    }

    /**
     * Metadata properties for the {@code Copper Golem} meta
     * <p>Supported Versions: {@code 1.21.9+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Copper_Golem">Copper Golem on the minecraft.wiki</a></p>
     */
    public static class CopperGolem extends AbstractGolem {

        /**
         * Property representing the metadata field {@code COPPER_GOLEM_STATE}
         *
         * <p>Supported Versions: {@code 1.21.9+}</p>
         */
        public static final SimpleField<CopperGolemState> COPPER_GOLEM_STATE = SimpleField.<CopperGolemState>builder()
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 17, EntityDataTypes.COPPER_GOLEM_STATE)
            .build();

        /**
         * Property representing the metadata field {@code WEATHER_STATE}
         *
         * <p>Supported Versions: {@code 1.21.9+}</p>
         */
        public static final SimpleField<WeatheringCopperState> WEATHER_STATE = SimpleField.<WeatheringCopperState>builder()
            .addVersionRange(ServerVersion.V_1_21_9, ServerVersion.V_26_2, 16, EntityDataTypes.WEATHERING_COPPER_STATE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractGolem.SCHEMA.extend(EntityTypes.COPPER_GOLEM)
            .add(CopperGolem.COPPER_GOLEM_STATE)
            .add(CopperGolem.WEATHER_STATE)
            .build();

    }

    /**
     * Metadata properties for the {@code Cow} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Cow">Cow on the minecraft.wiki</a></p>
     */
    public static class Cow extends AbstractCow {

        /**
         * Property representing the metadata field {@code SOUND_VARIANT}
         *
         * <p>Supported Versions: {@code 26.1+}</p>
         */
        public static final SimpleField<CowSoundVariant> SOUND_VARIANT = SimpleField.<CowSoundVariant>builder()
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.COW_SOUND_VARIANT)
            .build();

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.21.5+}</p>
         */
        public static final SimpleField<CowVariant> VARIANT = SimpleField.<CowVariant>builder()
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 17, EntityDataTypes.COW_VARIANT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.COW_VARIANT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractCow.SCHEMA.extend(EntityTypes.COW)
            .add(Cow.SOUND_VARIANT)
            .add(Cow.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Creaking} meta
     * <p>Supported Versions: {@code 1.21.2+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Creaking">Creaking on the minecraft.wiki</a></p>
     */
    public static class Creaking extends Monster {

        /**
         * Property representing the metadata field {@code CAN_MOVE}
         *
         * <p>Supported Versions: {@code 1.21.2+}</p>
         */
        public static final SimpleField<Boolean> CAN_MOVE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code HOME_POS}
         *
         * <p>Supported Versions: {@code 1.21.4+}</p>
         */
        public static final SimpleField<Optional<Vector3i>> HOME_POS = SimpleField.<Optional<Vector3i>>builder()
            .addVersionRange(ServerVersion.V_1_21_4, ServerVersion.V_26_2, 19, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
            .build();

        /**
         * Property representing the metadata field {@code IS_ACTIVE}
         *
         * <p>Supported Versions: {@code 1.21.2+}</p>
         */
        public static final SimpleField<Boolean> IS_ACTIVE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code IS_TEARING_DOWN}
         *
         * <p>Supported Versions: {@code 1.21.4+}</p>
         */
        public static final SimpleField<Boolean> IS_TEARING_DOWN = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_4, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.CREAKING)
            .add(Creaking.CAN_MOVE)
            .add(Creaking.HOME_POS)
            .add(Creaking.IS_ACTIVE)
            .add(Creaking.IS_TEARING_DOWN)
            .build();

    }

    /**
     * Metadata properties for the {@code Creaking Transient} meta
     * <p>Supported Versions: {@code 1.21.2}</p>
     */
    public static class CreakingTransient extends Creaking {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Creaking.SCHEMA.extend(EntityTypes.CREAKING_TRANSIENT)
            .build();

    }

    /**
     * Metadata properties for the {@code Creeper} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Creeper">Creeper on the minecraft.wiki</a></p>
     */
    public static class Creeper extends Monster {

        /**
         * Property representing the metadata field {@code IS_IGNITED}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> IS_IGNITED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code IS_POWERED}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> IS_POWERED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code SWELL_DIR}
         *
         * <p>Wrapped by view: {@link CreeperSwellStateView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Integer, CreeperSwellStateView> SWELL_DIR = ViewField.builder(CreeperSwellStateView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.CREEPER)
            .add(Creeper.IS_IGNITED)
            .add(Creeper.IS_POWERED)
            .add(Creeper.SWELL_DIR)
            .build();

    }

    /**
     * Metadata properties for the {@code Dolphin} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Dolphin">Dolphin on the minecraft.wiki</a></p>
     */
    public static class Dolphin extends AgeableWaterCreature {

        /**
         * Property representing the metadata field {@code GOT_FISH}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> GOT_FISH = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_1_21_4, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code MOISNTESS_LEVEL}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.15}</p>
         */
        public static final SimpleField<Integer> MOISNTESS_LEVEL = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_15, 17, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code MOISTNESS_LEVEL}
         *
         * <p>Supported Versions: {@code 1.16+}</p>
         */
        public static final SimpleField<Integer> MOISTNESS_LEVEL = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_1_21_4, 19, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code TREASURE_POS}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.4}</p>
         */
        public static final SimpleField<Vector3i> TREASURE_POS = SimpleField.<Vector3i>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 16, EntityDataTypes.BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_1_21_4, 17, EntityDataTypes.BLOCK_POSITION)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AgeableWaterCreature.SCHEMA.extend(EntityTypes.DOLPHIN)
            .add(Dolphin.GOT_FISH)
            .add(Dolphin.MOISNTESS_LEVEL)
            .add(Dolphin.MOISTNESS_LEVEL)
            .add(Dolphin.TREASURE_POS)
            .build();

    }

    /**
     * Metadata properties for the {@code Donkey} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Donkey">Donkey on the minecraft.wiki</a></p>
     */
    public static class Donkey extends AbstractChestedHorse {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractChestedHorse.SCHEMA.extend(EntityTypes.DONKEY)
            .build();

    }

    /**
     * Metadata properties for the {@code Dragon Fireball} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Dragon_Fireball">Dragon Fireball on the minecraft.wiki</a></p>
     */
    public static class DragonFireball extends AbstractHurtingProjectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHurtingProjectile.SCHEMA.extend(EntityTypes.DRAGON_FIREBALL)
            .build();

    }

    /**
     * Metadata properties for the {@code Zombie} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Zombie">Zombie on the minecraft.wiki</a></p>
     */
    public static class Zombie extends Monster {

        /**
         * Property representing the metadata field {@code BABY}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> BABY = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code DROWNED_CONVERSION}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> DROWNED_CONVERSION = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code SPECIAL_TYPE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> SPECIAL_TYPE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.ZOMBIE)
            .add(Zombie.BABY)
            .add(Zombie.DROWNED_CONVERSION)
            .add(Zombie.SPECIAL_TYPE)
            .build();

    }

    /**
     * Metadata properties for the {@code Drowned} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Drowned">Drowned on the minecraft.wiki</a></p>
     */
    public static class Drowned extends Zombie {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Zombie.SCHEMA.extend(EntityTypes.DROWNED)
            .build();

    }

    /**
     * Metadata properties for the {@code Guardian} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Guardian">Guardian on the minecraft.wiki</a></p>
     */
    public static class Guardian extends Monster {

        /**
         * Property representing the metadata field {@code ATTACK_TARGET}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> ATTACK_TARGET = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code MOVING}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> MOVING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.GUARDIAN)
            .add(Guardian.ATTACK_TARGET)
            .add(Guardian.MOVING)
            .build();

    }

    /**
     * Metadata properties for the {@code Elder Guardian} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Elder_Guardian">Elder Guardian on the minecraft.wiki</a></p>
     */
    public static class ElderGuardian extends Guardian {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Guardian.SCHEMA.extend(EntityTypes.ELDER_GUARDIAN)
            .build();

    }

    /**
     * Metadata properties for the {@code End Crystal} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#End_Crystal">End Crystal on the minecraft.wiki</a></p>
     */
    public static class EndCrystal extends Entity {

        /**
         * Property representing the metadata field {@code BEAM_TARGET}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Optional<Vector3i>> BEAM_TARGET = SimpleField.<Optional<Vector3i>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
            .build();

        /**
         * Property representing the metadata field {@code SHOW_BOTTOM}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> SHOW_BOTTOM = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 8, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 9, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.END_CRYSTAL)
            .add(EndCrystal.BEAM_TARGET)
            .add(EndCrystal.SHOW_BOTTOM)
            .build();

    }

    /**
     * Metadata properties for the {@code Ender Dragon} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Ender_Dragon">Ender Dragon on the minecraft.wiki</a></p>
     */
    public static class EnderDragon extends Mob {

        /**
         * Property representing the metadata field {@code PHASE}
         *
         * <p>Wrapped by view: {@link EnderDragonPhaseView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Integer, EnderDragonPhaseView> PHASE = ViewField.builder(EnderDragonPhaseView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Mob.SCHEMA.extend(EntityTypes.ENDER_DRAGON)
            .add(EnderDragon.PHASE)
            .build();

    }

    /**
     * Metadata properties for the {@code Ender Dragon Part} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class EnderDragonPart extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Ender Man} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class EnderMan extends Monster {

        /**
         * Property representing the metadata field {@code CARRY_STATE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> CARRY_STATE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.OPTIONAL_BLOCK_STATE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.OPTIONAL_BLOCK_STATE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
            .build();

        /**
         * Property representing the metadata field {@code CREEPY}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> CREEPY = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code STARED_AT}
         *
         * <p>Supported Versions: {@code 1.15+}</p>
         */
        public static final SimpleField<Boolean> STARED_AT = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.ENDERMAN)
            .add(EnderMan.CARRY_STATE)
            .add(EnderMan.CREEPY)
            .add(EnderMan.STARED_AT)
            .build();

    }

    /**
     * Metadata properties for the {@code Endermite} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Endermite">Endermite on the minecraft.wiki</a></p>
     */
    public static class Endermite extends Monster {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.ENDERMITE)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Living Base} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityLivingBase extends Entity {

        /**
         * Property representing the metadata field {@code ARROW_COUNT_IN_ENTITY}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> ARROW_COUNT_IN_ENTITY = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 9, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 10, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HAND_STATES}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> HAND_STATES = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code HEALTH}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Float> HEALTH = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 6, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 7, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code HIDE_PARTICLES}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> HIDE_PARTICLES = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 8, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 9, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code POTION_EFFECTS}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> POTION_EFFECTS = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 7, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 8, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityLivingBase.ARROW_COUNT_IN_ENTITY)
            .add(EntityLivingBase.HAND_STATES)
            .add(EntityLivingBase.HEALTH)
            .add(EntityLivingBase.HIDE_PARTICLES)
            .add(EntityLivingBase.POTION_EFFECTS)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Living} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityLiving extends EntityLivingBase {

        /**
         * Property representing the metadata field {@code AI_FLAGS}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> AI_FLAGS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 10, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 11, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityLivingBase.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityLiving.AI_FLAGS)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Creature} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityCreature extends EntityLiving {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityLiving.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Ageable} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityAgeable extends EntityCreature {

        /**
         * Property representing the metadata field {@code BABY}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> BABY = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityCreature.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityAgeable.BABY)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Ambient Creature} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityAmbientCreature extends EntityLiving {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityLiving.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Animal} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityAnimal extends EntityAgeable {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAgeable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Area Effect Cloud} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityAreaEffectCloud extends Entity {

        /**
         * Property representing the metadata field {@code COLOR}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 6, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 7, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code IGNORE_RADIUS}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> IGNORE_RADIUS = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 7, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 8, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code PARTICLE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> PARTICLE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 8, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 9, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code PARTICLE_PARAM_1}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<Integer> PARTICLE_PARAM_1 = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 10, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code PARTICLE_PARAM_2}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<Integer> PARTICLE_PARAM_2 = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 11, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code RADIUS}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Float> RADIUS = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.FLOAT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityAreaEffectCloud.COLOR)
            .add(EntityAreaEffectCloud.IGNORE_RADIUS)
            .add(EntityAreaEffectCloud.PARTICLE)
            .add(EntityAreaEffectCloud.PARTICLE_PARAM_1)
            .add(EntityAreaEffectCloud.PARTICLE_PARAM_2)
            .add(EntityAreaEffectCloud.RADIUS)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Armor Stand} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityArmorStand extends EntityLivingBase {

        /**
         * Property representing the metadata field {@code BODY_ROTATION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Vector3f> BODY_ROTATION = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code HEAD_ROTATION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Vector3f> HEAD_ROTATION = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code LEFT_ARM_ROTATION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Vector3f> LEFT_ARM_ROTATION = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 13, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code LEFT_LEG_ROTATION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Vector3f> LEFT_LEG_ROTATION = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 15, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 16, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code RIGHT_ARM_ROTATION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Vector3f> RIGHT_ARM_ROTATION = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 14, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 15, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code RIGHT_LEG_ROTATION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Vector3f> RIGHT_LEG_ROTATION = SimpleField.<Vector3f>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 16, EntityDataTypes.VECTOR3F)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 17, EntityDataTypes.VECTOR3F)
            .build();

        /**
         * Property representing the metadata field {@code STATUS}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> STATUS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 10, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 11, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityLivingBase.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityArmorStand.BODY_ROTATION)
            .add(EntityArmorStand.HEAD_ROTATION)
            .add(EntityArmorStand.LEFT_ARM_ROTATION)
            .add(EntityArmorStand.LEFT_LEG_ROTATION)
            .add(EntityArmorStand.RIGHT_ARM_ROTATION)
            .add(EntityArmorStand.RIGHT_LEG_ROTATION)
            .add(EntityArmorStand.STATUS)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Arrow} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityArrow extends Entity {

        /**
         * Property representing the metadata field {@code CRITICAL}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> CRITICAL = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityArrow.CRITICAL)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Bat} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityBat extends EntityAmbientCreature {

        /**
         * Property representing the metadata field {@code HANGING}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> HANGING = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAmbientCreature.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityBat.HANGING)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Mob} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMob extends EntityCreature {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityCreature.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Blaze} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityBlaze extends EntityMob {

        /**
         * Property representing the metadata field {@code ON_FIRE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> ON_FIRE = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityBlaze.ON_FIRE)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Boat} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityBoat extends Entity {

        /**
         * Property representing the metadata field {@code BOAT_TYPE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> BOAT_TYPE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 8, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 9, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code DAMAGE_TAKEN}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Float> DAMAGE_TAKEN = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 7, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 8, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code FORWARD_DIRECTION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> FORWARD_DIRECTION = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 6, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 7, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code TIME_SINCE_HIT}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> TIME_SINCE_HIT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityBoat.BOAT_TYPE)
            .add(EntityBoat.DAMAGE_TAKEN)
            .add(EntityBoat.FORWARD_DIRECTION)
            .add(EntityBoat.TIME_SINCE_HIT)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Spider} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySpider extends EntityMob {

        /**
         * Property representing the metadata field {@code CLIMBING}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> CLIMBING = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntitySpider.CLIMBING)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Cave Spider} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityCaveSpider extends EntitySpider {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntitySpider.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Chicken} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityChicken extends EntityAnimal {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAnimal.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Cow} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityCow extends EntityAnimal {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAnimal.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Creeper} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityCreeper extends EntityMob {

        /**
         * Property representing the metadata field {@code IGNITED}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> IGNITED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 13, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code POWERED}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> POWERED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code STATE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> STATE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityCreeper.IGNITED)
            .add(EntityCreeper.POWERED)
            .add(EntityCreeper.STATE)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Donkey} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityDonkey extends AbstractChestHorse {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractChestHorse.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Dragon} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityDragon extends EntityLiving {

        /**
         * Property representing the metadata field {@code PHASE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> PHASE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityLiving.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityDragon.PHASE)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Fireball} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityFireball extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Dragon Fireball} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityDragonFireball extends EntityFireball {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityFireball.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Dragon Part} meta
     * <p>Supported Versions: {@code 1.11.2-}</p>
     */
    public static class EntityDragonPart extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Throwable} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityThrowable extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Egg} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityEgg extends EntityThrowable {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityThrowable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Guardian} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityGuardian extends EntityMob {

        /**
         * Property representing the metadata field {@code MOVING}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Boolean> MOVING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code STATUS}
         *
         * <p>Supported Versions: {@code 1.10-}</p>
         */
        public static final SimpleField<Byte> STATUS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code TARGET_ENTITY}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> TARGET_ENTITY = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_12, 12, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityGuardian.MOVING)
            .add(EntityGuardian.STATUS)
            .add(EntityGuardian.TARGET_ENTITY)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Elder Guardian} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityElderGuardian extends EntityGuardian {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityGuardian.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Ender Crystal} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityEnderCrystal extends Entity {

        /**
         * Property representing the metadata field {@code SHOW_BOTTOM}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> SHOW_BOTTOM = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityEnderCrystal.SHOW_BOTTOM)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Ender Eye} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityEnderEye extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Ender Pearl} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityEnderPearl extends EntityThrowable {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityThrowable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Enderman} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityEnderman extends EntityMob {

        /**
         * Property representing the metadata field {@code SCREAMING}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> SCREAMING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityEnderman.SCREAMING)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Endermite} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityEndermite extends EntityMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Spellcaster Illager} meta
     * <p>Supported Versions: {@code 1.12 - 1.12.2}</p>
     */
    public static class EntitySpellcasterIllager extends AbstractIllager {

        /**
         * Property representing the metadata field {@code SPELL}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Byte> SPELL = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractIllager.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntitySpellcasterIllager.SPELL)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Evoker} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityEvoker extends EntitySpellcasterIllager {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntitySpellcasterIllager.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Evoker Fangs} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityEvokerFangs extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Exp Bottle} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityExpBottle extends EntityThrowable {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityThrowable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Falling Block} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityFallingBlock extends Entity {

        /**
         * Property representing the metadata field {@code ORIGIN}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Vector3i> ORIGIN = SimpleField.<Vector3i>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.BLOCK_POSITION)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityFallingBlock.ORIGIN)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Firework Rocket} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityFireworkRocket extends Entity {

        /**
         * Property representing the metadata field {@code BOOSTED_ENTITY}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Integer> BOOSTED_ENTITY = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 7, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code FIREWORK_ITEM}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<ItemStack> FIREWORK_ITEM = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityFireworkRocket.BOOSTED_ENTITY)
            .add(EntityFireworkRocket.FIREWORK_ITEM)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Fish Hook} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityFishHook extends Entity {

        /**
         * Property representing the metadata field {@code HOOKED_ENTITY}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> HOOKED_ENTITY = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityFishHook.HOOKED_ENTITY)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Flying} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityFlying extends EntityLiving {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityLiving.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Ghast} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityGhast extends EntityFlying {

        /**
         * Property representing the metadata field {@code ATTACKING}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> ATTACKING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityFlying.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityGhast.ATTACKING)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Giant Zombie} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityGiantZombie extends EntityMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Golem} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityGolem extends EntityCreature {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityCreature.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Hanging} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityHanging extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Horse} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityHorse extends AbstractHorse {

        /**
         * Property representing the metadata field {@code HORSE_ARMOR}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> HORSE_ARMOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_12_2, 15, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HORSE_TYPE}
         *
         * <p>Supported Versions: {@code 1.10-}</p>
         */
        public static final SimpleField<Integer> HORSE_TYPE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 13, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HORSE_VARIANT}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> HORSE_VARIANT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_12_2, 14, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code STATUS}
         *
         * <p>Supported Versions: {@code 1.10-}</p>
         */
        public static final SimpleField<Byte> STATUS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHorse.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityHorse.HORSE_ARMOR)
            .add(EntityHorse.HORSE_TYPE)
            .add(EntityHorse.HORSE_VARIANT)
            .add(EntityHorse.STATUS)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Zombie} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityZombie extends EntityMob {

        /**
         * Property representing the metadata field {@code ARMS_RAISED}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> ARMS_RAISED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_12_2, 14, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code CONVERTING}
         *
         * <p>Supported Versions: {@code 1.10-}</p>
         */
        public static final SimpleField<Boolean> CONVERTING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 13, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code IS_CHILD}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> IS_CHILD = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code VILLAGER_TYPE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> VILLAGER_TYPE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityZombie.ARMS_RAISED)
            .add(EntityZombie.CONVERTING)
            .add(EntityZombie.IS_CHILD)
            .add(EntityZombie.VILLAGER_TYPE)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Husk} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityHusk extends EntityZombie {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityZombie.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Illusion Illager} meta
     * <p>Supported Versions: {@code 1.12 - 1.12.2}</p>
     */
    public static class EntityIllusionIllager extends EntitySpellcasterIllager {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntitySpellcasterIllager.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Iron Golem} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityIronGolem extends EntityGolem {

        /**
         * Property representing the metadata field {@code PLAYER_CREATED}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> PLAYER_CREATED = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityGolem.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityIronGolem.PLAYER_CREATED)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Item} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityItem extends Entity {

        /**
         * Property representing the metadata field {@code ITEM}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<ItemStack> ITEM = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityItem.ITEM)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Item Frame} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityItemFrame extends EntityHanging {

        /**
         * Property representing the metadata field {@code ITEM}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<ItemStack> ITEM = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * Property representing the metadata field {@code ROTATION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> ROTATION = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 7, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityHanging.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityItemFrame.ITEM)
            .add(EntityItemFrame.ROTATION)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Large Fireball} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityLargeFireball extends EntityFireball {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityFireball.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Leash Knot} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityLeashKnot extends EntityHanging {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityHanging.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Weather Effect} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityWeatherEffect extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Lightning Bolt} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityLightningBolt extends EntityWeatherEffect {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityWeatherEffect.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Llama} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityLlama extends AbstractChestHorse {

        /**
         * Property representing the metadata field {@code COLOR}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Integer> COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 16, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code STRENGTH}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Integer> STRENGTH = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 15, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Integer> VARIANT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 17, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractChestHorse.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityLlama.COLOR)
            .add(EntityLlama.STRENGTH)
            .add(EntityLlama.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Llama Spit} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityLlamaSpit extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Slime} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySlime extends EntityLiving {

        /**
         * Property representing the metadata field {@code SLIME_SIZE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> SLIME_SIZE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityLiving.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntitySlime.SLIME_SIZE)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Magma Cube} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMagmaCube extends EntitySlime {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntitySlime.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Minecart} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMinecart extends Entity {

        /**
         * Property representing the metadata field {@code DAMAGE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Float> DAMAGE = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 7, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 8, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code DISPLAY_TILE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> DISPLAY_TILE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 8, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 9, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code DISPLAY_TILE_OFFSET}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> DISPLAY_TILE_OFFSET = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 9, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 10, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code ROLLING_AMPLITUDE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> ROLLING_AMPLITUDE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code ROLLING_DIRECTION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> ROLLING_DIRECTION = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 6, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 7, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code SHOW_BLOCK}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> SHOW_BLOCK = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 10, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 11, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityMinecart.DAMAGE)
            .add(EntityMinecart.DISPLAY_TILE)
            .add(EntityMinecart.DISPLAY_TILE_OFFSET)
            .add(EntityMinecart.ROLLING_AMPLITUDE)
            .add(EntityMinecart.ROLLING_DIRECTION)
            .add(EntityMinecart.SHOW_BLOCK)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Minecart Container} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMinecartContainer extends EntityMinecart {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMinecart.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Minecart Chest} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMinecartChest extends EntityMinecartContainer {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMinecartContainer.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Minecart Command Block} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMinecartCommandBlock extends EntityMinecart {

        /**
         * Property representing the metadata field {@code COMMAND}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<String> COMMAND = SimpleField.<String>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.STRING)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.STRING)
            .build();

        /**
         * Property representing the metadata field {@code LAST_OUTPUT}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Object> LAST_OUTPUT = SimpleField.<Object>builder()
            // TODO type changed from 'ITextComponent' to 'ITextComponent', converter required
            // TODO type changed from 'ITextComponent' to 'ITextComponent', converter required
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMinecart.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityMinecartCommandBlock.COMMAND)
            .add(EntityMinecartCommandBlock.LAST_OUTPUT)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Minecart Empty} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMinecartEmpty extends EntityMinecart {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMinecart.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Minecart Furnace} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMinecartFurnace extends EntityMinecart {

        /**
         * Property representing the metadata field {@code POWERED}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> POWERED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMinecart.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityMinecartFurnace.POWERED)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Minecart Hopper} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMinecartHopper extends EntityMinecartContainer {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMinecartContainer.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Minecart Mob Spawner} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMinecartMobSpawner extends EntityMinecart {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMinecart.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Minecart T N T} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMinecartTNT extends EntityMinecart {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMinecart.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Mooshroom} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityMooshroom extends EntityCow {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityCow.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Mule} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityMule extends AbstractChestHorse {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractChestHorse.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Tameable} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityTameable extends EntityAnimal {

        /**
         * Property representing the metadata field {@code TAMED}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> TAMED = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAnimal.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityTameable.TAMED)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Ocelot} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityOcelot extends EntityTameable {

        /**
         * Property representing the metadata field {@code OCELOT_VARIANT}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> OCELOT_VARIANT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 13, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityTameable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityOcelot.OCELOT_VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Other Player M P} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityOtherPlayerMP extends AbstractClientPlayer {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractClientPlayer.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Painting} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityPainting extends EntityHanging {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityHanging.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Shoulder Riding} meta
     * <p>Supported Versions: {@code 1.12 - 1.12.2}</p>
     */
    public static class EntityShoulderRiding extends EntityTameable {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityTameable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Parrot} meta
     * <p>Supported Versions: {@code 1.12 - 1.12.2}</p>
     */
    public static class EntityParrot extends EntityShoulderRiding {

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Integer> VARIANT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityShoulderRiding.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityParrot.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Pig} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityPig extends EntityAnimal {

        /**
         * Property representing the metadata field {@code BOOST_TIME}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Integer> BOOST_TIME = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code SADDLED}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> SADDLED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAnimal.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityPig.BOOST_TIME)
            .add(EntityPig.SADDLED)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Pig Zombie} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityPigZombie extends EntityZombie {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityZombie.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Player} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityPlayer extends EntityLivingBase {

        /**
         * Property representing the metadata field {@code ABSORPTION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Float> ABSORPTION = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 10, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 11, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code LEFT_SHOULDER_ENTITY}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Object> LEFT_SHOULDER_ENTITY = SimpleField.<Object>builder()
            // TODO type changed from 'NBTTagCompound' to 'NBTTagCompound', converter required
            .build();

        /**
         * Property representing the metadata field {@code MAIN_HAND}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> MAIN_HAND = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 13, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code PLAYER_MODEL_FLAG}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> PLAYER_MODEL_FLAG = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code PLAYER_SCORE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> PLAYER_SCORE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code RIGHT_SHOULDER_ENTITY}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Object> RIGHT_SHOULDER_ENTITY = SimpleField.<Object>builder()
            // TODO type changed from 'NBTTagCompound' to 'NBTTagCompound', converter required
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityLivingBase.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityPlayer.ABSORPTION)
            .add(EntityPlayer.LEFT_SHOULDER_ENTITY)
            .add(EntityPlayer.MAIN_HAND)
            .add(EntityPlayer.PLAYER_MODEL_FLAG)
            .add(EntityPlayer.PLAYER_SCORE)
            .add(EntityPlayer.RIGHT_SHOULDER_ENTITY)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Player M P} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityPlayerMP extends EntityPlayer {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityPlayer.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Player S P} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityPlayerSP extends AbstractClientPlayer {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractClientPlayer.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Polar Bear} meta
     * <p>Supported Versions: {@code 1.10 - 1.12.2}</p>
     */
    public static class EntityPolarBear extends EntityAnimal {

        /**
         * Property representing the metadata field {@code IS_STANDING}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<Boolean> IS_STANDING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAnimal.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityPolarBear.IS_STANDING)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Potion} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityPotion extends EntityThrowable {

        /**
         * Property representing the metadata field {@code ITEM}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<ItemStack> ITEM = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityThrowable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityPotion.ITEM)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Rabbit} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityRabbit extends EntityAnimal {

        /**
         * Property representing the metadata field {@code RABBIT_TYPE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> RABBIT_TYPE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAnimal.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityRabbit.RABBIT_TYPE)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Sheep} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySheep extends EntityAnimal {

        /**
         * Property representing the metadata field {@code DYE_COLOR}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> DYE_COLOR = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAnimal.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntitySheep.DYE_COLOR)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Shulker} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityShulker extends EntityGolem {

        /**
         * Property representing the metadata field {@code ATTACHED_FACE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Object> ATTACHED_FACE = SimpleField.<Object>builder()
            // TODO type changed from 'EnumFacing' to 'EnumFacing', converter required
            // TODO type changed from 'EnumFacing' to 'EnumFacing', converter required
            .build();

        /**
         * Property representing the metadata field {@code COLOR}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Byte> COLOR = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code PEEK_TICK}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> PEEK_TICK = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityGolem.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityShulker.ATTACHED_FACE)
            .add(EntityShulker.COLOR)
            .add(EntityShulker.PEEK_TICK)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Shulker Bullet} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityShulkerBullet extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Silverfish} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySilverfish extends EntityMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Skeleton} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySkeleton extends AbstractSkeleton {

        /**
         * Property representing the metadata field {@code SKELETON_VARIANT}
         *
         * <p>Supported Versions: {@code 1.10-}</p>
         */
        public static final SimpleField<Integer> SKELETON_VARIANT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code SWINGING_ARMS}
         *
         * <p>Supported Versions: {@code 1.10-}</p>
         */
        public static final SimpleField<Boolean> SWINGING_ARMS = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSkeleton.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntitySkeleton.SKELETON_VARIANT)
            .add(EntitySkeleton.SWINGING_ARMS)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Skeleton Horse} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntitySkeletonHorse extends AbstractHorse {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHorse.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Small Fireball} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySmallFireball extends EntityFireball {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityFireball.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Snowball} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySnowball extends EntityThrowable {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityThrowable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Snowman} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySnowman extends EntityGolem {

        /**
         * Property representing the metadata field {@code PUMPKIN_EQUIPPED}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Byte> PUMPKIN_EQUIPPED = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityGolem.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntitySnowman.PUMPKIN_EQUIPPED)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Spectral Arrow} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySpectralArrow extends EntityArrow {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityArrow.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Water Mob} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityWaterMob extends EntityLiving {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityLiving.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Squid} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntitySquid extends EntityWaterMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityWaterMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Stray} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityStray extends AbstractSkeleton {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSkeleton.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity T N T Primed} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityTNTPrimed extends Entity {

        /**
         * Property representing the metadata field {@code FUSE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> FUSE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityTNTPrimed.FUSE)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Tipped Arrow} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityTippedArrow extends EntityArrow {

        /**
         * Property representing the metadata field {@code COLOR}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 6, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 7, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityArrow.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityTippedArrow.COLOR)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Vex} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityVex extends EntityMob {

        /**
         * Property representing the metadata field {@code VEX_FLAGS}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Byte> VEX_FLAGS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityVex.VEX_FLAGS)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Villager} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityVillager extends EntityAgeable {

        /**
         * Property representing the metadata field {@code PROFESSION}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> PROFESSION = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityAgeable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityVillager.PROFESSION)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Vindicator} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityVindicator extends AbstractIllager {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractIllager.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Witch} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityWitch extends EntityMob {

        /**
         * Property representing the metadata field {@code IS_AGGRESSIVE}
         *
         * <p>Supported Versions: {@code 1.12-}</p>
         */
        public static final SimpleField<Boolean> IS_AGGRESSIVE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code IS_DRINKING}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Boolean> IS_DRINKING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityWitch.IS_AGGRESSIVE)
            .add(EntityWitch.IS_DRINKING)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Wither} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityWither extends EntityMob {

        /**
         * Property representing the metadata field {@code FIRST_HEAD_TARGET}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> FIRST_HEAD_TARGET = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 11, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 12, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code INVULNERABILITY_TIME}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> INVULNERABILITY_TIME = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 14, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 15, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code SECOND_HEAD_TARGET}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> SECOND_HEAD_TARGET = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 12, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 13, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code THIRD_HEAD_TARGET}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> THIRD_HEAD_TARGET = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 13, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityMob.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityWither.FIRST_HEAD_TARGET)
            .add(EntityWither.INVULNERABILITY_TIME)
            .add(EntityWither.SECOND_HEAD_TARGET)
            .add(EntityWither.THIRD_HEAD_TARGET)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Wither Skeleton} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityWitherSkeleton extends AbstractSkeleton {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSkeleton.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Wither Skull} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityWitherSkull extends EntityFireball {

        /**
         * Property representing the metadata field {@code INVULNERABLE}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> INVULNERABLE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 5, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 6, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityFireball.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityWitherSkull.INVULNERABLE)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Wolf} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityWolf extends EntityTameable {

        /**
         * Property representing the metadata field {@code BEGGING}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Boolean> BEGGING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 14, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 15, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code COLLAR_COLOR}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Integer> COLLAR_COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 16, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HEALTH}
         *
         * <p>Supported Versions: {@code 1.12.2-}</p>
         */
        public static final SimpleField<Float> HEALTH = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_9_4, ServerVersion.V_1_10, 13, EntityDataTypes.FLOAT)
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 14, EntityDataTypes.FLOAT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityTameable.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityWolf.BEGGING)
            .add(EntityWolf.COLLAR_COLOR)
            .add(EntityWolf.HEALTH)
            .build();

    }

    /**
     * Metadata properties for the {@code Entity X P Orb} meta
     * <p>Supported Versions: {@code 1.12.2-}</p>
     */
    public static class EntityXPOrb extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Zombie Horse} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityZombieHorse extends AbstractHorse {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHorse.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Entity Zombie Villager} meta
     * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
     */
    public static class EntityZombieVillager extends EntityZombie {

        /**
         * Property representing the metadata field {@code CONVERTING}
         *
         * <p>Supported Versions: {@code 1.11.2 - 1.12.2}</p>
         */
        public static final SimpleField<Boolean> CONVERTING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_11_2, ServerVersion.V_1_12_2, 15, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code PROFESSION}
         *
         * <p>Supported Versions: {@code 1.12.2}</p>
         */
        public static final SimpleField<Integer> PROFESSION = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_12_2, ServerVersion.V_1_12_2, 16, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = EntityZombie.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(EntityZombieVillager.CONVERTING)
            .add(EntityZombieVillager.PROFESSION)
            .build();

    }

    /**
     * Metadata properties for the {@code Spellcaster Illager} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Spellcaster_Illager">Spellcaster Illager on the minecraft.wiki</a></p>
     */
    public static class SpellcasterIllager extends AbstractIllager {

        /**
         * Property representing the metadata field {@code SPELL_CASTING}
         *
         * <p>Wrapped by view: {@link SpellcasterIllagerSpellCastingView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Byte, SpellcasterIllagerSpellCastingView> SPELL_CASTING = ViewField.builder(SpellcasterIllagerSpellCastingView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractIllager.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(SpellcasterIllager.SPELL_CASTING)
            .build();

    }

    /**
     * Metadata properties for the {@code Evoker} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Evoker">Evoker on the minecraft.wiki</a></p>
     */
    public static class Evoker extends SpellcasterIllager {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = SpellcasterIllager.SCHEMA.extend(EntityTypes.EVOKER)
            .build();

    }

    /**
     * Metadata properties for the {@code Evoker Fangs} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Evoker_Fangs">Evoker Fangs on the minecraft.wiki</a></p>
     */
    public static class EvokerFangs extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.EVOKER_FANGS)
            .build();

    }

    /**
     * Metadata properties for the {@code Experience Orb} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Experience_Orb">Experience Orb on the minecraft.wiki</a></p>
     */
    public static class ExperienceOrb extends Entity {

        /**
         * Property representing the metadata field {@code VALUE}
         *
         * <p>Supported Versions: {@code 1.21.5+}</p>
         */
        public static final SimpleField<Integer> VALUE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_26_2, 8, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.EXPERIENCE_ORB)
            .add(ExperienceOrb.VALUE)
            .build();

    }

    /**
     * Metadata properties for the {@code Eye Of Ender} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class EyeOfEnder extends Entity {

        /**
         * Property representing the metadata field {@code ITEM_STACK}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<ItemStack> ITEM_STACK = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.ITEMSTACK)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.EYE_OF_ENDER)
            .add(EyeOfEnder.ITEM_STACK)
            .build();

    }

    /**
     * Metadata properties for the {@code Falling Block Entity} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class FallingBlockEntity extends Entity {

        /**
         * Property representing the metadata field {@code START_POS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Vector3i> START_POS = SimpleField.<Vector3i>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.BLOCK_POSITION)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.FALLING_BLOCK)
            .add(FallingBlockEntity.START_POS)
            .build();

    }

    /**
     * Metadata properties for the {@code Fireball} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Fireball">Fireball on the minecraft.wiki</a></p>
     */
    public static class Fireball extends AbstractHurtingProjectile {

        /**
         * Property representing the metadata field {@code ITEM_STACK}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<ItemStack> ITEM_STACK = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.ITEMSTACK)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHurtingProjectile.SCHEMA.extend(EntityTypes.FIREBALL)
            .add(Fireball.ITEM_STACK)
            .build();

    }

    /**
     * Metadata properties for the {@code Firework Rocket Entity} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class FireworkRocketEntity extends Projectile {

        /**
         * Property representing the metadata field {@code ATTACHED_TO_TARGET}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Optional<Integer>> ATTACHED_TO_TARGET = SimpleField.<Optional<Integer>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 8, EntityDataTypes.OPTIONAL_INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 9, EntityDataTypes.OPTIONAL_INT)
            .build();

        /**
         * Property representing the metadata field {@code FIREWORKS_ITEM}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<ItemStack> FIREWORKS_ITEM = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.ITEMSTACK)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * Property representing the metadata field {@code SHOT_AT_ANGLE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> SHOT_AT_ANGLE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 9, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 10, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Projectile.SCHEMA.extend(EntityTypes.FIREWORK_ROCKET)
            .add(FireworkRocketEntity.ATTACHED_TO_TARGET)
            .add(FireworkRocketEntity.FIREWORKS_ITEM)
            .add(FireworkRocketEntity.SHOT_AT_ANGLE)
            .build();

    }

    /**
     * Metadata properties for the {@code Fishing Hook} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class FishingHook extends Projectile {

        /**
         * Property representing the metadata field {@code BITING}
         *
         * <p>Supported Versions: {@code 1.16+}</p>
         */
        public static final SimpleField<Boolean> BITING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 8, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 9, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code HOOKED_ENTITY}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> HOOKED_ENTITY = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Projectile.SCHEMA.extend(EntityTypes.FISHING_BOBBER)
            .add(FishingHook.BITING)
            .add(FishingHook.HOOKED_ENTITY)
            .build();

    }

    /**
     * Metadata properties for the {@code Flying Mob} meta
     * <p>Supported Versions: {@code 1.14.4 - 1.21.5}</p>
     */
    public static class FlyingMob extends Mob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Mob.SCHEMA.extend(EntityTypes.ABSTRACT_FLYING)
            .build();

    }

    /**
     * Metadata properties for the {@code Fox} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Fox">Fox on the minecraft.wiki</a></p>
     */
    public static class Fox extends Animal {

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> FLAGS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 18, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code TRUSTED_0}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Optional<UUID>> TRUSTED_0 = SimpleField.<Optional<UUID>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 19, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 19, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.OPTIONAL_UUID)
            .build();

        /**
         * Property representing the metadata field {@code TRUSTED_1}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Optional<UUID>> TRUSTED_1 = SimpleField.<Optional<UUID>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 18, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 19, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 20, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 20, EntityDataTypes.OPTIONAL_UUID)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 21, EntityDataTypes.OPTIONAL_UUID)
            .build();

        /**
         * Property representing the metadata field {@code TYPE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> TYPE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.FOX)
            .add(Fox.FLAGS)
            .add(Fox.TRUSTED_0)
            .add(Fox.TRUSTED_1)
            .add(Fox.TYPE)
            .build();

    }

    /**
     * Metadata properties for the {@code Frog} meta
     * <p>Supported Versions: {@code 1.19+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Frog">Frog on the minecraft.wiki</a></p>
     */
    public static class Frog extends Animal {

        /**
         * Property representing the metadata field {@code TONGUE_TARGET}
         *
         * <p>Supported Versions: {@code 1.19+}</p>
         */
        public static final SimpleField<Optional<Integer>> TONGUE_TARGET = SimpleField.<Optional<Integer>>builder()
            .addVersionRange(ServerVersion.V_1_19, ServerVersion.V_1_21_11, 18, EntityDataTypes.OPTIONAL_INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.OPTIONAL_INT)
            .build();

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.19+}</p>
         */
        public static final SimpleField<FrogVariant> VARIANT = SimpleField.<FrogVariant>builder()
            .addVersionRange(ServerVersion.V_1_19, ServerVersion.V_1_20_3, 17, EntityDataTypes.TYPED_FROG_VARIANT)
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_1_21_11, 17, EntityDataTypes.TYPED_FROG_VARIANT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.TYPED_FROG_VARIANT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.FROG)
            .add(Frog.TONGUE_TARGET)
            .add(Frog.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Ghast} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Ghast">Ghast on the minecraft.wiki</a></p>
     */
    public static class Ghast extends Mob {

        /**
         * Property representing the metadata field {@code IS_CHARGING}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> IS_CHARGING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Mob.SCHEMA.extend(EntityTypes.GHAST)
            .add(Ghast.IS_CHARGING)
            .build();

    }

    /**
     * Metadata properties for the {@code Giant} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Giant">Giant on the minecraft.wiki</a></p>
     */
    public static class Giant extends Monster {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.GIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Hanging Entity} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class HangingEntity extends BlockAttachedEntity {

        /**
         * Property representing the metadata field {@code DIRECTION}
         *
         * <p>Supported Versions: {@code 1.21.6+}</p>
         */
        public static final SimpleField<BlockFace> DIRECTION = SimpleField.<BlockFace>builder()
            .addVersionRange(ServerVersion.V_1_21_6, ServerVersion.V_26_2, 8, EntityDataTypes.BLOCK_FACE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = BlockAttachedEntity.SCHEMA.extend(EntityTypes.ABSTRACT_HANGING)
            .add(HangingEntity.DIRECTION)
            .build();

    }

    /**
     * Metadata properties for the {@code Item Frame} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Item_Frame">Item Frame on the minecraft.wiki</a></p>
     */
    public static class ItemFrame extends HangingEntity {

        /**
         * Property representing the metadata field {@code ITEM}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<ItemStack> ITEM = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.ITEMSTACK)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_5, 8, EntityDataTypes.ITEMSTACK)
            .addVersionRange(ServerVersion.V_1_21_6, ServerVersion.V_26_2, 9, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * Property representing the metadata field {@code ROTATION}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> ROTATION = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 8, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_5, 9, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_21_6, ServerVersion.V_26_2, 10, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = HangingEntity.SCHEMA.extend(EntityTypes.ITEM_FRAME)
            .add(ItemFrame.ITEM)
            .add(ItemFrame.ROTATION)
            .build();

    }

    /**
     * Metadata properties for the {@code Glow Item Frame} meta
     * <p>Supported Versions: {@code 1.17+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Glow_Item_Frame">Glow Item Frame on the minecraft.wiki</a></p>
     */
    public static class GlowItemFrame extends ItemFrame {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = ItemFrame.SCHEMA.extend(EntityTypes.GLOW_ITEM_FRAME)
            .build();

    }

    /**
     * Metadata properties for the {@code Squid} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Squid">Squid on the minecraft.wiki</a></p>
     */
    public static class Squid extends AgeableWaterCreature {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AgeableWaterCreature.SCHEMA.extend(EntityTypes.SQUID)
            .build();

    }

    /**
     * Metadata properties for the {@code Glow Squid} meta
     * <p>Supported Versions: {@code 1.17+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Glow_Squid">Glow Squid on the minecraft.wiki</a></p>
     */
    public static class GlowSquid extends Squid {

        /**
         * Property representing the metadata field {@code DARK_TICKS_REMAINING}
         *
         * <p>Supported Versions: {@code 1.17+}</p>
         */
        public static final SimpleField<Integer> DARK_TICKS_REMAINING = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_1_21_11, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Squid.SCHEMA.extend(EntityTypes.GLOW_SQUID)
            .add(GlowSquid.DARK_TICKS_REMAINING)
            .build();

    }

    /**
     * Metadata properties for the {@code Goat} meta
     * <p>Supported Versions: {@code 1.17+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Goat">Goat on the minecraft.wiki</a></p>
     */
    public static class Goat extends Animal {

        /**
         * Property representing the metadata field {@code HAS_LEFT_HORN}
         *
         * <p>Supported Versions: {@code 1.19+}</p>
         */
        public static final SimpleField<Boolean> HAS_LEFT_HORN = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_19, ServerVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code HAS_RIGHT_HORN}
         *
         * <p>Supported Versions: {@code 1.19+}</p>
         */
        public static final SimpleField<Boolean> HAS_RIGHT_HORN = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_19, ServerVersion.V_1_21_11, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code IS_SCREAMING_GOAT}
         *
         * <p>Supported Versions: {@code 1.17+}</p>
         */
        public static final SimpleField<Boolean> IS_SCREAMING_GOAT = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.GOAT)
            .add(Goat.HAS_LEFT_HORN)
            .add(Goat.HAS_RIGHT_HORN)
            .add(Goat.IS_SCREAMING_GOAT)
            .build();

    }

    /**
     * Metadata properties for the {@code Happy Ghast} meta
     * <p>Supported Versions: {@code 1.21.6+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Happy_Ghast">Happy Ghast on the minecraft.wiki</a></p>
     */
    public static class HappyGhast extends Animal {

        /**
         * Property representing the metadata field {@code IS_LEASH_HOLDER}
         *
         * <p>Supported Versions: {@code 1.21.6+}</p>
         */
        public static final SimpleField<Boolean> IS_LEASH_HOLDER = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_6, ServerVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code STAYS_STILL}
         *
         * <p>Supported Versions: {@code 1.21.6+}</p>
         */
        public static final SimpleField<Boolean> STAYS_STILL = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_21_6, ServerVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.HAPPY_GHAST)
            .add(HappyGhast.IS_LEASH_HOLDER)
            .add(HappyGhast.STAYS_STILL)
            .build();

    }

    /**
     * Metadata properties for the {@code Hoglin} meta
     * <p>Supported Versions: {@code 1.16+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Hoglin">Hoglin on the minecraft.wiki</a></p>
     */
    public static class Hoglin extends Animal {

        /**
         * Property representing the metadata field {@code IMMUNE_TO_ZOMBIFICATION}
         *
         * <p>Supported Versions: {@code 1.16+}</p>
         */
        public static final SimpleField<Boolean> IMMUNE_TO_ZOMBIFICATION = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.HOGLIN)
            .add(Hoglin.IMMUNE_TO_ZOMBIFICATION)
            .build();

    }

    /**
     * Metadata properties for the {@code Horse} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Horse">Horse on the minecraft.wiki</a></p>
     */
    public static class Horse extends AbstractHorse {

        /**
         * Property representing the metadata field {@code TYPE_VARIANT}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> TYPE_VARIANT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_19_3, 19, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_21_11, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHorse.SCHEMA.extend(EntityTypes.HORSE)
            .add(Horse.TYPE_VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Husk} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Husk">Husk on the minecraft.wiki</a></p>
     */
    public static class Husk extends Zombie {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Zombie.SCHEMA.extend(EntityTypes.HUSK)
            .build();

    }

    /**
     * Metadata properties for the {@code Illusioner} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Illusioner">Illusioner on the minecraft.wiki</a></p>
     */
    public static class Illusioner extends SpellcasterIllager {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = SpellcasterIllager.SCHEMA.extend(EntityTypes.ILLUSIONER)
            .build();

    }

    /**
     * Metadata properties for the {@code Interaction} meta
     * <p>Supported Versions: {@code 1.19.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Interaction">Interaction on the minecraft.wiki</a></p>
     */
    public static class Interaction extends Entity {

        /**
         * Property representing the metadata field {@code HEIGHT}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Float> HEIGHT = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_26_2, 9, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code RESPONSE}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Boolean> RESPONSE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_26_2, 10, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code WIDTH}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Float> WIDTH = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_26_2, 8, EntityDataTypes.FLOAT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.INTERACTION)
            .add(Interaction.HEIGHT)
            .add(Interaction.RESPONSE)
            .add(Interaction.WIDTH)
            .build();

    }

    /**
     * Metadata properties for the {@code Iron Golem} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Iron_Golem">Iron Golem on the minecraft.wiki</a></p>
     */
    public static class IronGolem extends AbstractGolem {

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> FLAGS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractGolem.SCHEMA.extend(EntityTypes.IRON_GOLEM)
            .add(IronGolem.FLAGS)
            .build();

    }

    /**
     * Metadata properties for the {@code Item Display} meta
     * <p>Supported Versions: {@code 1.19.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Item_Display">Item Display on the minecraft.wiki</a></p>
     */
    public static class ItemDisplay extends Display {

        /**
         * Property representing the metadata field {@code ITEM_DISPLAY}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Byte> ITEM_DISPLAY = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 23, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 24, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code ITEM_STACK}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<ItemStack> ITEM_STACK = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 22, EntityDataTypes.ITEMSTACK)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 23, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Display.SCHEMA.extend(EntityTypes.ITEM_DISPLAY)
            .add(ItemDisplay.ITEM_DISPLAY)
            .add(ItemDisplay.ITEM_STACK)
            .build();

    }

    /**
     * Metadata properties for the {@code Item Entity} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class ItemEntity extends Entity {

        /**
         * Property representing the metadata field {@code ITEM}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<ItemStack> ITEM = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.ITEMSTACK)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.ITEM)
            .add(ItemEntity.ITEM)
            .build();

    }

    /**
     * Metadata properties for the {@code Large Fireball} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class LargeFireball extends Fireball {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Fireball.SCHEMA.extend(EntityTypes.FIREBALL)
            .build();

    }

    /**
     * Metadata properties for the {@code Leash Fence Knot Entity} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class LeashFenceKnotEntity extends BlockAttachedEntity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = BlockAttachedEntity.SCHEMA.extend(EntityTypes.LEASH_KNOT)
            .build();

    }

    /**
     * Metadata properties for the {@code Lightning Bolt} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Lightning_Bolt">Lightning Bolt on the minecraft.wiki</a></p>
     */
    public static class LightningBolt extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.LIGHTNING_BOLT)
            .build();

    }

    /**
     * Metadata properties for the {@code Llama} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Llama">Llama on the minecraft.wiki</a></p>
     */
    public static class Llama extends AbstractChestedHorse {

        /**
         * Property representing the metadata field {@code STRENGTH}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> STRENGTH = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 19, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_19_3, 20, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_21_11, 19, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code SWAG}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.20.3}</p>
         */
        public static final SimpleField<Integer> SWAG = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 19, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 20, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_19_3, 21, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_20_3, 20, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> VARIANT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 20, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 21, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_19_3, 22, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_20_3, 21, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_1_21_11, 20, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 21, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractChestedHorse.SCHEMA.extend(EntityTypes.LLAMA)
            .add(Llama.STRENGTH)
            .add(Llama.SWAG)
            .add(Llama.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Llama Spit} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Llama_Spit">Llama Spit on the minecraft.wiki</a></p>
     */
    public static class LlamaSpit extends Projectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Projectile.SCHEMA.extend(EntityTypes.LLAMA_SPIT)
            .build();

    }

    /**
     * Metadata properties for the {@code Local Player} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class LocalPlayer extends AbstractClientPlayer {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractClientPlayer.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Magma Cube} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Magma_Cube">Magma Cube on the minecraft.wiki</a></p>
     */
    public static class MagmaCube extends AbstractCubeMob {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractCubeMob.SCHEMA.extend(EntityTypes.MAGMA_CUBE)
            .build();

    }

    /**
     * Metadata properties for the {@code Marker} meta
     * <p>Supported Versions: {@code 1.17+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Marker">Marker on the minecraft.wiki</a></p>
     */
    public static class Marker extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.MARKER)
            .build();

    }

    /**
     * Metadata properties for the {@code Minecart} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Minecart">Minecart on the minecraft.wiki</a></p>
     */
    public static class Minecart extends AbstractMinecart {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractMinecart.SCHEMA.extend(EntityTypes.MINECART)
            .build();

    }

    /**
     * Metadata properties for the {@code Minecart Chest} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class MinecartChest extends AbstractMinecartContainer {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractMinecartContainer.SCHEMA.extend(EntityTypes.MINECART_CHEST)
            .build();

    }

    /**
     * Metadata properties for the {@code Minecart Command Block} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class MinecartCommandBlock extends AbstractMinecart {

        /**
         * Property representing the metadata field {@code COMMAND_NAME}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<String> COMMAND_NAME = SimpleField.<String>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 13, EntityDataTypes.STRING)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 14, EntityDataTypes.STRING)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_26_2, 13, EntityDataTypes.STRING)
            .build();

        /**
         * Property representing the metadata field {@code LAST_OUTPUT}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Component> LAST_OUTPUT = SimpleField.<Component>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 14, EntityDataTypes.ADV_COMPONENT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 15, EntityDataTypes.ADV_COMPONENT)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_26_2, 14, EntityDataTypes.ADV_COMPONENT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractMinecart.SCHEMA.extend(EntityTypes.COMMAND_BLOCK_MINECART)
            .add(MinecartCommandBlock.COMMAND_NAME)
            .add(MinecartCommandBlock.LAST_OUTPUT)
            .build();

    }

    /**
     * Metadata properties for the {@code Minecart Furnace} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class MinecartFurnace extends AbstractMinecart {

        /**
         * Property representing the metadata field {@code FUEL}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> FUEL = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 13, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 14, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_26_2, 13, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractMinecart.SCHEMA.extend(EntityTypes.MINECART_FURNACE)
            .add(MinecartFurnace.FUEL)
            .build();

    }

    /**
     * Metadata properties for the {@code Minecart Hopper} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class MinecartHopper extends AbstractMinecartContainer {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractMinecartContainer.SCHEMA.extend(EntityTypes.MINECART_HOPPER)
            .build();

    }

    /**
     * Metadata properties for the {@code Minecart Spawner} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class MinecartSpawner extends AbstractMinecart {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractMinecart.SCHEMA.extend(EntityTypes.SPAWNER_MINECART)
            .build();

    }

    /**
     * Metadata properties for the {@code Minecart T N T} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class MinecartTNT extends AbstractMinecart {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractMinecart.SCHEMA.extend(EntityTypes.MINECART_TNT)
            .build();

    }

    /**
     * Metadata properties for the {@code Mule} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Mule">Mule on the minecraft.wiki</a></p>
     */
    public static class Mule extends AbstractChestedHorse {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractChestedHorse.SCHEMA.extend(EntityTypes.MULE)
            .build();

    }

    /**
     * Metadata properties for the {@code Multi Part Entity Part} meta
     * <p>Supported Versions: {@code 1.12 - 1.12.2}</p>
     */
    public static class MultiPartEntityPart extends Entity {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Mushroom Cow} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class MushroomCow extends AbstractCow {

        /**
         * Property representing the metadata field {@code TYPE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> TYPE = SimpleField.<Integer>builder()
            // TODO type changed from 'String' to 'Integer', converter required
            // TODO type changed from 'String' to 'Integer', converter required
            // TODO type changed from 'String' to 'Integer', converter required
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractCow.SCHEMA.extend(null) // TODO Entity Type need mappings
            .add(MushroomCow.TYPE)
            .build();

    }

    /**
     * Metadata properties for the {@code Nautilus} meta
     * <p>Supported Versions: {@code 1.21.11+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Nautilus">Nautilus on the minecraft.wiki</a></p>
     */
    public static class Nautilus extends AbstractNautilus {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractNautilus.SCHEMA.extend(EntityTypes.NAUTILUS)
            .build();

    }

    /**
     * Metadata properties for the {@code Ocelot} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Ocelot">Ocelot on the minecraft.wiki</a></p>
     */
    public static class Ocelot extends Animal {

        /**
         * Property representing the metadata field {@code TRUSTING}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> TRUSTING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.OCELOT)
            .add(Ocelot.TRUSTING)
            .build();

    }

    /**
     * Metadata properties for the {@code Ominous Item Spawner} meta
     * <p>Supported Versions: {@code 1.20.5+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Ominous_Item_Spawner">Ominous Item Spawner on the minecraft.wiki</a></p>
     */
    public static class OminousItemSpawner extends Entity {

        /**
         * Property representing the metadata field {@code ITEM}
         *
         * <p>Supported Versions: {@code 1.20.5+}</p>
         */
        public static final SimpleField<ItemStack> ITEM = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_26_2, 8, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.OMINOUS_ITEM_SPAWNER)
            .add(OminousItemSpawner.ITEM)
            .build();

    }

    /**
     * Metadata properties for the {@code Painting} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Painting">Painting on the minecraft.wiki</a></p>
     */
    public static class Painting extends HangingEntity {

        /**
         * Property representing the metadata field {@code PAINTING_VARIANT}
         *
         * <p>Supported Versions: {@code 1.19+}</p>
         */
        public static final SimpleField<PaintingVariant> PAINTING_VARIANT = SimpleField.<PaintingVariant>builder()
            .addVersionRange(ServerVersion.V_1_19, ServerVersion.V_1_21_5, 8, EntityDataTypes.PAINTING_VARIANT)
            .addVersionRange(ServerVersion.V_1_21_6, ServerVersion.V_26_2, 9, EntityDataTypes.PAINTING_VARIANT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = HangingEntity.SCHEMA.extend(EntityTypes.PAINTING)
            .add(Painting.PAINTING_VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Panda} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Panda">Panda on the minecraft.wiki</a></p>
     */
    public static class Panda extends Animal {

        /**
         * Property representing the metadata field {@code EAT_COUNTER}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> EAT_COUNTER = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 19, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> FLAGS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 20, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 21, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 22, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 23, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code HIDDEN_GENE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> HIDDEN_GENE = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 19, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 20, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 21, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 22, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code MAIN_GENE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> MAIN_GENE = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 18, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 19, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 20, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 21, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code SNEEZE_COUNTER}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> SNEEZE_COUNTER = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code UNHAPPY_COUNTER}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> UNHAPPY_COUNTER = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.PANDA)
            .add(Panda.EAT_COUNTER)
            .add(Panda.FLAGS)
            .add(Panda.HIDDEN_GENE)
            .add(Panda.MAIN_GENE)
            .add(Panda.SNEEZE_COUNTER)
            .add(Panda.UNHAPPY_COUNTER)
            .build();

    }

    /**
     * Metadata properties for the {@code Parched} meta
     * <p>Supported Versions: {@code 1.21.11+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Parched">Parched on the minecraft.wiki</a></p>
     */
    public static class Parched extends AbstractSkeleton {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSkeleton.SCHEMA.extend(EntityTypes.PARCHED)
            .build();

    }

    /**
     * Metadata properties for the {@code Shoulder Riding Entity} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class ShoulderRidingEntity extends TamableAnimal {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = TamableAnimal.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Parrot} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Parrot">Parrot on the minecraft.wiki</a></p>
     */
    public static class Parrot extends ShoulderRidingEntity {

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Wrapped by view: {@link ParrotVariantView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Integer, ParrotVariantView> VARIANT = ViewField.builder(ParrotVariantView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 19, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = ShoulderRidingEntity.SCHEMA.extend(EntityTypes.PARROT)
            .add(Parrot.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Phantom} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Phantom">Phantom on the minecraft.wiki</a></p>
     */
    public static class Phantom extends Mob {

        /**
         * Property representing the metadata field {@code ID_SIZE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> ID_SIZE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Mob.SCHEMA.extend(EntityTypes.PHANTOM)
            .add(Phantom.ID_SIZE)
            .build();

    }

    /**
     * Metadata properties for the {@code Pig} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Pig">Pig on the minecraft.wiki</a></p>
     */
    public static class Pig extends Animal {

        /**
         * Property representing the metadata field {@code BOOST_TIME}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> BOOST_TIME = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code SADDLE}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.4}</p>
         */
        public static final SimpleField<Boolean> SADDLE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code SOUND_VARIANT}
         *
         * <p>Supported Versions: {@code 26.1+}</p>
         */
        public static final SimpleField<PigSoundVariant> SOUND_VARIANT = SimpleField.<PigSoundVariant>builder()
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.PIG_SOUND_VARIANT)
            .build();

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.21.5+}</p>
         */
        public static final SimpleField<PigVariant> VARIANT = SimpleField.<PigVariant>builder()
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 18, EntityDataTypes.PIG_VARIANT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.PIG_VARIANT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.PIG)
            .add(Pig.BOOST_TIME)
            .add(Pig.SADDLE)
            .add(Pig.SOUND_VARIANT)
            .add(Pig.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Pig Zombie} meta
     * <p>Supported Versions: {@code 1.14.4 - 1.15}</p>
     */
    public static class PigZombie extends Zombie {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Zombie.SCHEMA.extend(EntityTypes.ZOMBIFIED_PIGLIN)
            .build();

    }

    /**
     * Metadata properties for the {@code Piglin} meta
     * <p>Supported Versions: {@code 1.16+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Piglin">Piglin on the minecraft.wiki</a></p>
     */
    public static class Piglin extends AbstractPiglin {

        /**
         * Property representing the metadata field {@code BABY}
         *
         * <p>Supported Versions: {@code 1.16+}</p>
         */
        public static final SimpleField<Boolean> BABY = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_16_2, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code IMMUNE_TO_ZOMBIFICATION}
         *
         * <p>Supported Versions: {@code 1.16}</p>
         */
        public static final SimpleField<Boolean> IMMUNE_TO_ZOMBIFICATION = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code IS_CHARGING_CROSSBOW}
         *
         * <p>Supported Versions: {@code 1.16+}</p>
         */
        public static final SimpleField<Boolean> IS_CHARGING_CROSSBOW = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code IS_DANCING}
         *
         * <p>Supported Versions: {@code 1.16+}</p>
         */
        public static final SimpleField<Boolean> IS_DANCING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractPiglin.SCHEMA.extend(EntityTypes.PIGLIN)
            .add(Piglin.BABY)
            .add(Piglin.IMMUNE_TO_ZOMBIFICATION)
            .add(Piglin.IS_CHARGING_CROSSBOW)
            .add(Piglin.IS_DANCING)
            .build();

    }

    /**
     * Metadata properties for the {@code Piglin Brute} meta
     * <p>Supported Versions: {@code 1.16.2+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Piglin_Brute">Piglin Brute on the minecraft.wiki</a></p>
     */
    public static class PiglinBrute extends AbstractPiglin {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractPiglin.SCHEMA.extend(EntityTypes.PIGLIN_BRUTE)
            .build();

    }

    /**
     * Metadata properties for the {@code Pillager} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Pillager">Pillager on the minecraft.wiki</a></p>
     */
    public static class Pillager extends AbstractIllager {

        /**
         * Property representing the metadata field {@code IS_CHARGING_CROSSBOW}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> IS_CHARGING_CROSSBOW = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractIllager.SCHEMA.extend(EntityTypes.PILLAGER)
            .add(Pillager.IS_CHARGING_CROSSBOW)
            .build();

    }

    /**
     * Metadata properties for the {@code Polar Bear} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Polar_Bear">Polar Bear on the minecraft.wiki</a></p>
     */
    public static class PolarBear extends Animal {

        /**
         * Property representing the metadata field {@code STANDING}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> STANDING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.POLAR_BEAR)
            .add(PolarBear.STANDING)
            .build();

    }

    /**
     * Metadata properties for the {@code Primed Tnt} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class PrimedTnt extends Entity {

        /**
         * Property representing the metadata field {@code BLOCK_STATE}
         *
         * <p>Supported Versions: {@code 1.20.3+}</p>
         */
        public static final SimpleField<Integer> BLOCK_STATE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_20_3, ServerVersion.V_26_2, 9, EntityDataTypes.BLOCK_STATE)
            .build();

        /**
         * Property representing the metadata field {@code FUSE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> FUSE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Entity.SCHEMA.extend(EntityTypes.PRIMED_TNT)
            .add(PrimedTnt.BLOCK_STATE)
            .add(PrimedTnt.FUSE)
            .build();

    }

    /**
     * Metadata properties for the {@code Pufferfish} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Pufferfish">Pufferfish on the minecraft.wiki</a></p>
     */
    public static class Pufferfish extends AbstractFish {

        /**
         * Property representing the metadata field {@code PUFF_STATE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> PUFF_STATE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractFish.SCHEMA.extend(EntityTypes.PUFFERFISH)
            .add(Pufferfish.PUFF_STATE)
            .build();

    }

    /**
     * Metadata properties for the {@code Rabbit} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Rabbit">Rabbit on the minecraft.wiki</a></p>
     */
    public static class Rabbit extends Animal {

        /**
         * Property representing the metadata field {@code TYPE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> TYPE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.RABBIT)
            .add(Rabbit.TYPE)
            .build();

    }

    /**
     * Metadata properties for the {@code Raft} meta
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static class Raft extends AbstractBoat {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractBoat.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Ravager} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Ravager">Ravager on the minecraft.wiki</a></p>
     */
    public static class Ravager extends Raider {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Raider.SCHEMA.extend(EntityTypes.RAVAGER)
            .build();

    }

    /**
     * Metadata properties for the {@code Remote Player} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class RemotePlayer extends AbstractClientPlayer {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractClientPlayer.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Salmon} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Salmon">Salmon on the minecraft.wiki</a></p>
     */
    public static class Salmon extends AbstractSchoolingFish {

        /**
         * Property representing the metadata field {@code TYPE}
         *
         * <p>Wrapped by view: {@link SalmonTypeView}</p>
         * <p>Supported Versions: {@code 1.21.2+}</p>
         */
        public static final ViewField<Integer, SalmonTypeView> TYPE = ViewField.builder(SalmonTypeView::new)
            // TODO type changed from 'String' to 'Integer', converter required
            .addVersionRange(ServerVersion.V_1_21_4, ServerVersion.V_26_2, 17, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSchoolingFish.SCHEMA.extend(EntityTypes.SALMON)
            .add(Salmon.TYPE)
            .build();

    }

    /**
     * Metadata properties for the {@code Server Player} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class ServerPlayer extends Player {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Player.SCHEMA.extend(null) // TODO Entity Type need mappings
            .build();

    }

    /**
     * Metadata properties for the {@code Sheep} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Sheep">Sheep on the minecraft.wiki</a></p>
     */
    public static class Sheep extends Animal {

        /**
         * Property representing the metadata field {@code WOOL}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> WOOL = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.SHEEP)
            .add(Sheep.WOOL)
            .build();

    }

    /**
     * Metadata properties for the {@code Shulker} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Shulker">Shulker on the minecraft.wiki</a></p>
     */
    public static class Shulker extends AbstractGolem {

        /**
         * Property representing the metadata field {@code ATTACH_FACE}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<BlockFace> ATTACH_FACE = SimpleField.<BlockFace>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BLOCK_FACE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BLOCK_FACE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BLOCK_FACE)
            .build();

        /**
         * Property representing the metadata field {@code ATTACH_POS}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.16.2}</p>
         */
        public static final SimpleField<Optional<Vector3i>> ATTACH_POS = SimpleField.<Optional<Vector3i>>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
            .build();

        /**
         * Property representing the metadata field {@code COLOR}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> COLOR = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_26_2, 18, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code PEEK}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> PEEK = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_26_2, 17, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractGolem.SCHEMA.extend(EntityTypes.SHULKER)
            .add(Shulker.ATTACH_FACE)
            .add(Shulker.ATTACH_POS)
            .add(Shulker.COLOR)
            .add(Shulker.PEEK)
            .build();

    }

    /**
     * Metadata properties for the {@code Shulker Bullet} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Shulker_Bullet">Shulker Bullet on the minecraft.wiki</a></p>
     */
    public static class ShulkerBullet extends Projectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Projectile.SCHEMA.extend(EntityTypes.SHULKER_BULLET)
            .build();

    }

    /**
     * Metadata properties for the {@code Silverfish} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Silverfish">Silverfish on the minecraft.wiki</a></p>
     */
    public static class Silverfish extends Monster {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.SILVERFISH)
            .build();

    }

    /**
     * Metadata properties for the {@code Skeleton} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Skeleton">Skeleton on the minecraft.wiki</a></p>
     */
    public static class Skeleton extends AbstractSkeleton {

        /**
         * Property representing the metadata field {@code STRAY_CONVERSION}
         *
         * <p>Supported Versions: {@code 1.17+}</p>
         */
        public static final SimpleField<Boolean> STRAY_CONVERSION = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSkeleton.SCHEMA.extend(EntityTypes.SKELETON)
            .add(Skeleton.STRAY_CONVERSION)
            .build();

    }

    /**
     * Metadata properties for the {@code Skeleton Horse} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Skeleton_Horse">Skeleton Horse on the minecraft.wiki</a></p>
     */
    public static class SkeletonHorse extends AbstractHorse {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHorse.SCHEMA.extend(EntityTypes.SKELETON_HORSE)
            .build();

    }

    /**
     * Metadata properties for the {@code Slime} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Slime">Slime on the minecraft.wiki</a></p>
     */
    public static class Slime extends AbstractCubeMob {

        /**
         * Property representing the metadata field {@code ID_SIZE}
         *
         * <p>Supported Versions: {@code 1.14.4 - 26.1}</p>
         */
        public static final SimpleField<Integer> ID_SIZE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_1, 16, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractCubeMob.SCHEMA.extend(EntityTypes.SLIME)
            .add(Slime.ID_SIZE)
            .build();

    }

    /**
     * Metadata properties for the {@code Small Fireball} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Small_Fireball">Small Fireball on the minecraft.wiki</a></p>
     */
    public static class SmallFireball extends Fireball {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Fireball.SCHEMA.extend(EntityTypes.SMALL_FIREBALL)
            .build();

    }

    /**
     * Metadata properties for the {@code Sniffer} meta
     * <p>Supported Versions: {@code 1.19.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Sniffer">Sniffer on the minecraft.wiki</a></p>
     */
    public static class Sniffer extends Animal {

        /**
         * Property representing the metadata field {@code DROP_SEED_AT_TICK}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Integer> DROP_SEED_AT_TICK = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_21_11, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code STATE}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<SnifferState> STATE = SimpleField.<SnifferState>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_21_11, 17, EntityDataTypes.SNIFFER_STATE)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.SNIFFER_STATE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.SNIFFER)
            .add(Sniffer.DROP_SEED_AT_TICK)
            .add(Sniffer.STATE)
            .build();

    }

    /**
     * Metadata properties for the {@code Snow Golem} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Snow_Golem">Snow Golem on the minecraft.wiki</a></p>
     */
    public static class SnowGolem extends AbstractGolem {

        /**
         * Property representing the metadata field {@code PUMPKIN}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> PUMPKIN = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractGolem.SCHEMA.extend(EntityTypes.SNOW_GOLEM)
            .add(SnowGolem.PUMPKIN)
            .build();

    }

    /**
     * Metadata properties for the {@code Snowball} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Snowball">Snowball on the minecraft.wiki</a></p>
     */
    public static class Snowball extends ThrowableItemProjectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = ThrowableItemProjectile.SCHEMA.extend(EntityTypes.SNOWBALL)
            .build();

    }

    /**
     * Metadata properties for the {@code Spectral Arrow} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Spectral_Arrow">Spectral Arrow on the minecraft.wiki</a></p>
     */
    public static class SpectralArrow extends AbstractArrow {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractArrow.SCHEMA.extend(EntityTypes.SPECTRAL_ARROW)
            .build();

    }

    /**
     * Metadata properties for the {@code Stray} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Stray">Stray on the minecraft.wiki</a></p>
     */
    public static class Stray extends AbstractSkeleton {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSkeleton.SCHEMA.extend(EntityTypes.STRAY)
            .build();

    }

    /**
     * Metadata properties for the {@code Strider} meta
     * <p>Supported Versions: {@code 1.16+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Strider">Strider on the minecraft.wiki</a></p>
     */
    public static class Strider extends Animal {

        /**
         * Property representing the metadata field {@code BOOST_TIME}
         *
         * <p>Supported Versions: {@code 1.16+}</p>
         */
        public static final SimpleField<Integer> BOOST_TIME = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code SADDLE}
         *
         * <p>Supported Versions: {@code 1.16 - 1.21.4}</p>
         */
        public static final SimpleField<Boolean> SADDLE = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code SUFFOCATING}
         *
         * <p>Supported Versions: {@code 1.16+}</p>
         */
        public static final SimpleField<Boolean> SUFFOCATING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.STRIDER)
            .add(Strider.BOOST_TIME)
            .add(Strider.SADDLE)
            .add(Strider.SUFFOCATING)
            .build();

    }

    /**
     * Metadata properties for the {@code Sulfur Cube} meta
     * <p>Supported Versions: {@code 26.2+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Sulfur_Cube">Sulfur Cube on the minecraft.wiki</a></p>
     */
    public static class SulfurCube extends AbstractCubeMob {

        /**
         * Property representing the metadata field {@code FROM_BUCKET}
         *
         * <p>Supported Versions: {@code 26.2+}</p>
         */
        public static final SimpleField<Boolean> FROM_BUCKET = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_26_2, ServerVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code MAX_FUSE}
         *
         * <p>Supported Versions: {@code 26.2+}</p>
         */
        public static final SimpleField<Integer> MAX_FUSE = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_26_2, ServerVersion.V_26_2, 19, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractCubeMob.SCHEMA.extend(EntityTypes.SULFUR_CUBE)
            .add(SulfurCube.FROM_BUCKET)
            .add(SulfurCube.MAX_FUSE)
            .build();

    }

    /**
     * Metadata properties for the {@code Tadpole} meta
     * <p>Supported Versions: {@code 1.19+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Tadpole">Tadpole on the minecraft.wiki</a></p>
     */
    public static class Tadpole extends AbstractFish {

        /**
         * Property representing the metadata field {@code AGE_LOCKED}
         *
         * <p>Supported Versions: {@code 26.1+}</p>
         */
        public static final SimpleField<Boolean> AGE_LOCKED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractFish.SCHEMA.extend(EntityTypes.TADPOLE)
            .add(Tadpole.AGE_LOCKED)
            .build();

    }

    /**
     * Metadata properties for the {@code Text Display} meta
     * <p>Supported Versions: {@code 1.19.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Text_Display">Text Display on the minecraft.wiki</a></p>
     */
    public static class TextDisplay extends Display {

        /**
         * Property representing the metadata field {@code BACKGROUND_COLOR}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Integer> BACKGROUND_COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 24, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 25, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code LINE_WIDTH}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Integer> LINE_WIDTH = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 23, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 24, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code STYLE_FLAGS}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Byte> STYLE_FLAGS = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 26, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 27, EntityDataTypes.BYTE)
            .build();

        /**
         * Property representing the metadata field {@code TEXT}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Component> TEXT = SimpleField.<Component>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 22, EntityDataTypes.ADV_COMPONENT)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 23, EntityDataTypes.ADV_COMPONENT)
            .build();

        /**
         * Property representing the metadata field {@code TEXT_OPACITY}
         *
         * <p>Supported Versions: {@code 1.19.4+}</p>
         */
        public static final SimpleField<Byte> TEXT_OPACITY = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_19_4, ServerVersion.V_1_19_4, 25, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_20_2, ServerVersion.V_26_2, 26, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Display.SCHEMA.extend(EntityTypes.TEXT_DISPLAY)
            .add(TextDisplay.BACKGROUND_COLOR)
            .add(TextDisplay.LINE_WIDTH)
            .add(TextDisplay.STYLE_FLAGS)
            .add(TextDisplay.TEXT)
            .add(TextDisplay.TEXT_OPACITY)
            .build();

    }

    /**
     * Metadata properties for the {@code Thrown Egg} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Thrown_Egg">Thrown Egg on the minecraft.wiki</a></p>
     */
    public static class ThrownEgg extends ThrowableItemProjectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = ThrowableItemProjectile.SCHEMA.extend(EntityTypes.EGG)
            .build();

    }

    /**
     * Metadata properties for the {@code Thrown Enderpearl} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class ThrownEnderpearl extends ThrowableItemProjectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = ThrowableItemProjectile.SCHEMA.extend(EntityTypes.ENDER_PEARL)
            .build();

    }

    /**
     * Metadata properties for the {@code Thrown Experience Bottle} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class ThrownExperienceBottle extends ThrowableItemProjectile {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = ThrowableItemProjectile.SCHEMA.extend(EntityTypes.EXPERIENCE_BOTTLE)
            .build();

    }

    /**
     * Metadata properties for the {@code Thrown Lingering Potion} meta
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static class ThrownLingeringPotion extends AbstractThrownPotion {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractThrownPotion.SCHEMA.extend(EntityTypes.LINGERING_POTION)
            .build();

    }

    /**
     * Metadata properties for the {@code Thrown Potion} meta
     * <p>Supported Versions: {@code 1.14.4 - 1.21.4}</p>
     */
    public static class ThrownPotion extends ThrowableItemProjectile {

        /**
         * Property representing the metadata field {@code ITEM_STACK}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.15}</p>
         */
        public static final SimpleField<ItemStack> ITEM_STACK = SimpleField.<ItemStack>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_15, 7, EntityDataTypes.ITEMSTACK)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = ThrowableItemProjectile.SCHEMA.extend(EntityTypes.POTION)
            .add(ThrownPotion.ITEM_STACK)
            .build();

    }

    /**
     * Metadata properties for the {@code Thrown Splash Potion} meta
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static class ThrownSplashPotion extends AbstractThrownPotion {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractThrownPotion.SCHEMA.extend(EntityTypes.SPLASH_POTION)
            .build();

    }

    /**
     * Metadata properties for the {@code Thrown Trident} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class ThrownTrident extends AbstractArrow {

        /**
         * Property representing the metadata field {@code ID_FOIL}
         *
         * <p>Supported Versions: {@code 1.15+}</p>
         */
        public static final SimpleField<Boolean> ID_FOIL = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_15, 11, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 10, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 11, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_26_2, 12, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code ID_LOYALTY}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Byte> ID_LOYALTY = SimpleField.<Byte>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_15, 10, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 9, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21, 10, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_21_2, ServerVersion.V_26_2, 11, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractArrow.SCHEMA.extend(EntityTypes.TRIDENT)
            .add(ThrownTrident.ID_FOIL)
            .add(ThrownTrident.ID_LOYALTY)
            .build();

    }

    /**
     * Metadata properties for the {@code Trader Llama} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Trader_Llama">Trader Llama on the minecraft.wiki</a></p>
     */
    public static class TraderLlama extends Llama {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Llama.SCHEMA.extend(EntityTypes.TRADER_LLAMA)
            .build();

    }

    /**
     * Metadata properties for the {@code Tropical Fish} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Tropical_Fish">Tropical Fish on the minecraft.wiki</a></p>
     */
    public static class TropicalFish extends AbstractSchoolingFish {

        /**
         * Property representing the metadata field {@code TYPE_VARIANT}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> TYPE_VARIANT = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSchoolingFish.SCHEMA.extend(EntityTypes.TROPICAL_FISH)
            .add(TropicalFish.TYPE_VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Turtle} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Turtle">Turtle on the minecraft.wiki</a></p>
     */
    public static class Turtle extends Animal {

        /**
         * Property representing the metadata field {@code GOING_HOME}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.4}</p>
         */
        public static final SimpleField<Boolean> GOING_HOME = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 20, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 21, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code HAS_EGG}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> HAS_EGG = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code HOME_POS}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.4}</p>
         */
        public static final SimpleField<Vector3i> HOME_POS = SimpleField.<Vector3i>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 17, EntityDataTypes.BLOCK_POSITION)
            .build();

        /**
         * Property representing the metadata field {@code LAYING_EGG}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> LAYING_EGG = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code TRAVELLING}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.4}</p>
         */
        public static final SimpleField<Boolean> TRAVELLING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 20, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 21, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 22, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code TRAVEL_POS}
         *
         * <p>Supported Versions: {@code 1.14.4 - 1.21.4}</p>
         */
        public static final SimpleField<Vector3i> TRAVEL_POS = SimpleField.<Vector3i>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 18, EntityDataTypes.BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 19, EntityDataTypes.BLOCK_POSITION)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_4, 20, EntityDataTypes.BLOCK_POSITION)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Animal.SCHEMA.extend(EntityTypes.TURTLE)
            .add(Turtle.GOING_HOME)
            .add(Turtle.HAS_EGG)
            .add(Turtle.HOME_POS)
            .add(Turtle.LAYING_EGG)
            .add(Turtle.TRAVELLING)
            .add(Turtle.TRAVEL_POS)
            .build();

    }

    /**
     * Metadata properties for the {@code Vex} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Vex">Vex on the minecraft.wiki</a></p>
     */
    public static class Vex extends Monster {

        /**
         * Property representing the metadata field {@code FLAGS}
         *
         * <p>Wrapped by view: {@link VexFlagsView}</p>
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final ViewField<Byte, VexFlagsView> FLAGS = ViewField.builder(VexFlagsView::new)
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.BYTE)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BYTE)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.VEX)
            .add(Vex.FLAGS)
            .build();

    }

    /**
     * Metadata properties for the {@code Villager} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Villager">Villager on the minecraft.wiki</a></p>
     */
    public static class Villager extends AbstractVillager {

        /**
         * Property representing the metadata field {@code VILLAGER_DATA}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<VillagerData> VILLAGER_DATA = SimpleField.<VillagerData>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.VILLAGER_DATA)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.VILLAGER_DATA)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 18, EntityDataTypes.VILLAGER_DATA)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 19, EntityDataTypes.VILLAGER_DATA)
            .build();

        /**
         * Property representing the metadata field {@code VILLAGER_FINALIZED}
         *
         * <p>Supported Versions: {@code 26.1+}</p>
         */
        public static final SimpleField<Boolean> VILLAGER_FINALIZED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractVillager.SCHEMA.extend(EntityTypes.VILLAGER)
            .add(Villager.VILLAGER_DATA)
            .add(Villager.VILLAGER_FINALIZED)
            .build();

    }

    /**
     * Metadata properties for the {@code Vindicator} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Vindicator">Vindicator on the minecraft.wiki</a></p>
     */
    public static class Vindicator extends AbstractIllager {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractIllager.SCHEMA.extend(EntityTypes.VINDICATOR)
            .build();

    }

    /**
     * Metadata properties for the {@code Wandering Trader} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Wandering_Trader">Wandering Trader on the minecraft.wiki</a></p>
     */
    public static class WanderingTrader extends AbstractVillager {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractVillager.SCHEMA.extend(EntityTypes.WANDERING_TRADER)
            .build();

    }

    /**
     * Metadata properties for the {@code Warden} meta
     * <p>Supported Versions: {@code 1.19+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Warden">Warden on the minecraft.wiki</a></p>
     */
    public static class Warden extends Monster {

        /**
         * Property representing the metadata field {@code CLIENT_ANGER_LEVEL}
         *
         * <p>Supported Versions: {@code 1.19+}</p>
         */
        public static final SimpleField<Integer> CLIENT_ANGER_LEVEL = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_19, ServerVersion.V_26_2, 16, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.WARDEN)
            .add(Warden.CLIENT_ANGER_LEVEL)
            .build();

    }

    /**
     * Metadata properties for the {@code Wind Charge} meta
     * <p>Supported Versions: {@code 1.20.3+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Wind_Charge">Wind Charge on the minecraft.wiki</a></p>
     */
    public static class WindCharge extends AbstractWindCharge {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractWindCharge.SCHEMA.extend(EntityTypes.WIND_CHARGE)
            .build();

    }

    /**
     * Metadata properties for the {@code Witch} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Witch">Witch on the minecraft.wiki</a></p>
     */
    public static class Witch extends Raider {

        /**
         * Property representing the metadata field {@code USING_ITEM}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> USING_ITEM = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Raider.SCHEMA.extend(EntityTypes.WITCH)
            .add(Witch.USING_ITEM)
            .build();

    }

    /**
     * Metadata properties for the {@code Wither Boss} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     */
    public static class WitherBoss extends Monster {

        /**
         * Property representing the metadata field {@code INV}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> INV = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 19, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code TARGET_A}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> TARGET_A = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 14, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code TARGET_B}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> TARGET_B = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 15, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 17, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code TARGET_C}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> TARGET_C = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 16, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 17, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 18, EntityDataTypes.INT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.WITHER)
            .add(WitherBoss.INV)
            .add(WitherBoss.TARGET_A)
            .add(WitherBoss.TARGET_B)
            .add(WitherBoss.TARGET_C)
            .build();

    }

    /**
     * Metadata properties for the {@code Wither Skeleton} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Wither_Skeleton">Wither Skeleton on the minecraft.wiki</a></p>
     */
    public static class WitherSkeleton extends AbstractSkeleton {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractSkeleton.SCHEMA.extend(EntityTypes.WITHER_SKELETON)
            .build();

    }

    /**
     * Metadata properties for the {@code Wither Skull} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Wither_Skull">Wither Skull on the minecraft.wiki</a></p>
     */
    public static class WitherSkull extends AbstractHurtingProjectile {

        /**
         * Property representing the metadata field {@code DANGEROUS}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> DANGEROUS = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 7, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 8, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHurtingProjectile.SCHEMA.extend(EntityTypes.WITHER_SKULL)
            .add(WitherSkull.DANGEROUS)
            .build();

    }

    /**
     * Metadata properties for the {@code Wolf} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Wolf">Wolf on the minecraft.wiki</a></p>
     */
    public static class Wolf extends TamableAnimal {

        /**
         * Property representing the metadata field {@code ANGER_END_TIME}
         *
         * <p>Supported Versions: {@code 1.21.11+}</p>
         */
        public static final SimpleField<Long> ANGER_END_TIME = SimpleField.<Long>builder()
            .addVersionRange(ServerVersion.V_1_21_11, ServerVersion.V_1_21_11, 21, EntityDataTypes.LONG)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 22, EntityDataTypes.LONG)
            .build();

        /**
         * Property representing the metadata field {@code COLLAR_COLOR}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Integer> COLLAR_COLOR = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 19, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 20, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 21, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code HEALTH}
         *
         * <p>Supported Versions: {@code 1.14.4}</p>
         */
        public static final SimpleField<Float> HEALTH = SimpleField.<Float>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.FLOAT)
            .build();

        /**
         * Property representing the metadata field {@code INTERESTED}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> INTERESTED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_16_2, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_11, 19, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code REMAINING_ANGER_TIME}
         *
         * <p>Supported Versions: {@code 1.16 - 1.21.9}</p>
         */
        public static final SimpleField<Integer> REMAINING_ANGER_TIME = SimpleField.<Integer>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 20, EntityDataTypes.INT)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_1_21_9, 21, EntityDataTypes.INT)
            .build();

        /**
         * Property representing the metadata field {@code SOUND_VARIANT}
         *
         * <p>Supported Versions: {@code 1.21.5+}</p>
         */
        public static final SimpleField<WolfSoundVariant> SOUND_VARIANT = SimpleField.<WolfSoundVariant>builder()
            .addVersionRange(ServerVersion.V_1_21_5, ServerVersion.V_1_21_11, 23, EntityDataTypes.WOLF_SOUND_VARIANT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 24, EntityDataTypes.WOLF_SOUND_VARIANT)
            .build();

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.20.5+}</p>
         */
        public static final SimpleField<WolfVariant> VARIANT = SimpleField.<WolfVariant>builder()
            .addVersionRange(ServerVersion.V_1_20_5, ServerVersion.V_1_21_11, 22, EntityDataTypes.TYPED_WOLF_VARIANT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 23, EntityDataTypes.TYPED_WOLF_VARIANT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = TamableAnimal.SCHEMA.extend(EntityTypes.WOLF)
            .add(Wolf.ANGER_END_TIME)
            .add(Wolf.COLLAR_COLOR)
            .add(Wolf.HEALTH)
            .add(Wolf.INTERESTED)
            .add(Wolf.REMAINING_ANGER_TIME)
            .add(Wolf.SOUND_VARIANT)
            .add(Wolf.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Zoglin} meta
     * <p>Supported Versions: {@code 1.16+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Zoglin">Zoglin on the minecraft.wiki</a></p>
     */
    public static class Zoglin extends Monster {

        /**
         * Property representing the metadata field {@code BABY}
         *
         * <p>Supported Versions: {@code 1.16+}</p>
         */
        public static final SimpleField<Boolean> BABY = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_16, ServerVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Monster.SCHEMA.extend(EntityTypes.ZOGLIN)
            .add(Zoglin.BABY)
            .build();

    }

    /**
     * Metadata properties for the {@code Zombie Horse} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Zombie_Horse">Zombie Horse on the minecraft.wiki</a></p>
     */
    public static class ZombieHorse extends AbstractHorse {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractHorse.SCHEMA.extend(EntityTypes.ZOMBIE_HORSE)
            .build();

    }

    /**
     * Metadata properties for the {@code Zombie Nautilus} meta
     * <p>Supported Versions: {@code 1.21.11+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Zombie_Nautilus">Zombie Nautilus on the minecraft.wiki</a></p>
     */
    public static class ZombieNautilus extends AbstractNautilus {

        /**
         * Property representing the metadata field {@code VARIANT}
         *
         * <p>Supported Versions: {@code 1.21.11+}</p>
         */
        public static final SimpleField<ZombieNautilusVariant> VARIANT = SimpleField.<ZombieNautilusVariant>builder()
            .addVersionRange(ServerVersion.V_1_21_11, ServerVersion.V_1_21_11, 20, EntityDataTypes.ZOMBIE_NAUTILUS_VARIANT)
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 21, EntityDataTypes.ZOMBIE_NAUTILUS_VARIANT)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = AbstractNautilus.SCHEMA.extend(EntityTypes.ZOMBIE_NAUTILUS)
            .add(ZombieNautilus.VARIANT)
            .build();

    }

    /**
     * Metadata properties for the {@code Zombie Villager} meta
     * <p>Supported Versions: {@code 1.14.4+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Zombie_Villager">Zombie Villager on the minecraft.wiki</a></p>
     */
    public static class ZombieVillager extends Zombie {

        /**
         * Property representing the metadata field {@code CONVERTING}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<Boolean> CONVERTING = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 17, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 18, EntityDataTypes.BOOLEAN)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * Property representing the metadata field {@code VILLAGER_DATA}
         *
         * <p>Supported Versions: {@code 1.14.4+}</p>
         */
        public static final SimpleField<VillagerData> VILLAGER_DATA = SimpleField.<VillagerData>builder()
            .addVersionRange(ServerVersion.V_1_14_4, ServerVersion.V_1_14_4, 18, EntityDataTypes.VILLAGER_DATA)
            .addVersionRange(ServerVersion.V_1_15, ServerVersion.V_1_16_2, 19, EntityDataTypes.VILLAGER_DATA)
            .addVersionRange(ServerVersion.V_1_17, ServerVersion.V_26_2, 20, EntityDataTypes.VILLAGER_DATA)
            .build();

        /**
         * Property representing the metadata field {@code VILLAGER_FINALIZED}
         *
         * <p>Supported Versions: {@code 26.1+}</p>
         */
        public static final SimpleField<Boolean> VILLAGER_FINALIZED = SimpleField.<Boolean>builder()
            .addVersionRange(ServerVersion.V_26_1, ServerVersion.V_26_2, 21, EntityDataTypes.BOOLEAN)
            .build();

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Zombie.SCHEMA.extend(EntityTypes.ZOMBIE_VILLAGER)
            .add(ZombieVillager.CONVERTING)
            .add(ZombieVillager.VILLAGER_DATA)
            .add(ZombieVillager.VILLAGER_FINALIZED)
            .build();

    }

    /**
     * Metadata properties for the {@code Zombified Piglin} meta
     * <p>Supported Versions: {@code 1.16+}</p>
     * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Zombified_Piglin">Zombified Piglin on the minecraft.wiki</a></p>
     */
    public static class ZombifiedPiglin extends Zombie {

        /**
         * The {@link EntityMetaSchema} containing this meta's properties, combined with all
         * properties declared by its super classes.
         */
        public static final EntityMetaSchema SCHEMA = Zombie.SCHEMA.extend(EntityTypes.ZOMBIFIED_PIGLIN)
            .build();

    }

}
