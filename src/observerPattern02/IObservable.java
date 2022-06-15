package observerPattern02;

import observerPattern.Observer;

public interface IObservable {
    public void addObserver(observerPattern02.Observer observer);
    public void remove(Observer observer);
    public void notifyAllObservers();
}
