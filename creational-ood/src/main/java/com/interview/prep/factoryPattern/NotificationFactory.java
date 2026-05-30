package com.interview.prep.factoryPattern;

import java.util.concurrent.ConcurrentHashMap;

public class NotificationFactory {

    private static final ConcurrentHashMap<String,NotificationService> notificationServiceConcurrentHashMap = new ConcurrentHashMap<>();

    //cleary violates the OCP principle

    public NotificationService getNotificationServiceGateway(String type)
    {
        return switch (type) {
            case "SMS" -> new SMSNotificationService();
            case "EMAIL" -> new EmailNotificationService();
            case "WHATSAPP" -> new WhatsappNotificationService();
            default -> throw new RuntimeException("it is invalid type");
        };

    }


    //follow extension rater than modifying it

    static {
        notificationServiceConcurrentHashMap.put("EMAIL",new EmailNotificationService());
        notificationServiceConcurrentHashMap.put("SMS",new SMSNotificationService());
        notificationServiceConcurrentHashMap.put("WHATSAPP", new WhatsappNotificationService());
    }

    public  static  NotificationService getNotificationGateway(String type)
    {
        NotificationService notificationService = notificationServiceConcurrentHashMap.get(type);

        if(notificationService==null)
        {
            throw  new RuntimeException("it is invalid notification type");
        }

        return  notificationService;
    }
}
