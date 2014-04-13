package less.lesson10;

public interface ITVRemoteController {
	int KEYS = 50;
	void startTV();
	void stopTV();
	void channelUp();
	void channelDown();
	void goToChannel(int channel);
}
