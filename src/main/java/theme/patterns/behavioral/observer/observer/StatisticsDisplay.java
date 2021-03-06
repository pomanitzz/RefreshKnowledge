package theme.patterns.behavioral.observer.observer;

import theme.patterns.behavioral.observer.dto.MeasureDto;
import theme.patterns.behavioral.observer.subject.WeatherData;

public class StatisticsDisplay extends WeatherDataDisplay implements Observer, Display {
    private MeasureDto measureDto;

    public StatisticsDisplay(WeatherData weatherData) {
        super(weatherData);
        weatherData.registerObserver(this);
    }

    @Override
    public void update(MeasureDto measureDto) {
        this.measureDto = measureDto;
        // display();
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
