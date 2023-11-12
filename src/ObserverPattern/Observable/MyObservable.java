package ObserverPattern.Observable;

import ObserverPattern.Observer.Observer;

import java.util.ArrayList;

public class MyObservable {
    ArrayList<Observer> subscriber = new ArrayList<>();
    public void addObservable(Observer arg){
        subscriber.add(arg);
    }
    public void deleteObservable(Observer arg){
    subscriber.remove(arg);
    }
    public void notifyObservers(){
        for (Observer observer:
            subscriber) {
            observer.update(this,observer);
        }
    }
}
