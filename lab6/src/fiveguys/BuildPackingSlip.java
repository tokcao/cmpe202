//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package fiveguys;

public class BuildPackingSlip {
    public BuildPackingSlip() {
    }

    public static Component getPackingSlip() {
        Composite packingSlip = new Composite("Sandwich#", 1 );

        CustomBurgerKitchenOnly customBurgerKitchenOnly = new CustomBurgerKitchenOnly(1, "LLB");

        Toppings t = new Toppings("Toppings Options");
        String[] to = new String[]{"BACON", "LETTUCE", "TOMATO", "G ONION", "JALA GRILLED"};
        t.setOptions(to);

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
        String[] fo = new String[]{"  1  LTL CAJ                         "};
        f.setOptions(fo);
//        Price p = new Price("Price:");
//        String[] po = new String[]{"Sub. Total", "Tax:", "Total:", "Cash", "Change"};
//        p.setOptions(po);
        Bottom bottom = new Bottom("");


        customBurgerKitchenOnly.addChild(v);
        customBurgerKitchenOnly.addChild(g);
        customBurgerKitchenOnly.addChild(b);
        customBurgerKitchenOnly.addChild(f);
        customBurgerKitchenOnly.addChild(bottom);
        packingSlip.addChild(customBurgerKitchenOnly);
        return packingSlip;
    }
}
