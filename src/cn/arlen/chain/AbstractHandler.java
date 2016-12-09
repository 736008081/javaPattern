package cn.arlen.chain;

public abstract class AbstractHandler {
	
	private IHandler handler;
	
	public void setHandler(IHandler handler){
		this.handler = handler;
	}
	
	public IHandler getHandler(){
		return handler;
	}

}
