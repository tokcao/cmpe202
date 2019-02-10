
public class HasOneQuarterState implements State {
	GumballMachine2 gumballMachineB;

	public HasOneQuarterState(GumballMachine2 gumballMachineB) {
		this.gumballMachineB = gumballMachineB;
	}

	public void insertQuarter() {
		System.out.println("You inserted the second quarter");
		gumballMachineB.setState(gumballMachineB.getHasTwoQuarterState());
	}

	public void insertCoin(int coin) {
		
	}
	
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachineB.setState(gumballMachineB.getNoQuarterState());
	}
	
	public void ejectCoin() {
		
	}

	public void turnCrank() {
		System.out.println("You turned, but you need to insert one more quarter");
	}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "waiting for one more quarter";
	}
}
