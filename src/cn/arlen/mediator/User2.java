package cn.arlen.mediator;

public class User2 extends User{

	public User2(IMediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("User2 start work");
	}

}
