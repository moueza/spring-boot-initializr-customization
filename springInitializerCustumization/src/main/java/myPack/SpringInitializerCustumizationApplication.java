package myPack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringInitializerCustumizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInitializerCustumizationApplication.class, args);
	}
	
	
	  @RequestMapping("/sayHello")
	    public String sayHello() {
	        return "Hello";
	    }
}
