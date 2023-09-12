package mock_29_req_4;

import java.util.ArrayList;
import java.util.List;

public class MobileBO1 {
	public List<Mobile> findMobile(List<Mobile> mobileList, String modelName) {
        List<Mobile> result = new ArrayList<>();
        for (Mobile mobile : mobileList) {
            if (mobile.getModelName().equalsIgnoreCase(modelName)) {
                result.add(mobile);
            }
        }
        return result;
    }

    public List<Mobile> findMobile(List<Mobile> mobileList, Double displaySize) {
        List<Mobile> result = new ArrayList<>();
        for (Mobile mobile : mobileList) {
            if (Math.abs(mobile.getDisplaySize() - displaySize) < 0.1) {
                result.add(mobile);
            }
        }
        return result;
    }

}
