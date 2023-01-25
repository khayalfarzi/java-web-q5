package az.iktlab.javawebq5.dp.factory;

public class MailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Notification send via mail");
    }
}
