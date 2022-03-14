package dsgnpattn.strategy;

import dsgnpattn.strategy.example.Dog;
import dsgnpattn.strategy.example.FlyingStrategy;
import dsgnpattn.strategy.example.Parrot;
import dsgnpattn.strategy.example.Pet;
import dsgnpattn.strategy.example.WalkingStrategy;

public class StrategyMain {

	public static void main(String[] args) {
		Pet parrot = new Parrot("parrot");
		parrot.setMovingStrategy(new FlyingStrategy());
		Pet dog = new Dog("dog");
		dog.setMovingStrategy(new WalkingStrategy());
		
		parrot.move();
		dog.move();
	}

}
