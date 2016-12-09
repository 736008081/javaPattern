package cn.arlen.template;

public abstract class AbstractCalulate {

	public final int calulate(String exp,String opt){
		int arrayInt[] = split(exp,opt);
		return calulate(arrayInt[0],arrayInt[1]);
	}
	
	abstract public int calulate(int number1,int number2);
	
	private int[] split(String exp,String opt){
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
	
}
