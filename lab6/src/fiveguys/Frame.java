/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package fiveguys;

/**
 * Frame Class -- Container for Screens
 */
public class Frame implements IFrame {
    private IScreen current;

    Client client = new Client();

    private IOrientationStrategy receiptStrategy;
    private IOrientationStrategy packingSlipStrategy;
    private IOrientationStrategy currentStrategy;
    private boolean islandscapeMode;

    /**
     * Return Screen Name
     *
     * @return Screen Name
     */
    public String screen() {
        return current.name();
    }

    /**
     * Switch to Landscape Strategy
     */
    public void receipt() {
        currentStrategy = receiptStrategy;
    }

    /**
     * Switch to Portrait Strategy
     */
    public void packingSlip() {
        currentStrategy = packingSlipStrategy;
    }

    /**
     * Nav to Previous Screen
     */
    public void previousScreen() {
        // add code here

    }

    /**
     * Nav to Next Screen
     */
    public void nextScreen() {
        // add code here
    }


    /**
     * Helper Debug Dump to STDERR
     *
     * @param str Lines to print
     */
    private void dumpLines(String str) {
        String[] lines = str.split("\r\n|\r|\n");
        for (int i = 0; i < lines.length; i++) {
            System.err.println(i + ": " + lines[i]);
        }
    }

    /**
     * Helper:  Count lines in a String
     *
     * @param str Lines to Count
     * @return Number of Lines Counted
     */
    private int countLines(String str) {

        /**
         // this approach doesn't work in cases: "\n\n"
         String lines = str ;
         String[] split = lines.split("\r\n|\r|\n") ;
         return split.length ;
         */

        if (str == null || str.isEmpty()) {
            return 0;
        }

        int lines = 0;
        int pos = 0;
        while ((pos = str.indexOf("\n", pos) + 1) != 0) {
            lines++;
        }

        return lines;
    }

    /**
     * Helper:  Pad lines for a Screen
     *
     * @param num Lines to Padd
     * @return Padded Lines
     */
    private String padLines(int num) {
        String lines = "";
        for (int i = 0; i < num; i++) {
            System.err.print(".");
            lines += "\n";
        }
        System.err.println("");
        return lines;
    }

    /**
     * Helper:  Pad Spaces for a Line
     *
     * @param num Num Spaces to Pad
     * @return Padded Line
     */
    private String padSpaces(int num) {
        String spaces = "";
        for (int i = 0; i < num; i++)
            spaces += " ";
        return spaces;
    }

    /**
     * Header of FiveGuys
     */
    private String header(){
        String lines = "";
        lines += "\n";
        lines += "                 " + "FIVE GUYS" + "                  ";
        lines += "";
        return lines;
    }

