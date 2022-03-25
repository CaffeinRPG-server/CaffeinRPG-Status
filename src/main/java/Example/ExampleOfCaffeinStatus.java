package Example;

import caffein.momineko.core.Status.CaffeinStatus;
import caffein.momineko.core.Status.CaffeinStatusContainer;

public class ExampleOfCaffeinStatus implements CaffeinStatus {

    private final CaffeinStatusContainer caffeinStatusContainer = CaffeinStatus.create();

    @Override
    public CaffeinStatusContainer getCaffeinStatusContainer() {
        return caffeinStatusContainer;
    }
}
