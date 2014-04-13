package less.lesson10;

public class RemotesDemo {
	public static void main(String[] args) {
		IDVDRemoteController dvdRemote = new PhilipsRemoteController();
		dvdRemote.insertDisc();
		dvdRemote.play();
		dvdRemote.stop();
		dvdRemote.eject();
		//dvdRemote.startTV();
		
		ITVRemoteController tvRemote = (ITVRemoteController) dvdRemote;
		tvRemote.startTV();
		
		PhilipsRemoteController philipsRemote = (PhilipsRemoteController) tvRemote;
		philipsRemote.startTV();
		philipsRemote.play();
		
		PhilipsRemoteController philips = new PhilipsRemoteController();
		philips.play();
		philips.startTV();
		
		System.out.println(IDVDRemoteController.BATTERY_VOLTAGE);
		System.out.println(IDVDRemoteController.KEYS);
	
		//System.out.println(PhilipsRemoteController.KEYS);
		
	}
}