    /**
     * Constructor
     */
    public Frame(IScreen initial) {
        current = initial;

        receiptStrategy = new IOrientationStrategy() {
            /**
             * Display Screen Contents
             * @param s Reference to Screen
             */
            public void display(IScreen s) {
                System.out.println(contents(s));
            }

            /**
             * Return String / Lines for Frame and Screen
             * @param  s [description]
             * @return [description]
             */
            public String contents(IScreen s) {
                String out = "";
                out += "\n";
                int total_space = 44;
                String headerFirstLine = "FIVE GUYS";
                out += padSpaces((total_space - headerFirstLine.length())/2) + headerFirstLine + "\n";
                String headerSecondLine = "BURGERS AND FRIES";
                out += padSpaces((total_space - headerSecondLine.length())/2) + headerSecondLine + "\n";
                String headerThirdLine = "STORE # CA-1294";
                out += padSpaces((total_space - headerThirdLine.length())/2) + headerThirdLine + "\n";
                String headerFourthLine = "5353 ALMADEN EXPY N60";
                out += padSpaces((total_space - headerFourthLine.length())/2) + headerFourthLine + "\n";
                String headerFifthLine = "SAN JOSE, CA 95118";
                out += padSpaces((total_space - headerFifthLine.length())/2) + headerFifthLine + "\n";
                String headerSixthLine = "(P) 408-264-9300";
                out += padSpaces((total_space - headerSixthLine.length())/2) + headerSixthLine + "\n\n";
                String time = "12/1/2016   1:46:54 PM";
                out += padSpaces((total_space - time.length())/2) + time + "\n";
                out += padSpaces((total_space - headerFirstLine.length())/2) + headerFirstLine;




//                out += "===============\n";
//                int nameLen = s.name().length();
//                if (nameLen < 14) {
//                    int pad = (14 - nameLen) / 2;
//                    out += padSpaces(pad);
//                }
//                out += s.name() + "\n";
//                out += "===============\n";
//                String screen = s.display() + "\n";
//                int cnt1 = countLines(screen);
//                int pad1 = (10 - cnt1) / 2;
//                //System.err.println( "cnt1: " + cnt1 ) ;
//                //System.err.println( "pad1: " + pad1 ) ;
//                out += padLines(pad1);
//                out += screen;
//                //dumpLines( out ) ;
//                int cnt2 = countLines(out);
//                int pad2 = 13 - cnt2;
//                //System.err.println( "cnt2: " + cnt2 ) ;
//                //System.err.println( "pad2: " + pad2 ) ;
//                //dumpLines( out ) ;
//                String padlines = padLines(pad2);
//                out += padlines;
//                out += "===============\n";
//                out += "[A][B][C][D][E]\n";
//                dumpLines(out);

                return out;
            }


        };

        packingSlipStrategy = new IOrientationStrategy() {
            /**
             * Display Screen Contents
             * @param s Reference to Screen
             */
            public void display(IScreen s) {
                System.out.println(contents(s));
            }


            /**
             * Display Contents of Frame + Screen 
             * @param  s Screen to Display
             * @return Contents for Screen
             */
            public String contents(IScreen s) {
//                String out = "";
//                out += "================================\n";
//                out += "  " + s.name() + "  \n";
//                out += "================================\n";
//                out += s.display() + "\n";
//                out += "================================\n";
//                dumpLines(out);
//                out += currentStrategy;
                String out = "";
                out += "\n\n\n";
                int total_space = 44;
                String headerFirstLine = "Patties- 1";
                out += "  " + headerFirstLine + "\n\n";
                String headerSecondLine = "Order Number: 45";
                out += "  " + headerSecondLine + "\n";
                String time = "12/1/2016   1:46:54 PM";
                out += padSpaces((total_space - time.length())/2) + time + "\n";
//                String headerThirdLine = "12/1/2016   1:46:54 PM";
//                out += padSpaces((total_space - headerThirdLine.length())/2) + headerThirdLine + "\n";
                String headerFourthLine = "FIVE GUYS";
                out += padSpaces((total_space - headerFourthLine.length())/2) + headerFourthLine + "\n";
//                String headerFifthLine = "SAN JOSE, CA 95118";
//                out += padSpaces((total_space - headerFifthLine.length())/2) + headerFifthLine + "\n";
//                String headerSixthLine = "(P) 408-264-9300";
//                out += padSpaces((total_space - headerSixthLine.length())/2) + headerSixthLine + "\n\n";

//                out += padSpaces((total_space - headerFirstLine.length())/2) + headerFirstLine;
                return out;
            }

        };

        /* set default layout strategy */
        currentStrategy = receiptStrategy;

    }

    public void order(int n){
        current.order(n);
    }

    /**
     * Change the Current Screen
     *
     * @param s Screen Object
     */
    public void setCurrentScreen(IScreen s) {
        current = s;
    }

    /**
     * Configure Selections for Command Pattern
     *
     * @param slot A, B, ... E
     * @param c    Command Object
     */
    public void setMenuItem(String slot, IMenuCommand c) {

    }

    public void setMenuItem(int x, int y, IMenuCommand c) {

    }

    /**
     * Send Touch Event
     *
     * @param x X Coord
     * @param y Y Coord
     */
    public void touch(int x, int y) {
        if (current != null)
            current.touch(x, y);

    }

    /**
     * Get Contents of the Frame + Screen
     *
     * @return Frame + Screen Contents
     */
    public String contents() {
        if (current != null) {
            return currentStrategy.contents(current);
        } else {
            return "";
        }
    }

    /**
     * Display Contents of Frame + Screen
     */
    public void display() {
        if (current != null) {
            currentStrategy.display(current);
        }
    }

    /**
     * Execute a Command
     *
     * @param c Command
     */
    public void cmd(String c) {

    }


    /**
     * Execute a Command
     *
     * @param x X Command
     * @param y Y Command
     */
    @Override
    public void cmd(int x, int y) {

    }



}
