package dsgnpattn.observer.example;

public interface Observer {
	/**
	 * subject의 변경이 통보됐을 때 처리
	 */
	public void update();	
}
