
public class HasEnoughCoinState implements State {
	GumballMachine3 gumballMachine;
 
	public HasEnoughCoinState(GumballMachine3 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
    
	public void insertQuarter() {
		
	}
	
	public void insertCoin(int coin) {
		System.out.println("You can't insert more coin");
	}
	
 
	public void ejectQuarter() {
		
	}
	
	public void ejectCoin() {
		System.out.println("All coins returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
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
