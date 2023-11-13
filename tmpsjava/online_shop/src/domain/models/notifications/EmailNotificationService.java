package domain.models.notifications;

// Email notification service
public class EmailNotificationService {
    public void sendEmail(String subject, String body, String emailAddress) {
        // Logic for sending an email
        System.out.println("Sending email to " + emailAddress + ": " + subject + " - " + body);
    }
}