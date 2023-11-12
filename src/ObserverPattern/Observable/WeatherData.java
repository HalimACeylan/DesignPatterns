package ObserverPattern.Observable;

public class WeatherData extends MyObservable{
    private float temperatureData;
    private float humidity;
    private  float pressure;

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperatureData, float humidity, float pressure){
        this.humidity = humidity;
        this.temperatureData = temperatureData;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperatureData() {
        return temperatureData;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
