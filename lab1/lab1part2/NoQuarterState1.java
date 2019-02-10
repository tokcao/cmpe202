
public class NoQuarterState1 implements State {
	GumballMachine1 gumballMachine;

	public NoQuarterState1(GumballMachine1 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
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
		return "waiting for quarter";
	}
}
