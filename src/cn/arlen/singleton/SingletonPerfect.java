package cn.arlen.singleton;

/**
 * 相对比较完美的单例模式
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
		System.out.println("单例模式发送邮件");
	}
	
}
