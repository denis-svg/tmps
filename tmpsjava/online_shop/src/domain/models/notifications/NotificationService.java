package domain.models.notifications;

// Interface for the common notification service
public interface NotificationService {
    void sendNotification(String message, String recipient);
}