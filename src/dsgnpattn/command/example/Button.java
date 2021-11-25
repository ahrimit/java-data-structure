package dsgnpattn.command.example;

public class Button {
	private Command theCommand;
	
	public Button(Command command) {
		this.theCommand = command;
	}	
	
	public void setTheCommand(Command theCommand) {
		this.theCommand = theCommand;
	}

	public void pressed() {
		theCommand.execute();
	}
}
