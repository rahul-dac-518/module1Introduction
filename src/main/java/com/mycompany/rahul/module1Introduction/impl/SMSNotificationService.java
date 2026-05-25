package com.mycompany.rahul.module1Introduction.impl;

import com.mycompany.rahul.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Primary // if there are many beans of same types created and
// you want only one bean compiler gets confused as we have @COmponet on both the classed to we mark one as @Primary so that would be considered
@Component
@Qualifier("smsNotif") // if multiple beans forund and @Primary is not marked to any then it checks @Qualifier("text")
//@ConditionalOnProperty(name = "notification.type",havingValue = "sms")
public class SMSNotificationService implements NotificationService {

    @Override
    public void send(String message){
        System.out.println("Sms sending..." + message);
    }
}
