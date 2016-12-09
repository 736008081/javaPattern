package cn.arlen.chain;

public class MyHandler extends AbstractHandler implements IHandler{

	private String name;
	public MyHandler(String name) {
		this.name = name;
	}
	
	@Override
	public void operation() {
		System.out.println("handler"+name);
		if(getHandler() != null){
			getHandler().operation();
		}
		
	}
}
