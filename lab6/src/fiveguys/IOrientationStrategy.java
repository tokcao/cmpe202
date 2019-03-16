/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package fiveguys;

/** Orientation Strategy Interface */
public interface IOrientationStrategy
{
    /**
     * Display Screen (with respect to this Strategy)
     * @param s Screen to Display
     */
    void display(IScreen s) ;

//    void display(MyCardsScreen s);

    /**
     * Get Screen Contents (instead of display to terminal)
     * @param  s Screen to get Contents
     * @return   Contents of Screen
     */
    String contents(IScreen s) ;


}
