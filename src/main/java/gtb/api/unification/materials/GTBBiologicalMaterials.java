package gtb.api.unification.materials;

public class GTBBiologicalMaterials {

    // Range 25601-26601
    private static int startId = 25601;
    private static final int END_ID = startId + 1000;

    public static void register() {}

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
