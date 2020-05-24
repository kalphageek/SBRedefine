package me.kalph.apiclient.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        Thread.sleep(3000l);
        return "hello";
    }
    @GetMapping("/world")
    public String world() throws InterruptedException {
        Thread.sleep(1000l);
        return "world";
    }
}
