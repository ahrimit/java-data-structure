package dsgnpattn.state.example;

public interface State {
	public void onButtonPushed(Light light);
	public void offButtonPushed(Light light);
}
