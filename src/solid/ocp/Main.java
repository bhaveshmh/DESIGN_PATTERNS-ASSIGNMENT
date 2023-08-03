package solid.ocp;

public class Main {
    public static void main(String[] args) {
        ResourceAllocator resourceAllocator = new ResourceAllocator();

        TimeResource timeResource = new TimeResource();
        SpaceResource spaceResource = new SpaceResource();

        int timeResourceId, spaceResourceId;

        timeResourceId = resourceAllocator.allocate(timeResource);
        spaceResourceId = resourceAllocator.allocate(spaceResource);

        resourceAllocator.free(timeResource, timeResourceId);
        resourceAllocator.free(spaceResource, spaceResourceId);
    }
}
