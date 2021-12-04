package dsgnpattn.factory.example;

public class ThroughputScheduler implements ElevatorScheduler{

	@Override
	public int selectElevator() {
		System.out.println("처리량 최대 로직 적용");
		return 2;
	}

}
