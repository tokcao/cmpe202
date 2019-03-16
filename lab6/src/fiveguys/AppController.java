/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package fiveguys;


/**
 * Main App Controller Class
 */
public class AppController implements IApp {

    private IScreen receipt;
//
//    private IScreen mycards;
//    private IScreen store;
//    private IScreen rewards;
//    private IScreen payments;
//
//    private IScreen settings;
//
//    private IScreen addCard;
//    private IScreen myCardsOption;
//    private IScreen myCardsMoreOptions;
//
//    private IScreen myCardsPay;

//    private IMenuCommand displayMyCards;
//    private IMenuCommand displayPayments;
//    private IMenuCommand displayRewards;
//    private IMenuCommand doStore;
//
//    private IMenuCommand displaySettings;
//
//    private IMenuCommand displayAddCard;
//    private IMenuCommand displayMyCardsOption;
//    private IMenuCommand displayMyCardsMoreOptions;
//
//    private IMenuCommand displayMyCardsPay;

    private IFrame frame;
    private boolean myCard = false;

    /**
     * Create
     */

    public AppController() {
        receipt = new Receipt(this);

        frame = new Frame(receipt);

        // setup command pattern
//        displayMyCards = new MenuCommand();
//        displayPayments = new MenuCommand();
//        displayRewards = new MenuCommand();
//        doStore = new MenuCommand();
//
//        displaySettings = new MenuCommand();
//
//        displayAddCard = new MenuCommand();
//        displayMyCardsOption = new MenuCommand();
//        displayMyCardsMoreOptions = new MenuCommand();
//
//        displayMyCardsPay = new MenuCommand();

//        displayMyCards.setReceiver(
//                new IMenuReceiver() {
//                    /** Command Action */
//                    public void doAction() {
//                        frame.setCurrentScreen(mycards);
//                    }
//                }
//        );
//        displayPayments.setReceiver(
//                new IMenuReceiver() {
//                    /** Command Action */
//                    public void doAction() {
//                        frame.setCurrentScreen(payments);
//                    }
//                }
//        );
//        displayRewards.setReceiver(
//                new IMenuReceiver() {
//                    /** Command Action */
//                    public void doAction() {
//                        frame.setCurrentScreen(rewards);
//                    }
//                }
//        );
//        doStore.setReceiver(
//                new IMenuReceiver() {
//                    /** Command Action */
//                    public void doAction() {
//                        frame.setCurrentScreen(store);
//                    }
//                }
//        );
//
//        displaySettings.setReceiver(
//                new IMenuReceiver() {
//                    /** Command Action */
//                    public void doAction() {
//                        frame.setCurrentScreen(settings);
//                    }
//                }
//        );
//
//        displayAddCard.setReceiver(
//                new IMenuReceiver() {
//                    /** Command Action */
//                    public void doAction() {
//                        frame.setCurrentScreen(addCard);
//                    }
//                }
//        );
//        displayMyCardsOption.setReceiver(
//                new IMenuReceiver() {
//                    /** Command Action */
//                    public void doAction() {
//                        frame.setCurrentScreen(myCardsOption);
//                    }
//                }
//        );
//        displayMyCardsMoreOptions.setReceiver(
//                new IMenuReceiver() {
//                    /** Command Action */
//                    public void doAction() {
//                        frame.setCurrentScreen(myCardsMoreOptions);
//                    }
//                }
//        );
//
//
//        displayMyCardsPay.setReceiver(
//                new IMenuReceiver() {
//                    /** Command Action */
//                    public void doAction() {
//                        frame.setCurrentScreen(myCardsPay);
//                    }
//                }
//        );
//
//
//        frame.setMenuItem("A", displayMyCards);
//        frame.setMenuItem("B", displayPayments);
//        frame.setMenuItem("C", displayRewards);
//        frame.setMenuItem("D", doStore);
//
//        frame.setMenuItem("E", displaySettings);
//
//        frame.setMenuItem(1, 1, displayAddCard);
//        frame.setMenuItem(2, 1, displayAddCard);
//        frame.setMenuItem(3, 1, displayAddCard);
//        frame.setMenuItem(2, 4, displayMyCardsOption);
//        frame.setMenuItem(1, 7, displayMyCardsMoreOptions);
//        frame.setMenuItem(2, 7, displayMyCardsMoreOptions);
//        frame.setMenuItem(3, 7, displayMyCardsMoreOptions);
//
//        if (myCard) {
//            frame.setMenuItem(3, 3, displayMyCards);
//            myCard = true;
//        }
//        else {
//
//            frame.setMenuItem(3, 3, displayMyCardsPay);
//            myCard = false;
//        }
//        frame.setMenuItem ( 3, 3, displayMyCards );
    }

    public void order(int n){
        frame.order(n);
    }

    /**
     * Switch to Landscape Mode
     */
    public void receipt() {
        frame.receipt();
    }

    /**
     * Switch to Portait Mode
     */
    public void packingSlip() {
        frame.packingSlip();
    }

    /**
     * Send In Touch Events
     *
     * @param x X Coord
     * @param y Y Coord
     */
    public void touch(int x, int y) {
        frame.touch(x, y);
    }

    /**
     * Display Current Screen
     */
    public void display() {
        frame.display();
    }

    /**
     * Execute Menu Bar Command
     *
     * @param c Menu Bar Option (A, B, C, D or E)
     */
    public void execute(String c) {
        frame.cmd(c);
    }


    /**
     * Execute screen Option
     *
     * @param x X Coord
     * @param y Y Coord
     */
    @Override
    public void execute(int x, int y) {
        frame.cmd(x, y);
    }


    /**
     * Navigate to Previous Screen
     */
    public void prev() {
        frame.previousScreen();
    }

    /**
     * Navigate to Next Screen
     */
    public void next() {
        frame.nextScreen();
    }

    /**
     * Get Current Screen Name
     *
     * @return Screen Name
     */
    public String screen() {
        return frame.screen();
    }

    /**
     * Get Current Screen Contents
     *
     * @return Current Screen Contents
     */
    public String screenContents() {
        return frame.contents();

    }

}
