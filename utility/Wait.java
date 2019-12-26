package utility;

public class Wait {
	
	public static void waitN (Double seconds) {
		// Purpose of this class is to create a method which will wait execution of code for desired period
		
		int sec = seconds.intValue() * 1000;
		
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
