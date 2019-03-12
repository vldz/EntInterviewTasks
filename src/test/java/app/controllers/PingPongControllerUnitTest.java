package app.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PingPongControllerUnitTest {
    private PingPongController controller = new PingPongController();

    @Test
    public void shouldReturnPong() {
        String expected = "pong";

        String actual = controller.pong();

        assertEquals(expected, actual);
    }
}