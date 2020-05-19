package io.pivotal.pal.tracker;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class WelcomeController {

    @Value("${welcome.message}")
    String welcomeMessage;
//
////    String Welcome1 = welcomeMessage;
////
////    public WelcomeController(String welcome) {
////        this.welcomeMessage = welcome;
////    }
////
////    public WelcomeController() {
////        System.out.println("Wlcome");
////    }
//

    @GetMapping("/")
    public String sayHello() {
        return welcomeMessage;
    }
}