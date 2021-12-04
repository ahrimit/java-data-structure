package dsgnpattn.decorator;

import org.junit.Test;

import dsgnpattn.cmm.TestBase;
import dsgnpattn.decorator.example.Display;
import dsgnpattn.decorator.example.LaneDecorator;
import dsgnpattn.decorator.example.RoadDisplay;
import dsgnpattn.decorator.example.TrafficDecorator;

public class DecoratorTest extends TestBase{

	@Test
	public void test_example() {
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
