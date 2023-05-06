package zad52;

interface Movable {
    default void moveUp() {}
    default void moveDown() {}
    default void moveLeft() {}
    default void moveRight() {}
}

class MovablePoint implements Movable {
    int x;
    int y;
    MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {this.y++;}
    public void moveDown() {this.y--;}
    public void moveLeft() {this.x--;}
    public void moveRight() {this.x++;}

    @Override
    public String toString() {
        return "x=" + this.x + " y=" + this.y;
    }
}

class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0,0);

        point.moveUp();
        point.moveDown();
        point.moveDown();
        point.moveLeft();
        point.moveRight();
        point.moveRight();
        point.moveRight();
        point.moveRight();

        System.out.println(point.toString());
    }
}
