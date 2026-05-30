package com.interview.prep.factoryPattern;

public class SMSNotificationService implements  NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Send Notification from SMS");
    }
}
