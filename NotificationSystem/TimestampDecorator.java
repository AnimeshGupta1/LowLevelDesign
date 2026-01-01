package NotificationSystem;

public class TimestampDecorator extends INotificationDecorator{
    public TimestampDecorator(INotification notification) {
        super(notification);
    }

    public String getContent() {
        return "[2025-04-13 14:22:00] " + notification.getContent();
    }
}
