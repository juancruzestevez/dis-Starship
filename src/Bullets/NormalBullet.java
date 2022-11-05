package Bullets;

import Main.Mover;
import Main.Point;

public class NormalBullet implements Bullet {
    final Point point;
    final Mover mover;
    final Double damage;

    public NormalBullet(Point point, Mover mover, Double damage) {
        this.point = point;
        this.mover = mover;
        this.damage = damage;
    }

    public NormalBullet(NormalBullet bullet){
        point = new Point(bullet.point.x + bullet.mover.xs, bullet.point.y + bullet.mover.ys);
        mover = bullet.mover;
        damage = bullet.damage;
    }


}
