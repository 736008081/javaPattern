package cn.arlen.bridge;

public abstract class Bridge {

	private ISourceabled sourceable;
	
	public void method(){
		sourceable.method();
	}
	
	public ISourceabled getSource(){
		return sourceable;
	}
	
	public void setSource(ISourceabled sourceable){
		this.sourceable = sourceable;
	}
	
}
