package Example;

import caffein.momineko.status.CaffeinStatus;
import caffein.momineko.status.CaffeinStatusContainer;

public class ExampleOfCaffeinStatus implements CaffeinStatus {

    private final CaffeinStatusContainer caffeinStatusContainer = new CaffeinStatusContainer();

    @Override
    public CaffeinStatusContainer getCaffeinStatusContainer() {
        return caffeinStatusContainer;
    }
}
