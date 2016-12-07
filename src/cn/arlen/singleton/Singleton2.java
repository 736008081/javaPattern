package cn.arlen.singleton;

/**
 * �̰߳�ȫ����ͬ��������
 * @author itservice
 *
 */
public class Singleton2 {
	
	private static Singleton2 instance;
	
	private Singleton2(){
		//��ֹ��ʵ����
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
	
	//����ö������л������Ա�֤ǰ�����л�һ��
	public Object readObject(){
		return instance;
	}
}
