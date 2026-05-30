package com.interview.prep.factoryPattern;

public class WhatsappNotificationService implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("Send notification from whatsapp");
    }
}
