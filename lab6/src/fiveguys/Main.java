/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package fiveguys;

import java.io.Console;
import java.util.Scanner;

/**
 * Main Entry Point.
 */
final class Main {

    /**
     * Prevent Construction.
     */
    private Main() {
        // Utility Class
        return ;
    }

    /**
     * Main App Entry Point.
     * @param args No args expected.
     */
    public static void main(final String[] args) {

//        PrintReceipt printReceipt = new PrintReceipt();
//        printReceipt.contents();
        Client client = new Client();
//        client.runTest();

        IApp app = new AppAuthProxy();
        System.out.println("Below is the Receipt:\n");
        System.out.println("____________________________________________");
        System.out.println("____________________________________________");
        System.out.println(app.screenContents());
        client.runTest();
        System.out.println("____________________________________________");
        System.out.println("____________________________________________");


        System.out.println("\n\n");
        System.out.println("Below is the Packing Slip:\n");
        System.out.println("____________________________________________");
        System.out.println("____________________________________________");
        app.packingSlip();
        System.out.println(app.screenContents());
        client.runTest2();
        System.out.println("____________________________________________");
        System.out.println("____________________________________________");


//        }
    }
}

