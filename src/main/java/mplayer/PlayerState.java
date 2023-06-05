package mplayer;

public enum PlayerState {
    NULL {
        @Override
        boolean isNextStateAllowed(PlayerState state) {
            return switch (state) {
                case PLAYING -> true;
                default -> false;
            };
        }
    },
    PLAYING {
        @Override
        boolean isNextStateAllowed(PlayerState state) {
            return switch (state) {
                case BUFFERING, PAUSED, STOPPED -> true;
                default -> false;
            };
        }
    },
    BUFFERING {
        @Override
        boolean isNextStateAllowed(PlayerState state) {
            return switch (state) {
                case PLAYING -> true;
                default -> false;
            };
        }
    },
    PAUSED {
        @Override
        boolean isNextStateAllowed(PlayerState state) {
            return switch (state) {
                case PLAYING, STOPPED -> true;
                default -> false;
            };
        }
    },
    STOPPED {
        @Override
        boolean isNextStateAllowed(PlayerState state) {
            return switch (state) {
                case PLAYING -> true;
                default -> false;
            };
        }
    };

    abstract boolean isNextStateAllowed(PlayerState state);
}
