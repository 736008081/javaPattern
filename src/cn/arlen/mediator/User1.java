package cn.arlen.mediator;

public class User1 extends User{

	public User1(IMediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user1 start work");
	}

}
