package com.sherstock.sherstock;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServerApplication {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
    @GetMapping("/api/inventory")
    public String getInventoryBySection(@RequestParam Integer section) {
        return String.format("You are looking for inventory of section %d", section);

    }
}
