package cn.arlen.singleton;

/**
 * ��ԱȽ������ĵ���ģʽ
 * @author itservice
 *
 */
public class SingletonPerfect {

	private SingletonPerfect(){
		
	}
	
	private static class singletonFactory{
		private static SingletonPerfect instance = new SingletonPerfect();
	}
	
	public static SingletonPerfect getInstance(){
		return singletonFactory.instance;
	}
	
	public Object readObject(){
		return getInstance();
	}
	
	public void sendMail(){
		System.out.println("����ģʽ�����ʼ�");
	}
	
}
