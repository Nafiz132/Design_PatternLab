package observerPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject= new Subject();

        new HexaDecimalObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("The equivalent strings are alluded below: ");
        subject.setState(13);
        System.out.println("\n");
        System.out.println("The equivalent strings are as below : ");
        subject.setState(25);
    }
}
