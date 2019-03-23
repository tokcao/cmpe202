public class Side extends LeafDecorator
{
    private String[] options ;


    public Side( String d )
    {
        super(d) ;
    }

    // 1 sauce free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
        this.price = options.length * 3.00;
//        if ( options.length > 1 )
//            this.price += (options.length-1) * 0.75 ;
//        if(options.equals("Gluten-Free Bun"))
//        {
//            this.price += 1.00;
//        }
    }

    public String getDescription()
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }
        return desc ;
    }

}