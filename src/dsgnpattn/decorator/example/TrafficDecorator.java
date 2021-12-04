package dsgnpattn.decorator.example;

public class TrafficDecorator extends DisplayDecorator{

	public TrafficDecorator(Display displayDecorator) {
		super(displayDecorator);
	}
	
	public void draw() {
		super.draw();
		drawTraffic();
	}

	private void drawTraffic() {
		System.out.println("교통량 표시");
	}
}
