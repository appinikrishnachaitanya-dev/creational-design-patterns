package com.interview.prep.factoryPattern;

public class EmailNotificationService implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("This is Email Notification");
    }
}
