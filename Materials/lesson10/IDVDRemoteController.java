package less.lesson10;

public interface IDVDRemoteController {
	int KEYS = 30;
	public final static int BATTERY_VOLTAGE = 9;
	
	void play();
	void stop();
	void insertDisc();
	void eject();
}
