package dev.threeadd.metalib.meta.protocol.enums.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.enums.ProtocolEnum;
import dev.threeadd.metalib.meta.protocol.enums.VarIntEnumView;
import dev.threeadd.metalib.meta.protocol.types.CreeperMetaProperties;

/**
 * Represents {@link CreeperMetaProperties#SWELL_DIR}
 */
public class CreeperSwellStateView extends VarIntEnumView<CreeperSwellStateView.State> {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Creeper
    public enum State implements ProtocolEnum {
        IDLE(-1),
        FUSE(1);

        private final int value;

        State(int value) {
            this.value = value;
        }

        @Override
        public int getProtocolValue() {
            return this.value;
        }
    }

    public CreeperSwellStateView(EntityMetadata store) {
        super(store, CreeperMetaProperties.SWELL_DIR, State.class, State.IDLE);
    }

}
