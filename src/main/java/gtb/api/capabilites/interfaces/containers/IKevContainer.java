package gtb.api.capabilites.interfaces.containers;

public interface IKevContainer {

    int minKev = 0;

    int getKev();

    void setKev(int kev);

    int getMaxKev();

    void resetContainer();

    boolean canChangeKev(int valueToAdd);

    /**
     * WARNING: this method changes the {@code kev} value WITHOUT checking if the is valid
     * i.e. between {@link IKevContainer#minKev} and {@link IKevContainer#getMaxKev()}.
     * <br>
     * You can use {@link IKevContainer#tryChangeKev(int)} to check then change the value.
     * 
     * @param valueToAdd the value to add to the current {@code kev} value.
     */
    void changeKev(int valueToAdd);

    /**
     * Calls {@link IKevContainer#canChangeKev(int valueToAdd)} then {@link IKevContainer#changeKev(int valueToAdd)}
     * 
     * @param valueToAdd
     */
    default void tryChangeKev(int valueToAdd) {
        if (canChangeKev(valueToAdd)) changeKev(valueToAdd);
    }
}
