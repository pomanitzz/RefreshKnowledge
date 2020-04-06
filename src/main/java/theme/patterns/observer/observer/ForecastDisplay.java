package theme.patterns.observer.observer;

import theme.patterns.observer.dto.MeasureDto;
import theme.patterns.observer.subject.WeatherData;

public class ForecastDisplay implements Observer, Display {
    private WeatherData weatherData;
    private MeasureDto measureDto;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(MeasureDto measureDto) {
        this.measureDto = measureDto;
        display();
    }

    @Override
    public void display() {
        System.out.println(
                String.format(
                        """
                                ForecastDisplay:
                                      temperature: %.2f,
                                      humidity: %.2f,
                                      pressure: %.2f
                                """,
                        measureDto.getTemperature(), measureDto.getHumidity(), measureDto.getPressure()
                )
        );
    }
}
