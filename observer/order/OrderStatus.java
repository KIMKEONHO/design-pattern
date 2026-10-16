package observer.order;

import lombok.Getter;
import lombok.Setter;
import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OrderStatus implements Subject {

    private Status status;
    private List<Observer> observers;

    public OrderStatus(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void setStatus(Status status){
        this.status = status;
        notifyObserver();
    }

}
