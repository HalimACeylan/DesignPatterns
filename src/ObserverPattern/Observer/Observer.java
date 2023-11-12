package ObserverPattern.Observer;

import ObserverPattern.Observable.MyObservable;

public interface Observer {
    void update(MyObservable obs, Object arg);
}
