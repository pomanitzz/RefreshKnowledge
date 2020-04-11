package theme.patterns.behavioural.observer.observer;

import theme.patterns.behavioural.observer.dto.MeasureDto;
import theme.patterns.behavioural.observer.subject.WeatherData;

public class StatisticsDisplay implements Observer, Display {
    private WeatherData weatherData;
    private MeasureDto measureDto;

    public StatisticsDisplay(WeatherData weatherData) {
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
                                StatisticsDisplay:
                                      temperature: %.2f,
                                      humidity: %.2f,
                                      pressure: %.2f
                                """,
                        measureDto.getTemperature(), measureDto.getHumidity(), measureDto.getPressure()
                )
        );
    }


}
