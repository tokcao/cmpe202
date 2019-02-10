
public class GumballMachine3 implements GumballMachine {


	State noCoinState;
	State hasEnoughCoinState;
	State soldOutState3;
	State soldState3;
	
	State state = soldOutState3;
	int count = 0;

	public GumballMachine3(int numberGumballs) {

		noCoinState = new NoCoinState(this);
		hasEnoughCoinState = new HasEnoughCoinState(this);
		soldState3 = new SoldState3(this);
		soldOutState3 = new SoldOutState3(this);
		
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noCoinState;
		}

	}


	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void insertCoin(int coin) {
		state.insertCoin(coin);
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void ejectCoin() {
		state.ejectCoin();
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
	public State getNoCoinState() {
		return noCoinState;
	}
	
	public State getHasEnoughCoinState() {
		return hasEnoughCoinState;
	}
	
	
	public State getSoldOutState() {
		return soldOutState3;
	}

	public State getSoldState() {
		return soldState3;
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
