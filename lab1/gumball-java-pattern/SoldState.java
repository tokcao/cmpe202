
public class SoldState implements State {

	GumballMachine1 gumballMachine;

	public SoldState(GumballMachine1 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	public void insertCoin(int coin) {
		
	}
	
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
	
	public void ejectCoin() {
		
	}

	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	public String toString() {
		return "dispensing a gumball";
	}
}
