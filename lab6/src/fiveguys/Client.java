package fiveguys;

public class Client {

    public static void runTest()
    {
        Component receipt = BuildReceipt.getReceipt() ;
//        PrintReceipt printReceipt = new PrintReceipt();
//        printReceipt.contents();
        receipt.printDescription();

    }

    public static void runTest2()
    {
        Component packingSlip = BuildPackingSlip.getPackingSlip();
        packingSlip.printDescription();
    }
}
 
