package dev.threeadd.metalib.entity.event;

import dev.threeadd.metalib.event.Event;

public record EntityTickEvent(long currentTickCount) implements Event {
}
