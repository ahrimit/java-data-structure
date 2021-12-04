package dsgnpattn.template.example;

public abstract class Motor {
	
	public void move() {
		// move logic
		System.out.println("common move logic start");
		moveMotor();
		System.out.println("common move logic end");
	}
	
	public abstract void moveMotor();

}
