package dsgnpattn.state;

import dsgnpattn.state.example.Light;

public class StateMain {

	public static void main(String[] args) {
		Light light = new Light();  //off
		light.offButtonPushed(); 	//off
		light.onButtonPushed();		//on
		light.offButtonPushed();	//off
		light.onButtonPushed();		//on
	}
}
