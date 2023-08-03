package solid.ocp;

public class SpaceResource implements ResourceAllocatorType {
    public void markSlotFree(int resourceId) {
    }

    public void markSlotBusy(int resourceId) {
    }

    public int findFreeSlot() {
        return 0;
    }
}
