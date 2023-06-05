package mplayer;

import java.util.Random;

public class RandomStateProducer {
    private final PlayerState[] possibleStates = {
            PlayerState.PLAYING,
            PlayerState.STOPPED,
            PlayerState.PAUSED,
            PlayerState.BUFFERING
    };
    private final Random rand = new Random();

    public PlayerState nextState() {
        var nextStateIdx = rand.nextInt(possibleStates.length);
        return possibleStates[nextStateIdx];
    }
}
