public class Bun extends LeafDecorator
{
    private String[] options ;


    public Bun( String d )
    {
        super(d) ;
    }

    // 1 sauce free, extra +.50
    public void setOptions( String[] options )
    {
        this.options = options ;

        if(options[0].equals("Gluten-Free Bun"))
        {
            this.price += 1.00;
        }
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