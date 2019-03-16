/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package fiveguys;

import java.util.ArrayList;

/** My Cards Screen */
public class Receipt extends Screen
{

    AppController appController;



    /** Add Reference of AppController */
    public Receipt (AppController appController){
        this.appController = appController;
    }

    /** Constructor */
    public Receipt()
    {

    }


    /** Display Components */
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;

    /** Front of Event Chain */
    private ITouchEventHandler chain ;

    public void order(int n){
        System.out.println("Order: " + n);
    }

    /**
     * Send Touch Events to the Chain
     * @param x Touch X Coord.
     * @param y Touch Y Coord.
     */
    @Override
    public void touch(int x, int y) {

    }

    /** Next Screen - Not Used */
    public void next() {
        // add code here
    }

    /** Previous Screen - Not Used */
    public void prev()  {
        // add code here
    }

    /**
     * Set Next Screen - Not Used
     * @param s Next Screen Object
     * @param n Next Screen Label
     */
    public void setNext(IScreen s, String n )  {
        // add code here
    }

    /**
     * Send Previous Screen - Not Used
     * @param s Previous Screen Object
     * @param n Previous Screen Label
     */
    public void setPrev(IScreen s, String n )  {
        // add code here
    }

    /**
     * Add Display Component to MyCards Screen
     * @param c Display Component
     */
    public void addSubComponent( IDisplayComponent c )
    {
        components.add( c ) ;
        if (components.size() == 1 )
        {
            chain = (ITouchEventHandler) c ;
        }
        else
        {
            ITouchEventHandler prev = (ITouchEventHandler) components.get(components.size()-2) ;
            prev.setNext( (ITouchEventHandler) c ) ;
        }
    }

    /**
     * Get Display Contents
     * @return Display Contents
     */
    public String display() {
        String value = "" ;

        order(45);
        for (IDisplayComponent c : components )
        {
            System.err.println( "Screen: " + c.getClass().getName() ) ;
            value = value + c.display() + "\n" ;
        }
        return value ;
    }

    /**
     * Get Class Name of Current Screen
     * @return Class Name of Current Screen
     */
//    public String name() {
//        return (this.getClass().getName()).split("\\.")[1] ;
//    }

}
