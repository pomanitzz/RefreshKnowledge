package theme.patterns.behavioural.observer;

import theme.patterns.behavioural.observer.observer.CurrentConditionsDisplay;
import theme.patterns.behavioural.observer.observer.ForecastDisplay;
import theme.patterns.behavioural.observer.observer.StatisticsDisplay;
import theme.patterns.behavioural.observer.subject.WeatherData;

public class ObserverSimulator {
    public static void main(String[] args) {
        var weatherData = new WeatherData();

        var currentCondition = new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setChanged();
        weatherData.measureChanged(1D, 2D, 3D);

        System.out.println("- - - - -");

        weatherData.removeObserver(currentCondition);
        weatherData.setChanged();
        weatherData.measureChanged(3D, 3D, 3D);
    }
}
