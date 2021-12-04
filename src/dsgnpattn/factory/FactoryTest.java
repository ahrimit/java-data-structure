package dsgnpattn.factory;

import org.junit.Test;

import dsgnpattn.factory.example.ElevatorManager;
import dsgnpattn.factory.example.SchedulingStrategyID;

public class FactoryTest {

	@Test
	public void test_example() {
		ElevatorManager elevator = new ElevatorManager(5, SchedulingStrategyID.RESPONSE_TIME);
		elevator.requestElevator(3);
	}
}
