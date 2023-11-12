package ObserverPattern;

import ObserverPattern.DisplayElements.CurrentConditionsDisplay;
import ObserverPattern.Observable.WeatherData;

public class Test {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentConditionsDisplay screen1 = new CurrentConditionsDisplay(data);
        CurrentConditionsDisplay screen2 = new CurrentConditionsDisplay(data);
        CurrentConditionsDisplay screen3 = new CurrentConditionsDisplay(data);
        data.setMeasurements(1.4f,1.5f,2.1f);
        screen1.display();
        screen2.display();
        data.setMeasurements(1.4f,2f,3f);
        screen2.display();
        screen3.display();
        data.deleteObservable(screen3);
        data.setMeasurements(3f,3f,4f);
        screen3.display();

    }
}
