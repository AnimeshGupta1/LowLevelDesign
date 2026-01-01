package NotificationSystem;

public class SignatureNotification extends INotificationDecorator {
    public String signature;

    public SignatureNotification(INotification notification, String signature) {
        super(notification);
        this.signature = signature;
    }

    public String getContent() {
        return notification.getContent() + "\n-- " + signature + "\n\n";
    }
}
