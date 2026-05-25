package com.mycompany.rahul.module1Introduction;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Service
public class PaymentService {
    public void payment() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Initializing PaymentService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying PaymentService");
    }
}
