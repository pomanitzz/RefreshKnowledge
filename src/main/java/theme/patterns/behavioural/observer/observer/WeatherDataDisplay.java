package theme.patterns.behavioural.observer.observer;

import theme.patterns.behavioural.observer.subject.WeatherData;

public abstract class WeatherDataDisplay {
    private final WeatherData weatherData;

    public WeatherDataDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public String getWeatherDataInfo() {
        return String.format(
                "temperature: %.2f, humidity: %.2f, pressure: %.2f",
                weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure()
        );
    }
}
