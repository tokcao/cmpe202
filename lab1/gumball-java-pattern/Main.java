
public class Main {

	public static void main(String[] args) {
		GumballMachine1 gumballMachineA = new GumballMachine1(5);
		
		System.out.println(gumballMachineA);

		gumballMachineA.insertQuarter();
		gumballMachineA.turnCrank();
//		gumballMachineA.ejectQuarter();
		
		System.out.println();
		
		GumballMachine2 gumballMachineB = new GumballMachine2(3);
		System.out.println(gumballMachineB);
		gumballMachineB.insertQuarter();
		gumballMachineB.insertQuarter();
		gumballMachineB.turnCrank();
		
		GumballMachine3 gumballMachineC = new GumballMachine3(2);
		System.out.println(gumballMachineC);
		gumballMachineC.insertCoin(5);
		gumballMachineC.insertCoin(5);
		
		gumballMachineC.insertCoin(45);
		gumballMachineC.ejectCoin();
		gumballMachineC.turnCrank();
//		gumballMachineC.ejectQuarter();
//		gumballMachineB.ejectQuarter();
		
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		
//		System.out.println(gumballMachine);
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		
//		System.out.println(gumballMachine);
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.ejectQuarter();
	}
}
