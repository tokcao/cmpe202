//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package fiveguys;

public class BuildReceipt {
    public BuildReceipt() {
    }

    public static Component getReceipt() {
//        Composite order = new Composite("Order");
        Composite receipt = new Composite("Order", 45 );
//        order.addChild(new Leaf("Crispy Onion Strings", 5.5D));
//        order.addChild(new Leaf("The Purist", 8.0D));
//        CustomBurger customBurger = new CustomBurger("Build Your Own Burger");
        CustomBurger customBurger = new CustomBurger(1, "LLB", 5.59);
//        Fries fries = new Fries(1,"LTL",2.79);
//        Burger b = new Burger("Burger Options");
//        String[] bo = new String[]{"Beef", "1/3lb.", "On A Bun"};
//        b.setOptions(bo);
//        Cheese c = new Cheese("Cheese Options");
//        String[] co = new String[]{"Danish Blue Cheese", "Horseradish Cheddar"};
//        c.setOptions(co);
//        c.wrapDecorator(b);
        Toppings t = new Toppings("Toppings Options");
        String[] to = new String[]{"BACON", "LETTUCE", "TOMATO", "G ONION", "JALA GRILLED"};
        t.setOptions(to);
//        t.wrapDecorator(c);
        Bacon b = new Bacon("BACON");
        String[] bo = new String[]{"BACON"};
        b.setOptions(bo);
        Veggie v = new Veggie("Veggie Options:");
        String[] vo = new String[]{"LETTUCE", "TOMATO"};
        v.setOptions(vo);
        GrilledVeggie g = new GrilledVeggie("Grilled Veggie Options");
        String[] go = new String[]{"G ONION", "JALA GRILLED"};
        g.setOptions(go);
        g.wrapDecorator(t);

        Fries f = new Fries("Fries Options:");
        String[] fo = new String[]{"  1  LTL CAJ                         $2.79"};
        f.setOptions(fo);
        Price p = new Price("Price:");
        String[] po = new String[]{"Sub. Total", "Tax:", "Total:", "Cash", "Change"};
        p.setOptions(po);
//        String[] so = new String[]{"Appricot Sauce"};
//        s.setOptions(so);
//        s.wrapDecorator(g);
//        customBurger.setDecorator(s);
        customBurger.addChild(b);
//        customBurger.addChild(c);
        customBurger.addChild(v);
//        customBurger.addChild(t);
        customBurger.addChild(g);
        customBurger.addChild(f);
        customBurger.addChild(p);
//        customBurger.addChild(s);
        receipt.addChild(customBurger);
//        order.addChild(fries);
        return receipt;
    }
}
