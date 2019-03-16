package fiveguys;

import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    protected int orderNumber;
    protected int numberOfBurger;
    protected double price;

    
    public Composite ( String d )
    {
        description = d ;
    }

    public Composite ( String d, int n )
    {
        description = d ;
        orderNumber = n;
    }

    public Composite(int n, String d, double p) {
        numberOfBurger = n;
        description = d;
        price = p;
    }

    public Composite(int n, String d) {
        numberOfBurger = n;
        description = d;
    }

    public void printDescription() {
        System.out.println( "  " + description + ": " + orderNumber );
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }

	public void addChild(Component c) {
        components.add( c ) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
	public Component getChild(int i) {
	    return components.get( i ) ;
	}
	 
}
 
