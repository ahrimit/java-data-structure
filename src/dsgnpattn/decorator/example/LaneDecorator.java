package dsgnpattn.decorator.example;

public class LaneDecorator extends DisplayDecorator{

	public LaneDecorator(Display displayDecorator) {
		super(displayDecorator);
	}
	
	public void draw() {
		super.draw();
		drawLane();
	}

	private void drawLane() {
		System.out.println("차선그리기");
	}
}
