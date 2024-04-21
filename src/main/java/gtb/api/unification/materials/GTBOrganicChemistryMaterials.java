package gtb.api.unification.materials;

public class GTBOrganicChemistryMaterials {

    // Range 25001-25200
    private static int startId = 25001;
    private static final int END_ID = startId + 200;

    public static void register() {}

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
