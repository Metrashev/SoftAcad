package less.lesson10;

public class SonyDVDRemoteController implements IDVDRemoteController {

	@Override
	public void play() {
		System.out.println("Sony: play");
	}

	@Override
	public void stop() {
		System.out.println("Sony: stop");
	}

	@Override
	public void insertDisc() {
		System.out.println("Sony: insert CD");
	}

	@Override
	public void eject() {
		System.out.println("Sony: eject");
	}
	
}
