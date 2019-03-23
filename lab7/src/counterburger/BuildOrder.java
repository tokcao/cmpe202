  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order\n\n" ) ;
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = {"Organic Bison*", "1/2lb.", "On A Bun"};
        b.setOptions( bo ) ;

        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;

        // premium cheese + 1.50
        PremiumCheese pc = new PremiumCheese("Premium Cheese Options");
        String[] co1 = {"Danish Blue Cheese"};

        c.setOptions( co ) ;
        pc.setOptions(co1);
        c.wrapDecorator( b ) ;
        pc.wrapDecorator(c);

        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( pc ) ;

        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;

        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise Tomatoes", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;

        // 1 free bun
        Bun bun = new Bun("Bun Options");
        String[] buno = {"Ciabatta (Vegan)"};
        bun.setOptions(buno);
        bun.wrapDecorator(s);

        // 1 side
        Side side = new Side("Side Options.");
        String[] sideo = {"Shoestring Fries"};
        side.setOptions(sideo);
        side.wrapDecorator(bun);
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild(pc);
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild(bun);
        customBurger.addChild(side);
        order.addChild(customBurger);

        /**
         * Second Order
         */
        CustomBurger secondcustomBurger = new CustomBurger( "\n\nBuild Your Own Burger" ) ;
        Burger secondb = new Burger( "Burger Options" ) ;
        String[] secondbo = {"Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun"};
        secondb.setOptions( secondbo ) ;

        // 1 cheese free, extra cheese +1.00
        Cheese secondc = new Cheese( "Cheese Options" ) ;
        String[] secondco = { "Smoked Gouda", "Greek Feta" } ;

        // premium cheese + 1.50
        PremiumCheese secondpc = new PremiumCheese("Premium Cheese Options");
        String[] secondco1 = {"Fresh Mozzarella"};

        secondc.setOptions( secondco ) ;
        secondpc.setOptions(secondco1);
        secondc.wrapDecorator( secondb ) ;
        secondpc.wrapDecorator(secondc);

        // all toppings are free
        Toppings secondt = new Toppings( "Toppings Options" ) ;
        String[] secondto = { "Crushed Peanuts" } ;
        secondt.setOptions( secondto ) ;
        secondt.wrapDecorator( secondpc ) ;

        // premium topping +1.50
        Premium secondp = new Premium( "Premium Options" ) ;
        String[] secondpo = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        secondp.setOptions( secondpo ) ;
        secondp.wrapDecorator( secondt ) ;

        // 1 sauce free, extra +.75
        Sauce seconds = new Sauce( "Sauce Options" ) ;
        String[] secondso = { "Habanero Salsa" } ;
        seconds.setOptions( secondso ) ;
        seconds.wrapDecorator( secondp ) ;

        // 1 free bun
        Bun secondbun = new Bun("Bun Options");
        String[] secondbuno = {"Gluten-Free Bun"};
        secondbun.setOptions(secondbuno);
        secondbun.wrapDecorator(seconds);

        // 1 side
        Side secondside = new Side("Side Options.");
        String[] secondsideo = {"Shoestring Fries"};
        secondside.setOptions(secondsideo);
        secondside.wrapDecorator(secondbun);

        // Setup Custom Burger Ingredients
        secondcustomBurger.setDecorator( secondside ) ;
        secondcustomBurger.addChild( secondb ) ;
        secondcustomBurger.addChild( secondc ) ;
        secondcustomBurger.addChild(secondpc);
        secondcustomBurger.addChild( seconds ) ;
        secondcustomBurger.addChild( secondt ) ;
        secondcustomBurger.addChild( secondp ) ;
        secondcustomBurger.addChild(secondbun);
        secondcustomBurger.addChild(secondside);

        // Add Custom Burger to the Order
        order.addChild( secondcustomBurger );



        return order ;
    }


}




/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/