package theme.patterns.behavioral.observer.observer;

import theme.patterns.behavioral.observer.dto.MeasureDto;

public interface Observer {
    void update(MeasureDto dto);
}
