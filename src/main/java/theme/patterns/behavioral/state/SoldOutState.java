package theme.patterns.behavioral.state;

public class SoldOutState implements State {
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String insertQuarter() {
        return "have no gum";
    }

    @Override
    public String ejectQuarter() {
        return "no action";
    }

    @Override
    public String turnCrank() {
        return "no action";
    }

    @Override
    public String dispense() {
        return "no action";
    }

    @Override
    public String toString() {
        return "SoldOutState";
    }
}
