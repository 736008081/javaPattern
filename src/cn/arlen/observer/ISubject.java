package cn.arlen.observer;

public interface ISubject {

	//增加观察者
	public void add(Observer observer);
	
	//删除观察者
	public void delete(Observer observer);
	
	//通知所有观察者
	public void notifyAllObserver();
	
	//自身操作
	public void operation();
}
