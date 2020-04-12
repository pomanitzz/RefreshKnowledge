package theme.patterns.behavioural.observer;

import org.junit.Assert;
import org.junit.Test;
import theme.patterns.behavioural.observer.observer.CurrentConditionsDisplay;
import theme.patterns.behavioural.observer.observer.ForecastDisplay;
import theme.patterns.behavioural.observer.observer.StatisticsDisplay;
import theme.patterns.behavioural.observer.subject.WeatherData;

public class ObserverSimulatorTest {

    @Test
    public void testWeatherData() {
        var weatherData = new WeatherData();

        var currentCondition = new CurrentConditionsDisplay(weatherData);
        var statisticsDisplay = new StatisticsDisplay(weatherData);
        var forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setChanged();
        weatherData.measureChanged(1D, 2D, 3D);

        Assert.assertEquals("temperature: 1,00, humidity: 2,00, pressure: 3,00", currentCondition.getWeatherDataInfo());
        Assert.assertEquals("temperature: 1,00, humidity: 2,00, pressure: 3,00", statisticsDisplay.getWeatherDataInfo());
        Assert.assertEquals("temperature: 1,00, humidity: 2,00, pressure: 3,00", forecastDisplay.getWeatherDataInfo());
    }
}
