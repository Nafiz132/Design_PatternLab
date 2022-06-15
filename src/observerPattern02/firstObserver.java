package observerPattern02;

public class firstObserver implements Observer{
    @Override
    public void update() {
        System.out.println("This is from primary observer");
    }
}
