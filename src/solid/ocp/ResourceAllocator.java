package solid.ocp;

public class ResourceAllocator {

    public int allocate(ResourceAllocatorType resourceAllocatorType) {
        int resourceId;
        resourceId = resourceAllocatorType.findFreeSlot();
        resourceAllocatorType.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(ResourceAllocatorType resourceAllocatorType, int resourceId) {
        resourceAllocatorType.markSlotFree(resourceId);
    }
}
