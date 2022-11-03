package Main;

public final class Ship {
    final double score;
    public final Point point;
    public final MoverShip mover;
    public Ship(double points, Point point, MoverShip mover) {
        this.score = points;
        this.point = new Point(point.getX() + mover.xs, point.y + mover.ys);
        this.mover = mover;
    }
    public Ship(Ship ship) {
        score = ship.score;
        point = new Point(ship.point.x + ship.mover.xs, ship.point.y + ship.mover.ys);
        mover = ship.mover;
    }

    public double getScore() {
        return score;
    }

    public Point getPoint() {
        return point;
    }

    public MoverShip getMover() {
        return mover;
    }
}
