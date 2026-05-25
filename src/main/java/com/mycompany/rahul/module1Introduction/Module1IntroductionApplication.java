package com.mycompany.rahul.module1Introduction;

import com.mycompany.rahul.module1Introduction.impl.EmailNotificationService;
import com.mycompany.rahul.module1Introduction.impl.SMSNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

//	@Autowired
//	private PaymentService paymentService;
//
//	@Autowired
//	private PaymentService paymentService1;

//	@Autowired  //-- required at the time of field dependency injection
//	final NotificationService service;  // field dependency injection


//	public Module1IntroductionApplication(@Qualifier("smsNotif") NotificationService service){ when not conditonals used in properties then we need to provide which @Qualifier we want the type of bean
//public Module1IntroductionApplication( NotificationService service){
//		this.service = service ; //constructor dependency injection  Preferred way as we can make now the property as final which makes it immutable which is recomended
//	}

	@Autowired
	Map<String, NotificationService> map = new HashMap<>(); // Map of all the available beans of NotificationService type

	public static void main(String[] args) {

		SpringApplication.run(Module1IntroductionApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(paymentService.hashCode() + " !== " +  paymentService1.hashCode());
//		paymentService.payment();

//		NotificationService service = new SMSNotificationService();
//		NotificationService service = new EmailNotificationService();
//		service.send("Hello");

		for(var notificationService: map.entrySet()){
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("Hello");
		}


	}
}
