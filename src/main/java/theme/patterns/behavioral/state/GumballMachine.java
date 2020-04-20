package theme.patterns.behavioral.state;

public class GumballMachine {
    private State noQuarter;
    private State hasQuarter;
    private State sold;
    private State soldOut;

    private State currentState;
    private int currentGumBallCount;

    public GumballMachine(int currentGumBallCount) {
        this.currentGumBallCount = currentGumBallCount;
        this.noQuarter = new NoQuarterState(this);
        this.hasQuarter = new HasQuarterState(this);
        this.sold = new SoldState(this);
        this.soldOut = new SoldOutState(this);
        this.currentState = noQuarter;
    }

    public String insertQuarter() {
        return this.currentState.insertQuarter();
    }

    public String ejectQuarter() {
        return this.currentState.ejectQuarter();
    }

    public String turnCrank() {
        String result = this.currentState.turnCrank();
        result += " " + this.currentState.dispense();
        return result;
    }

    public int getCurrentGumBallCount() {
        return currentGumBallCount;
    }

    public void setCurrentGumBallCount(int currentGumBallCount) {
        this.currentGumBallCount = currentGumBallCount;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public void setNoQuarter(State noQuarter) {
        this.noQuarter = noQuarter;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public void setHasQuarter(State hasQuarter) {
        this.hasQuarter = hasQuarter;
    }

    public State getSold() {
        return sold;
    }

    public void setSold(State sold) {
        this.sold = sold;
    }

    public State getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(State soldOut) {
        this.soldOut = soldOut;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
