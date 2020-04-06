package theme.patterns.observer.observer;

import theme.patterns.observer.dto.MeasureDto;

public interface Observer {
    void update(MeasureDto dto);
}
