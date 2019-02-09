import java.util.Scanner;

public class GumballMachine2 implements BasicGumballMachine {

    private int num_gumballs;
    private boolean has_quarter;

    private Character choice;

    public String toString() {
        return "GumballMachine2";
    }

    public GumballMachine2(int size) {
        // Initialize instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    //    @Override
    public void insertQuarter() {
        // TODO Auto-generated method stub
        Scanner coinInserted = new Scanner(System.in);

        do {
            if (coinInserted.hasNextInt()) {
                int coin = coinInserted.nextInt();
                if (coin == 25) {
                    this.has_quarter = true;
                } else {
                    this.has_quarter = false;
                    System.out.println("Please insert a Quarter.");
                }
            }
        } while (!this.has_quarter);
//        coinInserted.close();
    }

    //    @Override
    public void insertCoin() {
        // TODO Auto-generated method stub

    }

    //    @Override
    public void turnCrank() {
        do {
            System.out.println(this.num_gumballs + " Gumball left.");

            int balance = 0;
            System.out.println("Current balance: " + balance);
            System.out.println("Please insert coin.");
            insertQuarter();
            this.has_quarter = false;
            balance += 25;
            System.out.println("Current balance: " + balance);
            System.out.println("Please insert more coin.");
            insertQuarter();
            balance += 25;
            if (balance == 50) {
                if (this.num_gumballs > 0) {
                    this.num_gumballs--;
                    this.has_quarter = false;
                    System.out.println("Thanks for your quarters.  Gumball Ejected!");
                    System.out.println("Do you want to play another round? Y/N");
                    Scanner userInput = new Scanner(System.in);
                    this.choice = userInput.findInLine(".").charAt(0);
                    if (this.choice == 'N' || this.choice == 'n') {
                        System.out.println("Have a good day!");
                        System.exit(0);
                    }
                }
            }
        } while (this.num_gumballs > 0 && (choice == 'Y' || choice == 'y'));
        if (this.num_gumballs == 0) {
            System.out.println("No More Gumballs!  Sorry, can't return your quarter.");
        }
    }
}
