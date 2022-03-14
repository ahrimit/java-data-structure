package dsgnpattn.command;

import dsgnpattn.command.example.Button;
import dsgnpattn.command.example.Command;
import dsgnpattn.command.example.Lamp;
import dsgnpattn.command.example.LampOffCommand;
import dsgnpattn.command.example.LampOnCommand;

public class CommandMain {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command command = new LampOffCommand(lamp);
		Button button = new Button(command);
		button.pressed();
		
		button.setTheCommand(new LampOnCommand(lamp));
		button.pressed();
	}

}
