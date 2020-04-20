package theme.patterns.behavioral.state;

public class NoQuarterState implements State {
    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String insertQuarter() {
        if (gumballMachine.getCurrentGumBallCount() == 0) {
            return "have no gum";
        }
        gumballMachine.setCurrentState(gumballMachine.getHasQuarter());
        return "inserted";
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
        return "NoQuarterState";
    }
}
