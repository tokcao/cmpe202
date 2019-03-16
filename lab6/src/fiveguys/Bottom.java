package fiveguys;

public class Bottom extends LeafDecorator
{
    private String[] options ;


    public Bottom( String d )
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

        desc += "  Register:1          Tran Seq No:   57845\n";
        desc += "  Cashier:Sakda* S.\n";
//        desc += margin + "************************************\n";
//        desc += margin + "  Don't throw away your receipt!!!\n\n";
//        desc += margin + " Help Five Guys and you could win!";

//        }
        return desc ;
    }

}