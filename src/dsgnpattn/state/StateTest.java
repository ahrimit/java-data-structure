package dsgnpattn.state;

import org.junit.Test;

import dsgnpattn.cmm.TestBase;
import dsgnpattn.state.example.Light;

public class StateTest extends TestBase{

	@Test
	public void testLight() {
		Light light = new Light();  //off
		light.offButtonPushed(); 	//off
		light.onButtonPushed();		//on
		light.offButtonPushed();	//off
		light.onButtonPushed();		//on
	}
}
