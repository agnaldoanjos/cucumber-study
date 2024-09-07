package net.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @PostMapping("/home")
    public String sayHelloPost() {
        return "hello";
    }
}
