package breakout.model;

import java.util.Random;
import static breakout.model.Breakout.GAME_HEIGHT;
import static breakout.model.Breakout.GAME_WIDTH;
import static breakout.model.Breakout.SEC;
import static java.lang.Math.floor;
import static java.lang.System.out;

/*
 *    A Ball for the Breakout game
 */

public class Ball extends BreakoutPiece{

    private double size;
    private double dx;
    private double dy;

    public Ball() {
        this.size = 10;
        this.x = GAME_WIDTH/2;
        this.y = GAME_HEIGHT/2;
        this.dx = -1.2;
        this.dy = -0.7;
        this.width = 8;
        this.height = 8;
    }

    public double getDx() {
        return dx;
    }
    public double getDy() {
        return dy;
    }


    public void setDx(double dx) {
        this.dx = dx;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public void collision(BreakoutPiece otherobject) {
        if (floor(this.getX()) == otherobject.getX() + otherobject.getWidth()) { //if collision with left side of ball
            this.setX(otherobject.getX() + otherobject.getWidth() + 1);
            this.dx = -this.dx;
            out.println("x collision");
        }
        else if (floor(this.getX()) + this.width == otherobject.getX() ) {       // right side
            this.setX(otherobject.getX() - 1);
            this.dx = -this.dx;

        }

        else if (floor(this.getY()) == otherobject.getY() + otherobject.getHeight()) {  //top
            this.setY(otherobject.getY() + otherobject.getHeight() + 1);
            this.dy = -this.dy;
        }

        else if ( floor(this.getY()) + this.height == otherobject.getY()) {       //bottom
            this.setY(otherobject.getY() - 1);
            this.dy = -this.dy;
        }

    }


}
