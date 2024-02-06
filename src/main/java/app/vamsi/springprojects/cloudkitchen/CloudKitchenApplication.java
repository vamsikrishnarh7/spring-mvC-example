package app.vamsi.springprojects.cloudkitchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CloudKitchenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudKitchenApplication.class, args);
	}

}
