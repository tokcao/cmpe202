package fiveguys;

public class Toppings extends LeafDecorator
{
    private String[] options ;
    
    
    public Toppings( String d )
    {
        super(d) ;
    }
    
    // 4 toppings free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
//        if ( options.length > 4 )
//            this.price += (options.length-4) * 0.75 ;
        this.price += 0.00;
    }
    
    public String getDescription() 
    {
        String desc = "";
//        String margin = "        ";
//        String desc = margin + "\n";
//        for ( int i = 0; i < options.length; i++ )
//        {
////            if (i > 0) desc += " + " + options[i] ;
////            else desc = options[i] ;
//            desc += margin + "{{{{" + options;
//        }
        return desc ;
    }
    
}