package theme.patterns.behavioral.state;

public class HasQuarterState implements State {
    private final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String insertQuarter() {
        return "no action";
    }

    @Override
    public String ejectQuarter() {
        this.gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
        return "ejected";
    }

    @Override
    public String turnCrank() {
        this.gumballMachine.setCurrentState(gumballMachine.getSold());
        return "turned";
    }

    @Override
    public String dispense() {
        return "no action";
    }

    @Override
    public String toString() {
        return "HasQuarterState";
    }
}
