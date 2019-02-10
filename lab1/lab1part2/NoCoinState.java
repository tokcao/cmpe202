public class NoCoinState implements State {
	GumballMachine3 gumballMachine;
	private int balance = 0;

	public NoCoinState(GumballMachine3 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {

	}

	public void insertCoin(int coin) {
		balance += coin;
		if (balance < 50) {
			System.out.println("You inserted " + coin + " cents");
//			balance += coin;
			System.out.println("Current balance: " + balance + ", please insert more");
		} else if (balance > 50) {
			int coinReturned = balance - 50;
			System.out.println(coinReturned + " cents returned");
			gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
		} else if (balance == 50) {
			gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
		}
	}

	public void ejectQuarter() {
		
	}

	public void ejectCoin() {
		if (balance > 0) {
			System.out.println(balance + " cents returned");
		} else {
			System.out.println("You haven't inserted any coins");
		}
	}
	
	public void turnCrank() {
		System.out.println("You turned, but there's not enough coins");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for coins";
	}
}
