package courseUd;
interface camera{
	void shutter();
	void click();
	void record();
}
interface musicPlayer{
	void play();
	void pause();
	void stop();
}
class Phone{
	void call() {
		System.out.println("Calling...");
	}
	void sms() {
		System.out.println("Hiii!!");
	}
}
class smartPhone extends Phone implements musicPlayer, camera{

	@Override
	public void shutter() {
		System.out.println("Guess the shutter speed?!!");		
	}

	@Override
	public void click() {
		System.out.println("Click for an picture!!");		
	}

	@Override
	public void record() {
		System.out.println("Click here to record!!");
		
	}

	@Override
	public void play() {
		System.out.println("Playing music...");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause.");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop!");
		
	}
	
}

public class interfaces {

	public static void main(String[] args) {
        smartPhone sp = new smartPhone();
        
        // ✅ Phone operations
        sp.call();
        sp.sms();
        
        // ✅ Camera operations
        sp.shutter();
        sp.click();
        sp.record();
        
        // ✅ MusicPlayer operations
        sp.play();
        sp.pause();
        sp.stop();
        
        Phone p = new smartPhone(); //UpCasting - Phone reference, SmartPhone object
        p.sms();
        p.call();
        
        camera c = sp;
        c.click();
		
	}

}
