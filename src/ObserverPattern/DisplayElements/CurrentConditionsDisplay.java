package ObserverPattern.DisplayElements;

import ObserverPattern.Observable.MyObservable;
import ObserverPattern.Observable.WeatherData;

public class CurrentConditionsDisplay implements DisplayElements{
    MyObservable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(MyObservable observable) {
        this.observable = observable;
        observable.addObservable(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : " + temperature + "F degree " + humidity + " % humidity" );
    }

    @Override
    public void update(MyObservable obs, Object arg) {
        if (obs instanceof WeatherData weatherData) {
            this.temperature = weatherData.getTemperatureData();
            this.humidity = weatherData.getHumidity();
        }
    }
}
