package homework4.task4;

import java.util.ArrayList;
import java.util.List;

public class RequestProcessor implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Request request) {
        for (Observer observer : observers) {
            observer.update(request);
        }
    }

    public void receiveRequest(Request request) {
        System.out.println(request.getData());
        notifyObservers(request);
    }
}
