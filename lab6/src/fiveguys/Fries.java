package fiveguys;

import java.text.DecimalFormat;

public class Fries extends LeafDecorator
{
    private String[] options;


    public Fries( String d )
    {
        super(d) ;
    }

    // 1 sauce free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
//        this.price += 2.79;
    }

    public String getDescription()
    {
        String desc = "" ;
        desc += options[0] + "\n";
        return desc ;
    }

}
