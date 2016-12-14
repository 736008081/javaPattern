package cn.arlen.state;

public class State {
	
	private String value;
	
	public void setValue(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public void method1(){
		System.out.println("first method1 excute");
	}
	
	public void method2(){
		System.out.println("second method2 excute");
	}

}
