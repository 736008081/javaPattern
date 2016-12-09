package cn.arlen.command;

public class MyCommand implements ICommand{

	private Received received;
	
	public MyCommand(Received received) {
		this.received = received;
	}
	
	@Override
	public void exe() {
		received.action();
	}

}
