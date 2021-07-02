package KTVTKPM.singleton;

import java.util.ArrayList;
import java.util.List;

public class FanManager {
	public static FanManager instance;

	List<Fan> fans = new ArrayList<>();

	public static FanManager getInstance() {
		if (instance == null) {
			instance = new FanManager();
		}
		return instance;
	}

	private FanManager() {
	}

	public void addFan(Fan fan) {
		fans.add(fan);
	}

	public Fan search(String name) {
		for (Fan fan : fans) {
			if (fan.getName().equals(name)) {
				return fan;
			}
		}
		return null;
	}
	
	
}
