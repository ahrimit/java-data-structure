package dsgnpattn.composite;

import dsgnpattn.composite.example.Computer;
import dsgnpattn.composite.example.Keyboard;
import dsgnpattn.composite.example.Mouse;

public class CompositeMain {

	public static void main(String[] args) {
		Computer pc = new Computer();
		pc.addDevice(new Keyboard(10000, 2));
		pc.addDevice(new Mouse(3000, 1));
		
		System.out.println(String.format("price : %d원, power : %d W", pc.getPrice(), pc.getPower()));
	}

}
