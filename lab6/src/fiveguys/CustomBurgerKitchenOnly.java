package fiveguys;

import java.text.DecimalFormat;

public class CustomBurgerKitchenOnly extends Composite
{
    PriceDecorator decorator = null ;
    protected int numberOfBurger;
    protected String burgerType;
    protected double price;


    public CustomBurgerKitchenOnly ( String d )
    {
        super(d) ;
    }

    public CustomBurgerKitchenOnly (int n, String d)
    {
        super(n, d);
        numberOfBurger = n;
        burgerType = d;
    }

    public CustomBurgerKitchenOnly(int n, String d, double p){
        super(n, d, p);
        numberOfBurger = n;
        burgerType = d;
        price = p;

    }

    public void setDecorator( PriceDecorator p )
    {
        this.decorator = p ;
    }

    private String padSpaces(int num) {
        String spaces = "";
        for (int i = 0; i < num; i++)
            spaces += " ";
        return spaces;
    }

    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        int totalSpace = 34;
        String text = Double.toString(Math.abs(price));
        int integerPlaces = text.indexOf(".");
        int decimalPlaces = text.length() - integerPlaces - 1;
//        System.out.println( "  " + description + " " + fmt.format(decorator.getPrice()) );
        System.out.println("  " + numberOfBurger + "    " + description + padSpaces((totalSpace - numberOfBurger - burgerType.length() - decimalPlaces - 1)));
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
}

