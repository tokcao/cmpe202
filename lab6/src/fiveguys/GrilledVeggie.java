package fiveguys;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class GrilledVeggie extends LeafDecorator
{
    private String[] options ;
    
    
    public GrilledVeggie( String d )
    {
        super(d) ;
    }
    
    // premium topping +1.50
    public void setOptions( String[] options )
    {
        this.options = options ;
//        this.price += 0.00
    }
    
    public String getDescription() 
    {
        String margin = "        ";
        String desc = "" ;
        for ( int i = 0; i < options.length; i++ )
        {
            desc += margin + "->|" + options[i];
            if(i == 0){
                desc += "\n";
            }
        }        
        return desc ;
    }
    
}