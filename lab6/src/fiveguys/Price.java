package fiveguys;

public class Price extends LeafDecorator
{
    private String[] options ;


    public Price( String d )
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

    private String padSpaces(int num) {
        String spaces = "";
        for (int i = 0; i < num; i++)
            spaces += " ";
        return spaces;
    }

    public String getDescription()
    {
        String desc = "";
        String margin = "    ";
        int totalSpace = 38;
//        double price[] = {8.38, 0.76, 9.14, 20.00, 10.86};
//        for ( int i = 0; i < options.length; i++ )
//        {
//            if (i > 0) desc += " + " + options[i] ;
//            else desc = options[i] ;
//            desc += margin + "{{{{" + options;
        desc += margin + options[0] + padSpaces(totalSpace - options[0].length() - 5) + "$" + 8.38 + "\n";
        desc += margin + options[1] + padSpaces(totalSpace - options[1].length() - 5) + "$" + 0.76 + "\n";
        desc += margin + options[2] + padSpaces(totalSpace - options[2].length() - 5) + "$" + 9.14 + "\n\n";
        desc += margin + options[3] + padSpaces(totalSpace - options[3].length() - 6) + "$" + "20.00" + "\n";
        desc += margin + options[4] + padSpaces(totalSpace - options[4].length() - 6) + "$" + 10.86 + "\n";
        desc += "  Register:1          Tran Seq No:   57845\n";
        desc += "  Cashier:Sakda* S.\n";
        desc += margin + "************************************\n";
        desc += margin + "  Don't throw away your receipt!!!\n\n";
        desc += margin + " Help Five Guys and you could win!";

//        }
        return desc ;
    }

}