package theme.patterns.observer;

import theme.patterns.observer.observer.CurrentConditionsDisplay;
import theme.patterns.observer.observer.ForecastDisplay;
import theme.patterns.observer.observer.StatisticsDisplay;
import theme.patterns.observer.subject.WeatherData;

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
