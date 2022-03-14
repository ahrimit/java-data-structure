package dsgnpattn.decorator;

import dsgnpattn.decorator.example.Display;
import dsgnpattn.decorator.example.LaneDecorator;
import dsgnpattn.decorator.example.RoadDisplay;
import dsgnpattn.decorator.example.TrafficDecorator;

public class DecoratorMain {

	public static void main(String[] args) {
		Display road = new RoadDisplay();
		road.draw();
		System.out.println("---------------------------");
		
		Display roadWithLane = new LaneDecorator(road);
		roadWithLane.draw();
		System.out.println("---------------------------");
		
		Display roadWithTraffic = new TrafficDecorator(road);
		roadWithTraffic.draw();
		System.out.println("---------------------------");
		
	}

}
