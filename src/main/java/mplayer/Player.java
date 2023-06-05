package mplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Player {
    private static final Logger logger = LoggerFactory.getLogger(Player.class);

    private PlayerState currentState = PlayerState.NULL;

    public void changeState(PlayerState nextState) {
        if (currentState.isNextStateAllowed(nextState)) {
            logger.info("Changing state from {} to {}", currentState, nextState);
            currentState = nextState;
            logger.info("New state is - {}", currentState);
        } else {
            logger.error("Can't change state from {} to {}", currentState, nextState);
        }
    }
}
