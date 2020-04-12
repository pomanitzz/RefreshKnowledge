package theme.patterns.behavioral.observer.subject;

import theme.patterns.behavioral.observer.dto.MeasureDto;
import theme.patterns.behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private double pressure;

    private final List<Observer> observers;
    private boolean changed = false;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void measureChanged(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            observers.forEach(observer -> observer.update(new MeasureDto(temperature, humidity, pressure)));
            changed = false;
        }
    }

    public void setChanged() {
        this.changed = true;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
