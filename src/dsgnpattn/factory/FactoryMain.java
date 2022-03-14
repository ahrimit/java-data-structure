package dsgnpattn.factory;

import dsgnpattn.factory.example.ElevatorManager;
import dsgnpattn.factory.example.SchedulingStrategyID;

public class FactoryMain {

	public static void main(String[] args) {
		ElevatorManager elevator = new ElevatorManager(5, SchedulingStrategyID.RESPONSE_TIME);
		elevator.requestElevator(3);
	}

}
