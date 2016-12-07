package cn.arlen.singleton;

/**
 * 线程不安全
 * @author itservice
 *
 */
public class Singleton1 {

	private static Singleton1 instance;
	
	private Singleton1(){
		//防止被实例化
	}
	
	public static Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
	//如果该对象被序列化，可以保证前后序列化一致
	public Object readObject(){
		return instance;
	}
}
