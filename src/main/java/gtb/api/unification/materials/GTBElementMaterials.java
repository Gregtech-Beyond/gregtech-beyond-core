package gtb.api.unification.materials;

public class GTBElementMaterials {

    //range 2652-2752
    private static int startId = 2652;
    private static final int END_ID = startId + 100;

    public static void register() {}

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
