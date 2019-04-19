

public class TesterWithLambda {

    interface Decorator {
        // String operation(String str1, String str2);
        String operation();
    }

    
    private String addedBehavior(/* String str1, String str2, Decorator dobj */){
        return operation(/*str1, str2*/);
    }
    public static void main(String[] args) {
        // String component = "Hello World!";
        Decorator component = () -> "Hello World!";
        // Decorator decoratorA = (String str1, String str2) -> str1 + component + str2;
        // Decorator decoratorB = (String str1, String str2) -> str1 + decoratorA + str2;

        Decorator decoratorA = () -> "<em>" + component.operation() + "</em>";
        Decorator decoratorB = () -> "<h1>" + decoratorA.operation() + "</h1>";
        // TesterWithLambda tobj = new TesterWithLambda();

        System.out.println(decoratorB.operation());
    }
}