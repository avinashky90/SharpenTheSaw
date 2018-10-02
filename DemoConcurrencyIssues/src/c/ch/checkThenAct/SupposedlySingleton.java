package c.ch.checkThenAct;

public class SupposedlySingleton {

	private static SupposedlySingleton instance = null;

	private SupposedlySingleton() {
	}

	public static SupposedlySingleton getInstance() {
		if (instance == null) {
			instance = new SupposedlySingleton();
		}
		return instance;
	}
}
