package dsgnpattn.factory.example;

public class ResponseTimeScheduler implements ElevatorScheduler{

	@Override
	public int selectElevator() {
		System.out.println("대기시간 최소 로직 적용");
		return 1;
	}

}
