package cn.arlen.singleton;

/**
 * 线程安全，但同样不完美
 * @author itservice
 *
 */
public class Singleton2 {
	
	private static Singleton2 instance;
	
	private Singleton2(){
		//防止被实例化
	}
	
	public static Singleton2 getInstance(){
		if(instance == null){
			synchronized (instance) {
				if(instance == null){
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
	
	//如果该对象被序列化，可以保证前后序列化一致
	public Object readObject(){
		return instance;
	}
}
