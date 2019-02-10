public class SoldState3 implements State{
	GumballMachine3 gumballMachine;

	public SoldState3(GumballMachine3 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		
	}
	
	public void insertCoin(int coin) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
	

	public void ejectQuarter() {
		
	}
	
	public void ejectCoin() {
		System.out.println("Sorry, you already turned the crank");
	}

	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoCoinState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	public String toString() {
		return "dispensing a gumball";
	}
}
