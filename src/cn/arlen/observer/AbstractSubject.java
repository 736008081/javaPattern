package cn.arlen.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements ISubject{

	private Vector<Observer> vectors = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		vectors.add(observer);
		
	}

	@Override
	public void delete(Observer observer) {
		vectors.remove(observer);	
	}

	@Override
	public void notifyAllObserver() {
		Enumeration<Observer> enumeration = vectors.elements();
		while(enumeration.hasMoreElements()){
			enumeration.nextElement().update();
		}
		
	}
}
