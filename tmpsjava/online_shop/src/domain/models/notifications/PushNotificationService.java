package domain.models.notifications;

// Push notification service
public class PushNotificationService {
    public void sendPushNotification(String deviceToken, String message) {
        // Logic for sending a push notification
        System.out.println("Sending push notification to " + deviceToken + ": " + message);
    }
}