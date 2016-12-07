package cn.arlen.decorator;

public class Decorator implements ISourceable{
	
	private ISourceable sourceable;
	public Decorator(ISourceable sourceable) {
		this.sourceable = sourceable;
	}

	@Override
	public void method() {
		this.sourceable.method();
		System.out.println("���ǵڶ���source");
		
	}

}
