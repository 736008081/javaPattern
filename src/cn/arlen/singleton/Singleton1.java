package cn.arlen.singleton;

/**
 * �̲߳���ȫ
 * @author itservice
 *
 */
public class Singleton1 {

	private static Singleton1 instance;
	
	private Singleton1(){
		//��ֹ��ʵ����
	}
	
	public static Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
	//����ö������л������Ա�֤ǰ�����л�һ��
	public Object readObject(){
		return instance;
	}
}
