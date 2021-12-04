package dsgnpattn.factory.example;


public class ScheduleFactory {
	public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyId) {
		ElevatorScheduler scheduler = null;
		
		switch (strategyId) {
			case RESPONSE_TIME :
				scheduler = new ResponseTimeScheduler();
				break;
			case THROUGHPUT :
				scheduler = new ThroughputScheduler();
				break;
			default: break;
					
		}
		
		return scheduler;
	}
	
}
