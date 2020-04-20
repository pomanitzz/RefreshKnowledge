package theme.patterns.behavioral.state;

public class SoldState implements State {
    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String insertQuarter() {
        return "no action";
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
        if (this.gumballMachine.getCurrentGumBallCount() == 1) {
            this.gumballMachine.setCurrentState(this.gumballMachine.getSoldOut());
        } else {
            this.gumballMachine.setCurrentState(this.gumballMachine.getNoQuarter());
        }
        this.gumballMachine.setCurrentGumBallCount(this.gumballMachine.getCurrentGumBallCount() - 1);
        return "dispensed";
    }

    @Override
    public String toString() {
        return "SoldState";
    }
}
