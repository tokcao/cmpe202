
public class GumballMachine1 implements GumballMachine {
	
	State soldOutState1;
	State hasQuarterState;
	State soldState1;
	State noQuarterState1;

	State state = soldOutState1;
	int count = 0;

	public GumballMachine1(int numberGumballs) {
		noQuarterState1 = new NoQuarterState1(this);
		soldOutState1 = new SoldOutState(this);
		soldState1 = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);

		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState1;
		}
		// TODO Auto-generated constructor stub
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
	
	void refill(int count) {
		this.count = count;
		state = noQuarterState1;
	}
	
	public State getNoQuarterState() {
		return noQuarterState1;
	}
	
	public State getSoldOutState() {
		return soldOutState1;
	}

	

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState1;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model A");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();

	}

}
