package caffein.momineko.core.Status;

import java.util.HashMap;
import java.util.Map;

public class CaffeinStatusContainer implements CaffeinStatus {

    private final Map<String, Double> statusData = new HashMap<>();

    public CaffeinStatusContainer() {}

    public CaffeinStatusContainer(CaffeinStatus status) {
        statusData.putAll(status.getCaffeinStatusContainer().statusData);
    }

    @Override
    public CaffeinStatusContainer getCaffeinStatusContainer() {
        return this;
    }

    @Override
    public void setStatus(String type, double value) {
        if (CaffeinStatusType.IllegalCheck(type)) {
            statusData.put(type, value);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void setStatus(CaffeinStatus caffeinStatus) {
        statusData.clear();
        statusData.putAll(caffeinStatus.getCaffeinStatusContainer().statusData);
    }

    @Override
    public void addStatus(String type, double value) {
        statusData.merge(type, value, Double::sum);
    }

    @Override
    public void addStatus(CaffeinStatus caffeinStatus) {
        for (Map.Entry<String, Double> entry : caffeinStatus.getCaffeinStatusContainer().statusData.entrySet()) {
            statusData.merge(entry.getKey(), entry.getValue(), Double::sum);
        }
    }

    @Override
    public double getStatus(String type) {
        if (CaffeinStatusType.IllegalCheck(type)) {
            return statusData.get(type);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
