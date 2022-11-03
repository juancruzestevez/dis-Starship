package Main;

public final class Ship {
    final double points;
    public final Point point;
    public final MoverShip mover;
    public Ship(double points, Point point, MoverShip mover) {
        this.points = points;
        this.point = new Point(point.x + mover.xs, point.y + mover.ys);
        this.mover = mover;
    }
    public Ship(Ship ship) {
        points = ship.points;
        point = new Point(ship.point.x + ship.mover.xs, ship.point.y + ship.mover.ys);
        mover = ship.mover;
    }
}
