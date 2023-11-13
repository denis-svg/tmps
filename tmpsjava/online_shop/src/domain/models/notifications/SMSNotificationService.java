package domain.models.notifications;

// SMS notification service
public class SMSNotificationService {
    public void sendSMS(String phoneNumber, String message) {
        // Logic for sending an SMS
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
