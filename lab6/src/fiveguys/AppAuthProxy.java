/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package fiveguys;

/**
 * Authentication Proxy for App Controller
 */
public class AppAuthProxy implements IApp {
    
    private IApp app = new AppController() ;

    private boolean isPortrait = true;

    public AppAuthProxy() {



    }

    public void order(int n){
        app.order(n);
    }
    /**
    * Switch to Landscape View
    */
    public void receipt() {
            app.receipt();
    }

    /**
     * Switch to Portrait View
     */
    public void packingSlip() {
            app.packingSlip();
    }

    /**
     * User Touch at X,Y Coordinates
     * @param x X Coordinate
     * @param y Y Coordinate
     */
    public void touch(int x, int y) {
            app.touch(x, y);
    }

    /**
     * Display Screen Contents to Terminal
     */
    public void display() {
        System.out.println( screenContents() ) ;
    }

    /**
     * Get Class Name of Screen
     * @return Class Name of Current Screen
     */
    public String screen() {
        return "";

    }

    /**
     * Get Screen Contents as a String
     * @return Screen Contents of Current Screen
     */
    public String screenContents() {
            return app.screenContents() ;

    }


    /**
     * Select a Menu Command
     * @param c Menu Option (A, B, C, E, or E)
     */
    public void execute( String c ) {
            app.execute( c ) ;
    }


    @Override
    public void execute( int x, int y) {
            app.execute( x, y );
    }


    /**
     * Navigate to Previous Screen
     */
    public void prev() {
            app.prev() ;
    }

    /**
     * Navigate to Next Screen
     */
    public void next() {
            app.next() ;
    }

    /**
     * Receive Authenticated Event from Authenticator
     */

}
