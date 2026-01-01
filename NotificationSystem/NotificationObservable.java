package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements IObservable {
    private List<IObserver> observers = new ArrayList<>();

    private INotification notification = null;

    public void addObserver(IObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(IObserver obs) {
        observers.remove(obs);
    }

    public void notifyObservers() {
        for (IObserver obs : observers) {
            obs.update();
        }
    }

    public void setNotification(INotification notification) {
        this.notification = notification;
        notifyObservers();

    }
    
    public INotification getNotification() {
        return notification;
    }

    public String getNotificationContent() {
        return notification.getContent();
    }
}
