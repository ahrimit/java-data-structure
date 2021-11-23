package dsgnpattn.strategy.example;

public abstract class Pet {
	private String name;
	private MovingStrategy movingStrategy;
	
	public Pet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void move() {
		movingStrategy.move();
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	} 
	
}
