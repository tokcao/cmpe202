public class SoldOutState3 implements State{
	GumballMachine3 gumballMachine;

	public SoldOutState3(GumballMachine3 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		
	}
	
	public void insertCoin(int coin) {
		System.out.println("You can't insert any coin, the machine is sold out");
	}
	

	public void ejectQuarter() {
		
	}
	
	public void ejectCoin() {
		System.out.println("You can't eject, you haven't inserted any coin yet");
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
