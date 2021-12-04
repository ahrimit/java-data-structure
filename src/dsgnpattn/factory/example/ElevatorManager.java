package dsgnpattn.factory.example;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private SchedulingStrategyID strategyId;
	private List<ElevateController> controllers;
	
	public ElevatorManager(int controllerCnt, SchedulingStrategyID strategyId) {
		this.strategyId = strategyId;
		controllers = new ArrayList<ElevateController>();
		
		for(int i = 0 ; i < controllerCnt; i++) {
			controllers.add(new ElevateController(i + 1));
		}
		
	}
	
	public void requestElevator(int dest) {
		ElevatorScheduler scheduler = ScheduleFactory.getScheduler(strategyId);
		int elevatorId = scheduler.selectElevator();
		
		controllers.get(elevatorId).gotoFloor(dest);
		
	}

	private class ElevateController {
		private int id;
		private int floor;
		
		ElevateController(int id) {
			this.id = id;
			floor = 1;
		}
		
		void gotoFloor(int dest) {
			System.out.print(String.format("엘리베이터[%d] %d층으로 이동" ,id, floor));
		}
		
	}
	
}
