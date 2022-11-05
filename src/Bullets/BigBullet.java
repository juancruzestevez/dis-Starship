package Bullets;

import Main.Mover;
import Main.Point;

public class BigBullet implements Bullet {
    final Point point;
    final Mover mover;
    final double radius;

    final double damage;

    public BigBullet(Point point, Mover mover, double radius, double damage) {
        this.point = point;
        this.mover = mover;
        this.radius = radius;
        this.damage = damage;
    }

    public BigBullet(BigBullet bigBullet){
        point = new Point(bigBullet.point.x + bigBullet.mover.xs, bigBullet.point.y + bigBullet.mover.ys);
        mover = bigBullet.mover;
        radius = bigBullet.radius;
        damage = bigBullet.damage;
    }
}
