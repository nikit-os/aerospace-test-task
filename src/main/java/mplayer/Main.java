package mplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        logger.info("Starting playback event simulator");
        var player = new Player();
        var stateProducer = new RandomStateProducer();

        while (true) {
            var nextState = stateProducer.nextState();
            player.changeState(nextState);
            Thread.sleep(1000L);
        }
    }
}