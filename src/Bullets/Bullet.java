package Bullets;

import Main.Mover;
import Main.Point;

public class Bullet implements Bullets{
    final Point point;
    final Mover mover;
    final Double damage;

    public Bullet(Point point, Mover mover, Double damage) {
        this.point = point;
        this.mover = mover;
        this.damage = damage;
    }

    public Bullet(Bullet bullet){
        point = new Point(bullet.point.x + bullet.mover.xs, bullet.point.y + bullet.mover.ys);
        mover = bullet.mover;
        damage = bullet.damage;
    }


}
