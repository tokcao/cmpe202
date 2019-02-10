
public class SoldOutState2 implements State{
	GumballMachine2 gumballMachine;

	public SoldOutState2(GumballMachine2 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	
	public void insertCoin(int coin) {
		
	}
	
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}

	public void ejectCoin() {
		
	}
	
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "sold out";
	}
}
