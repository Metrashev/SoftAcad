package less.lesson10;

public class PhilipsRemoteController implements IDVDRemoteController, ITVRemoteController {

	@Override
	public void play() {
		System.out.println("Philips: play");
	}

	@Override
	public void stop() {
		System.out.println("Philips: stop");
	}

	@Override
	public void insertDisc() {
		System.out.println("Philips: insert CD");
	}

	@Override
	public void eject() {
		System.out.println("Philips: eject");		
	}

	@Override
	public void startTV() {
		System.out.println("Philips: start TV");
	}

	@Override
	public void stopTV() {
		System.out.println("Philips: stop TV");
	}

	@Override
	public void channelUp() {
		System.out.println("Philips: channel UP");
	}

	@Override
	public void channelDown() {
		System.out.println("Philips: channel Down");
	}

	@Override
	public void goToChannel(int channel) {
		System.out.println("Philips: go to channel: " + channel);
	}
	
	public void method() {
		//System.out.println(KEYS);
		System.out.println(IDVDRemoteController.KEYS);
//		System.out.println(ITVRemoteController.KEYS);
	}

}
