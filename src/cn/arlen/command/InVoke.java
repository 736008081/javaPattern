package cn.arlen.command;

public class InVoke {

	private ICommand command;
	
	public InVoke(ICommand command) {
		this.command = command;
	}
	
	public void action(){
		command.exe();
	}
	
}
