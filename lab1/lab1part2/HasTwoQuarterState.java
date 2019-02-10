
public class HasTwoQuarterState implements State{
	GumballMachine2 gumballMachine;

	public HasTwoQuarterState(GumballMachine2 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	public void insertCoin(int coin) {
		
	}
	
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getHasOneQuarterState());
	}
	
	public void ejectCoin() {
		
	}

	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "waiting for turn of crank";
	}
}
