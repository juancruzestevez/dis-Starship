package Bullets;

import Main.Mover;
import Main.Point;

public class BigBullet implements Bullets{
    final Point point;
    final Mover mover;
    final double radius;

    public BigBullet(Point point, Mover mover, double radius) {
        this.point = point;
        this.mover = mover;
        this.radius = radius;
    }

    public BigBullet(BigBullet bigBullet){
        point = new Point(bigBullet.point.x + bigBullet.mover.xs, bigBullet.point.y + bigBullet.mover.ys);
        mover = bigBullet.mover;
        radius = bigBullet.radius;
    }
}
