package dev.threeadd.metalib.entity.viewer;

@FunctionalInterface
public interface RegisteredViewerRule {

    /**
     * Unregisters the associated rule.
     */
    void unregister();

}