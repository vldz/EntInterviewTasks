package app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {
    private static final Logger LOG = LoggerFactory.getLogger(PingPongController.class);

    @RequestMapping("/status/ping")
    public String pong() {
        LOG.info("pong");
        return "pong";
    }
}
