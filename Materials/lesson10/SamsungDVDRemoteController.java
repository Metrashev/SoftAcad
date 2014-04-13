package less.lesson10;

public class SamsungDVDRemoteController implements IDVDRemoteController {

	@Override
	public void play() {
		System.out.println("Samsung: play");
	}

	@Override
	public void stop() {
		System.out.println("Samsung: stop");
	}

	@Override
	public void insertDisc() {
		System.out.println("Samsung: insert CD");
	}

	@Override
	public void eject() {
		System.out.println("Samsung: eject");
	}

}
