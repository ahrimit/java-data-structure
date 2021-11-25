package dsgnpattn.observer.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void detachObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
}
