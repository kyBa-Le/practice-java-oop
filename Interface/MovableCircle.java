package Interface;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public void moveUp() {
        this.center.y ++;
    }
    @Override
    public void moveDown() {
        this.center.y --;
    }

    @Override
    public void moveLeft() {
        this.center.x--;
    }

    @Override
    public void moveRight() {
        this.center.x++;
    }
    
    
}
