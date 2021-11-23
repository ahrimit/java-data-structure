package dsgnpattn.state.example;

public class Light {

	private State state;
	
	public Light() {
		state = new Off();  //최초 상태
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void onButtonPushed() {
		state.onButtonPushed(this);
	}

	public void offButtonPushed() {
		state.offButtonPushed(this);
	} 
}
