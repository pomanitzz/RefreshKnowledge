package theme.patterns.observer.observer;

import theme.patterns.observer.dto.MeasureDto;
import theme.patterns.observer.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {
    private WeatherData weatherData;
    private MeasureDto measureDto;

    public CurrentConditionsDisplay(WeatherData weatherData) {
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
                                CurrentCondition:
                                     temperature: %.2f,
                                        humidity: %.2f,
                                        pressure: %.2f
                                """,
                        measureDto.getTemperature(), measureDto.getHumidity(), measureDto.getPressure()
                )
        );
    }
}
