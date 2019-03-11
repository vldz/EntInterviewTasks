package app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import app.model.PingPong;

@RestController
public class PingPongController {
    @RequestMapping("/status/ping")
    public String pong() {
        PingPong pingPong = new PingPong();
        return pingPong.getContent();
    }
}
