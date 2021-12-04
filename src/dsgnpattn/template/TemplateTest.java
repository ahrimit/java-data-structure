package dsgnpattn.template;

import org.junit.Test;

import dsgnpattn.template.example.AMotor;
import dsgnpattn.template.example.BMotor;
import dsgnpattn.template.example.Motor;

public class TemplateTest {

	@Test
	public void test_example() {
		Motor aMotor = new AMotor();
		aMotor.move();
		System.out.println("-------------------------------");
		Motor bMotor = new BMotor();
		bMotor.move();
	}
}
