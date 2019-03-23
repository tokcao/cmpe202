![PrintDemo](https://github.com/tokcao/cmpe202/blob/master/lab6/output/Receipt.png)

![PrintDemo](https://github.com/tokcao/cmpe202/blob/master/lab6/output/PackingSlip.png)

The design patterns I have used for this lab are proxy, builder, composite, decorator, and strategy.
For proxy, I have implemented an AppAuthProxy to represent the frame of receipt and packing slip.
For builder, I have implemented ReceiptBuilder and PackingSlipBuilder to help to add all of the toppings on both of the receipt and packing slip.
For composite, I have implemented Composite so that I can treate all the topping classes the same way as a single instance of the same type of object.
For decorator, I have implemented LeafDecorator to help me get the item price and name at program run time.
For strategy, I have implemented receiptStrategy and packingSlipStrategy to display different frame for receipt and packing slip.
