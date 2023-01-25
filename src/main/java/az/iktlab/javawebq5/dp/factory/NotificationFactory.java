package az.iktlab.javawebq5.dp.factory;

public class NotificationFactory {

    public Notification createNotification(Channel channel) {
        switch (channel) {
            case SMS:
                return new SmsNotification();
            case MAIL:
                return new MailNotification();
            case PUSH_NOTIFICATION:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Channel not found.");
        }
    }
}
