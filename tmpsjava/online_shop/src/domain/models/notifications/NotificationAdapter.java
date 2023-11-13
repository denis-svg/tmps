package domain.models.notifications;

// Adapter for the common notification service
public class NotificationAdapter implements NotificationService {
    private final EmailNotificationService emailService;
    private final SMSNotificationService smsService;
    private final PushNotificationService pushService;

    public NotificationAdapter(EmailNotificationService emailService, SMSNotificationService smsService, PushNotificationService pushService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.pushService = pushService;
    }

    @Override
    public void sendNotification(String message, String recipient) {
        // Determine the type of notification based on the recipient
        if (recipient.contains("@")) {
            // If the recipient contains '@', assume it's an email address
            emailService.sendEmail("Notification", message, recipient);
        } else if (recipient.matches("\\d{10}")) {
            // If the recipient is a 10-digit number, assume it's a phone number
            smsService.sendSMS(recipient, message);
        } else {
            // Assume the recipient is a device token for push notification
            pushService.sendPushNotification(recipient, message);
        }
    }
}