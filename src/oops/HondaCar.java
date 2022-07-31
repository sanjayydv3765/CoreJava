package oops;

public class HondaCar implements CarInterface {

	@Override
	public void start() {
System.out.println("start the car");		
	}

	@Override
	public void stop() {
		System.out.println("Stop the car");
		
	}

}
