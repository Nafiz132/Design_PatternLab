package observerPattern02;

import observerPattern.Observer;

import java.util.ArrayList;

public class Observable implements IObservable{
    ArrayList<observerPattern02.Observer> observers;
    ArrayList<Integer>number;

    public void Observer(){
        observers= new ArrayList<observerPattern02.Observer>();
        number= new ArrayList<>();
    }
    @Override
    public void addObserver(observerPattern02.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
    for(observerPattern02.Observer observer: observers){
        observer.update();
    }
    }
    public void addNewNumber(int num){
         number.add(num);
         notifyAllObservers();
    }
}
