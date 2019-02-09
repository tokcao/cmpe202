import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String gumballMachine1 = "1. Cost: 25 cents. Accepts only Quarters.";
        String gumballMachine2 = "2. Cost: 50 cents. Accepts only Quarters.";
        String gumballMachine3 = "3. Cost: 50 cents. Accepts All coins (i.e. nickles, dimes, & quarters)";

        System.out.println("System starts!");
        System.out.println("Below is the list of three different types of GumballMachine:");
        System.out.println(gumballMachine1);
        System.out.println(gumballMachine2);
        System.out.println(gumballMachine3);
        System.out.println("Please choose which one you want to play by entering numbers 1, 2, or 3: ");

        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
//        input.close();
//        switch (type) {
//            case 1:
        if (type == 1) {
            System.out.println("The GumballMachine you have chosen is:");
            System.out.println(gumballMachine1);
            GumballMachine1 gumballMachineA = new GumballMachine1(5);
            gumballMachineA.turnCrank();
//                break;
//
//            default:
//                System.out.println("Please enter the number 1, 2, or 3!");
//                break;
        } else if (type == 2) {
            System.out.println("The GumballMachine you have chosen is:");
            System.out.println(gumballMachine2);
            GumballMachine2 gumballMachineB = new GumballMachine2(5);
            gumballMachineB.turnCrank();
        }

        else{
            System.out.println("The GumballMachine you have chosen is:");
            System.out.println(gumballMachine3);
            GumballMachine3 gumballMachineC = new GumballMachine3(5);
            gumballMachineC.turnCrank();
        }

//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter( 25 );
//		gumballMachine.turnCrank();
//		System.out.println();
//
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter( 25 );
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter( 25 );
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);

        input.close();

    }
}
