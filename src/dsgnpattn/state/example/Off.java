package dsgnpattn.state.example;

public class Off implements State{

	@Override
	public void onButtonPushed(Light light) {
		System.out.println("Light on");
		light.setState(new On());
	}

	@Override
	public void offButtonPushed(Light light) {
		System.out.println("No action");
	}

}
