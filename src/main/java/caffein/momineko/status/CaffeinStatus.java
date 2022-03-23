package caffein.momineko.status;

public interface CaffeinStatus {

    CaffeinStatusContainer getCaffeinStatusContainer();

    static CaffeinStatusContainer create() {
        return new CaffeinStatusContainer();
    }

    static CaffeinStatusContainer clone(CaffeinStatus status) {
        return new CaffeinStatusContainer(status);
    }

    default void setStatus(String type, int value) {
        getCaffeinStatusContainer().setStatus(type, value);
    }

    default void setStatus(CaffeinStatus caffeinStatus) {
        getCaffeinStatusContainer().setStatus(caffeinStatus);
    }

    default void addStatus(String type, int value) {
        getCaffeinStatusContainer().addStatus(type, value);
    }

    default void addStatus(CaffeinStatus caffeinStatus) {
        getCaffeinStatusContainer().addStatus(caffeinStatus);
    }

    default int getStatus(String type) {
        return getCaffeinStatusContainer().getStatus(type);
    }
}
