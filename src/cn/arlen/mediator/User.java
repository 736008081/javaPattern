package cn.arlen.mediator;

public abstract class User {
	
	private IMediator mediator;
	
	public User(IMediator mediator) {
		this.mediator = mediator;
	}
	
	public IMediator getIMediator(){
		return mediator;
	}
	
    public abstract void work();
	
}
