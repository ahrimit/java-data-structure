package dsgnpattn.command.example;

public class LampOffCommand implements Command {
	private Lamp theLamp;
	
	public LampOffCommand(Lamp lamp) {
		this.theLamp = lamp;
	}
	
	@Override
	public void execute() {
		theLamp.turnOff();
	}

}
