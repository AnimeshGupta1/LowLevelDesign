package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngine implements IObserver{
    
    private NotificationObservable notificationObservable;

    private List<INotificationStrategy> notificationStrategies = new ArrayList<>();

    public NotificationEngine() {
        this.notificationObservable = NotificationService.getInstance().getObservable();
        notificationObservable.addObserver(this);
    }

    public NotificationEngine(NotificationObservable notificationObservable) {
        this.notificationObservable = notificationObservable;
    }

    public void addNotificationStrategy(INotificationStrategy notificationStrategy) {
        this.notificationStrategies.add(notificationStrategy);
    }

    public void update() {
        String notificationContent = notificationObservable.getNotificationContent();
        for (INotificationStrategy strategy : notificationStrategies) {
            strategy.sendNotification(notificationContent);
        }
    }
}
