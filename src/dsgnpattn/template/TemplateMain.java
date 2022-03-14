package dsgnpattn.template;

import dsgnpattn.template.example.AMotor;
import dsgnpattn.template.example.BMotor;
import dsgnpattn.template.example.Motor;

public class TemplateMain {

	public static void main(String[] args) {
		Motor aMotor = new AMotor();
		aMotor.move();
		System.out.println("-------------------------------");
		Motor bMotor = new BMotor();
		bMotor.move();
	}

}
