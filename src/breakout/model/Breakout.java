package breakout.model;


import breakout.event.ModelEvent;
import breakout.event.EventBus;

import java.util.ArrayList;
import java.util.List;

/*
 *  Overall all logic for the Breakout Game
 *  Model class representing the full game
 *  This class should use other objects delegate work.
 *
 *  NOTE: Nothing visual here
 *
 */
public class Breakout {

    public static final double GAME_WIDTH = 400;
    public static final double GAME_HEIGHT = 400;
    public static final double BALL_SPEED_FACTOR = 1.05; // Increase ball speed
    public static final long SEC = 1_000_000_000;  // Nano seconds used by JavaFX

    private int ballsLeft = 5;
    int points;

    private Ball ball;
    private List<Brick> bricks;
    private Paddle paddle;
//    private Wall wall;
    private List<Wall> walls;

    // TODO Constructor that accepts all objects needed for the model



    public Breakout(Ball ball, List<Brick> bricks, Paddle paddle, List<Wall> walls) {
        this.ball = ball;
        this.bricks = bricks;
        this.paddle = paddle;
        this.walls = walls;
    }



    // --------  Game Logic -------------

    private long timeForLastHit;         // To avoid multiple collisions

    public void update(long now) {
        // TODO  Main game loop, start functional decomposition from here
        updateBallPosition();

        for (Wall w : walls) {   //
            ball.collision(w);
        }
    }

    // ----- Helper methods--------------
    // Used for functional decomposition


    public void updateBallPosition(){
        ball.setX(ball.getX()+ball.getDx());
        ball.setY(ball.getY()+ball.getDy());

    }

    public void calculateNewBallPosition(){

    }

    public void calculateNewPaddlePosition(){

    }





/*
    public void updatePositions() {
        paddle.updatePosition(calcXDiff(), ());
        ball.updatePosition(calcXDiff());
    }
   //sketch

*/



    // --- Used by GUI  ------------------------

    public List<IPositionable> getPositionables() {
        List<IPositionable> list = new ArrayList<>();
        list.add(ball);
        for (Brick b: bricks) {
            list.add(b);
        }
        list.add(paddle);
        for (Wall w: walls) {
            list.add(w);
        }
        return list;  // TODO return all objects to be rendered by GUI
    }

    public int getPoints() {
        return points;
    }

    public int getBallsLeft() {
        return ballsLeft;
    }

    public Paddle getPaddle() {
        return paddle;
    }
}