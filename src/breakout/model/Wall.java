package breakout.model;

/*
        A wall for the ball to bounce
 */
public class Wall extends BreakoutPiece {

    private Dir direction;
    private double width;
    private double height;

    public Wall(Dir direction, double xPos) {
        this.direction = direction;
        y = 0;

        initializeCorrectWall(xPos);
    }

    private void initializeCorrectWall(double xPos){
        // Om Horisontell, så är längden lika stor som spelplanen, den är 3 pixlar bred, och börjar vid (0,0)
        if(direction == Dir.HORIZONTAL){
            width = Breakout.GAME_WIDTH;
            height = 3;
            x = 0;
        }
        else{
            // Om Vertikall
            // Så är Höjden lika stor som spelplanen
            // Bredden är 3 pixlar
            // om xPos >= 200 -> Placera den vid 400 - Bredden,
            width = 3;
            height = Breakout.GAME_HEIGHT;

            if(xPos >= Breakout.GAME_WIDTH / 2 ){
                x = Breakout.GAME_WIDTH - width;
            }
            else{
                x = 0;
            }
        }
    }

    public enum Dir {
        HORIZONTAL, VERTICAL;
    }

}