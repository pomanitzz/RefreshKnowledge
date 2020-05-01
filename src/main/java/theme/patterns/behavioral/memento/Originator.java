package theme.patterns.behavioral.memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public String getStateFromMemento(Memento memento) {
        state = memento.getState();
        return state;
    }
}
