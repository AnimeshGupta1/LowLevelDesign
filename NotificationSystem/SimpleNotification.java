package NotificationSystem;

public class SimpleNotification implements INotification{
    String text;

    public SimpleNotification(String msg) {
        this.text = msg;
    }

    public String getContent() {
        return text;
    }
    
}
