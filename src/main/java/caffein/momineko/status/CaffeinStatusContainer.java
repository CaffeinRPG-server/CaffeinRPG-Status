package caffein.momineko.status;

import java.util.HashMap;
import java.util.Map;

public class CaffeinStatusContainer implements CaffeinStatus {

    private final Map<String, Integer> statusData = new HashMap<>();

    public CaffeinStatusContainer() {}

    public CaffeinStatusContainer(CaffeinStatus status) {
        statusData.putAll(status.getCaffeinStatusContainer().statusData);
    }

    @Override
    public CaffeinStatusContainer getCaffeinStatusContainer() {
        return this;
    }

    @Override
    public void setStatus(String type, int value) {
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
    public void addStatus(String type, int value) {
        statusData.merge(type, value, Integer::sum);
    }

    @Override
    public void addStatus(CaffeinStatus caffeinStatus) {
        for (Map.Entry<String, Integer> entry : caffeinStatus.getCaffeinStatusContainer().statusData.entrySet()) {
            statusData.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
    }

    @Override
    public int getStatus(String type) {
        if (CaffeinStatusType.IllegalCheck(type)) {
            return statusData.get(type);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
