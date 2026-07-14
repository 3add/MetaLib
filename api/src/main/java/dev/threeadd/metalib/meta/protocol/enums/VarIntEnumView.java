package dev.threeadd.metalib.meta.protocol.enums;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.property.ViewProperty;

/**
 * Represents a {@link EnumView} whose {@link ProtocolEnum#getProtocolValue()} is serialized as varint
 */
public class VarIntEnumView<E extends Enum<E> & ProtocolEnum> extends EnumView<E, Integer> {

    public VarIntEnumView(EntityMetadata store, ViewProperty<Integer, ? extends EnumView<E, Integer>> key, Class<E> enumClass, E defaultValue) {
        super(store, key, enumClass, defaultValue);
    }

    @Override
    protected int toInt(Integer raw) {
        return raw;
    }

    @Override
    protected Integer fromInt(int protocolValue) {
        return protocolValue;
    }

}