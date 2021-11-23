package dsgnpattn.state.example;

public class On implements State{

	@Override
	public void onButtonPushed(Light light) {
		System.out.println("No action");
		
	}

	@Override
	public void offButtonPushed(Light light) {
		System.out.println("Light off");
		light.setState(new Off());
		
	}

}
