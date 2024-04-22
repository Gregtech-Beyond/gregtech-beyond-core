package gtb.api.unification.materials;

public final class GTBFirstDegreeMaterials {

    // Range 24001-24500
    private static int startId = 24001;
    private static final int END_ID = startId + 500;

    public static void register() {}

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
