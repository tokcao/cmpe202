
import java.util.Scanner;

public class GumballMachine3 implements BasicGumballMachine {

    private int num_gumballs;
    private boolean has_coin;
    private Character choice;

    private int balance = 0;

    public String toString() {
        return "GumballMachine1";
    }

    public GumballMachine3(int size) {
        // Initialize instance variables
        this.num_gumballs = size;
        this.has_coin = false;
    }

    @Override
    public void insertQuarter() {
        // TODO Auto-generated method stub
//        Scanner coinInserted = new Scanner(System.in);
//        int balance = 0;
//        System.out.println("Current balance: " + balance);
//        System.out.println("Please insert coin.");
//        do {
//            if (coinInserted.hasNextInt()) {
//                int coin = coinInserted.nextInt();
//                if (coin == 25) {
//                    this.has_quarter = true;
//                } else {
//                    this.has_quarter = false;
//                    System.out.println("Please insert a Quarter.");
//                }
//            }
//        } while (!this.has_quarter);
////        coinInserted.close();
    }

    //    @Override
    public void insertCoin() {
        // TODO Auto-generated method stub
        Scanner coinInserted = new Scanner(System.in);
        System.out.println("Current balance: " + balance);
        System.out.println("Please insert coin.");
        do {
            if (coinInserted.hasNextInt()) {
                int coin = coinInserted.nextInt();
                balance += coin;
                if (balance >= 50) {
                    this.has_coin = true;
                } else {
                    this.has_coin = false;
                    System.out.println("Current balance: " + balance);
                    System.out.println("Please insert more coins.");
                }
            }
        } while (!has_coin);
    }

    //    @Override
    public void turnCrank() {
        do {

            System.out.println(this.num_gumballs + " Gumball left.");
            balance = 0;
            insertCoin();
            if (this.has_coin) {
//            if (this.num_gumballs > 0) {
                this.num_gumballs--;
                this.has_coin = false;
                System.out.println("Thanks for your coins.  Gumball Ejected!");

                if (this.balance > 50) {
                    int coinReturn = this.balance - 50;
                    System.out.println(coinReturn + " cents returned.");

                }
                System.out.println("Do you want to play another round? Y/N");
                Scanner userInput = new Scanner(System.in);
                this.choice = userInput.findInLine(".").charAt(0);
                if (this.choice == 'N' || this.choice == 'n') {
                    System.out.println("Have a good day!");
                    System.exit(0);
                }
            }

            if (this.num_gumballs == 0) {
                System.out.println("No More Gumballs!  Sorry, can't return your quarter.");

            }
        } while (this.num_gumballs > 0 && (this.choice == 'Y' || this.choice == 'y'));
//		else {
//			System.out.println("Please insert a quarter");
//		}
    }

}



















