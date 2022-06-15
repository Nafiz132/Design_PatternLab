package observerPattern02;

public class Main {
    public static void main(String[] args) {
        Observable newArrayListShow= new Observable();
        Observer sizan= new firstObserver();
        Observer shawon= new SecondObserver();
        newArrayListShow.observers.add(shawon);
        //newArrayListShow.observers.add(arif);
        //newArrayListShow.observers.add(5);
        newArrayListShow.observers.add(shawon);
       // newArrayListShow.observers.add(6);
        newArrayListShow.observers.add(sizan);
        //newArrayListShow.addANewNumber(7);
        //newArrayListShow.addANewNumber(8);
       // newArrayListShow.remove(shawon);
        newArrayListShow.addNewNumber(9);
    }
}
