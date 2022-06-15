package strategy;

public class StrategyDemoMain {
    public static void main(String[] args) {
        Context context= new Context(new Addition());
        System.out.println("The result of Addition Operation is : "+context.execute(45,67));

        context = new Context(new Multiplication());
        System.out.println("The result for Multiplication Operation is : "+ context.execute(30,5));

        context = new Context(new Subtraction());
        System.out.println("The Subtraction value is : "+context.execute(80,12));
    }
}
