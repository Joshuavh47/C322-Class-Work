import java.util.ArrayList;

public class Observable {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void setChanged(){}
    public void clearChanged(){}
    public void notifyObservers(Object message){
        for(Observer observer: this.observers )
            observer.update(this,message);
    }
}