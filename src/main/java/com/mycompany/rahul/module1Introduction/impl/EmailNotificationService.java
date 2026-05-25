package com.mycompany.rahul.module1Introduction.impl;

import com.mycompany.rahul.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailNotif")
//@ConditionalOnProperty(name = "notification.type",havingValue = "email")
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email sending..." + message);
    }
}
