package cn.arlen.observer;

public class Subject1 implements Observer{

	@Override
	public void update() {
		System.out.println("subject1 has received");
	}

}
