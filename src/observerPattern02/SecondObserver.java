package observerPattern02;

public class SecondObserver implements Observer{
    @Override
    public void update() {
        System.out.println("This is second Observer \n" );
    }
}
