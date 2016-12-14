package cn.arlen.state;

public class Context {

	public State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void method(){
		if(state.getValue().equals("method1")){
			state.method1();
		}else{
			state.method2();
		}
	}
	
}
