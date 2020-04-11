package theme.patterns.behavioural.observer.observer;

import theme.patterns.behavioural.observer.dto.MeasureDto;

public interface Observer {
    void update(MeasureDto dto);
}
