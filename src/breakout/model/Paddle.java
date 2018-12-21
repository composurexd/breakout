package breakout.model;

import static breakout.model.Breakout.GAME_HEIGHT;
import static breakout.model.Breakout.GAME_WIDTH;

/*
 * A Paddle for the Breakout game
 *
 */
public class Paddle extends BreakoutPiece {

    public static final double PADDLE_WIDTH = 60;
    public static final double PADDLE_HEIGHT = 10;
    public static final double PADDLE_SPEED = 5;
    public static final double MOVEMENT_IN_X_AXIS = 5;

    public Paddle() {
        x = GAME_WIDTH / 2;
        y = GAME_HEIGHT - 10;
    }

    @Override
    public double getWidth() {
        return PADDLE_WIDTH;
    }

    @Override
    public double getHeight() {
        return PADDLE_HEIGHT;
    }

    public boolean canMoveToPositionLeft(){
        //Används för att inte åka igenom väggarna,
        // X >= 5 && X <= 395
        return this.x >= MOVEMENT_IN_X_AXIS;
    }
    public boolean canMoveToPositionRight() {
        return this.x <= GAME_WIDTH-PADDLE_WIDTH-MOVEMENT_IN_X_AXIS;
    }
}