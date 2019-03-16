package fiveguys;

import javax.lang.model.element.NestingKind;

public class Veggie extends LeafDecorator
{
    private String[] options ;
    
    
    public Veggie( String d )
    {
        super(d) ;
    }
    
    // 1 cheese free, extra cheese +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        this.price += 0.00;
    }
    
    public String getDescription() 
    {
        String margin = "        ";
        String desc = "" ;
        for ( int i = 0; i < options.length; i++ )
        {
            desc += margin + options[i];
            if(i == 0){
                desc += "\n";
            }
        }        
        return desc ;
    }
    
}