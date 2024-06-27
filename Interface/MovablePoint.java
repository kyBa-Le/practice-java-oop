package Interface;

public class MovablePoint implements  Movable{
    int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){

    }
    @Override
    public void moveUp(){
        this.y++;
    }
    @Override
    public void moveDown(){
        this.y --;
    }
    @Override
    public void moveLeft(){
        this.x--;
    }
    @Override
    public void moveRight(){
        this.x++;
    }

}
