
public class GumballMachine2 implements GumballMachine {

	State noQuarterState2;
	State hasOneQuarterState;
	State hasTwoQuarterState;
	State soldOutState2;
	State soldState2;
	
	State state = soldOutState2;
	int count = 0;

	public GumballMachine2(int numberGumballs) {
		hasOneQuarterState = new HasOneQuarterState(this);
		hasTwoQuarterState = new HasTwoQuarterState(this);
		noQuarterState2 = new NoQuarterState2(this);
		soldState2 = new SoldState2(this);
		soldOutState2 = new SoldOutState2(this);
		
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState2;
		}

	}


	void refill(int count) {
		this.count = count;
		state = noQuarterState2;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public int getCount() {
		return count;
	}

	

	public State getState() {
		return state;
	}
	public State getNoQuarterState() {
		return noQuarterState2;
	}
	
	public State getHasOneQuarterState() {
		return hasOneQuarterState;
	}
	
	public State getHasTwoQuarterState() {
		return hasTwoQuarterState;
	}
	
	public State getSoldOutState() {
		return soldOutState2;
	}

	public State getSoldState() {
		return soldState2;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model B");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();

	}
}
