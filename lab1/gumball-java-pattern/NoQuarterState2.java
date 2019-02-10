
public class NoQuarterState2 implements State {
	GumballMachine2 gumballMachineB;

	public NoQuarterState2(GumballMachine2 gumballMachineB) {
		this.gumballMachineB = gumballMachineB;
	}

	public void insertQuarter() {
		System.out.println("You inserted the first quarter");
		gumballMachineB.setState(gumballMachineB.getHasOneQuarterState());
	}
	
	public void insertCoin(int coin) {
		
	}
	

	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
	
	public void ejectCoin() {
		
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for the first quarter";
	}
}
