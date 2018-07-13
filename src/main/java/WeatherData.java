import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private double temperature;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
        temperature = 0.0;
        pressure = 0.0;
    }

    public void RegisterObserver(Observer observer) {
        observers.add(observer);
    }

    public void RemoveObserver(Observer observer) {
        observers.remove(observer);
    }

    public void NotifyObservers() {
        for(Observer observer: observers) {
            observer.update();
        }
    }

    public void SetMeasurements(double temperature, double pressure) {
        this.temperature = temperature;
        this.pressure= pressure;
        NotifyObservers();
    }

    public double GetTemperature() {
        return temperature;
    }

    public double GetPressure() {
        return pressure;
    }
}
