package breakout.model;

/*
 *   A brick for the rows of bricks
 */

public class Brick extends BreakoutPiece {

    public static final double BRICK_WIDTH = 20;
    public static final double BRICK_HEIGHT = 10;
    public int points;

    @Override
    public double getWidth() {
        return BRICK_WIDTH;
    }

    @Override
    public double getHeight() {
        return BRICK_HEIGHT;
    }

}
