package dsgnpattn.strategy.example;

public class FlyingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("fly");
	}

}
