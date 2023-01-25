package az.iktlab.javawebq5.dp.factory;

public class Main {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification(Channel.SMS);
        notification.notifyUser();

        notification = factory.createNotification(Channel.PUSH_NOTIFICATION);
        notification.notifyUser();
    }
}
