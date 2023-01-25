package az.iktlab.javawebq5.dp.factory;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Notification send via sms");
    }
}
