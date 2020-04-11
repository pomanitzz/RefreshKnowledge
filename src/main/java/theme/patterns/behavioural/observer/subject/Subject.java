package theme.patterns.behavioural.observer.subject;

import theme.patterns.behavioural.observer.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
