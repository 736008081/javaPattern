package cn.arlen.observer;

public interface ISubject {

	//���ӹ۲���
	public void add(Observer observer);
	
	//ɾ���۲���
	public void delete(Observer observer);
	
	//֪ͨ���й۲���
	public void notifyAllObserver();
	
	//�������
	public void operation();
}
