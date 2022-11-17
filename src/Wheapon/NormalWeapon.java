package Wheapon;
import Bullets.NormalBullet;
import Bullets.Bullet;
import Main.Mover;
import Main.Ship;

import java.util.ArrayList;
import java.util.List;

public class NormalWeapon implements Weapon {
    final Ship ship;
    final double speed;

    public NormalWeapon(Ship ship, double speed) {
        this.ship = ship;
        this.speed = speed;
    }

    public List<Bullet> shoot(){
        List<Bullet> bullets = new ArrayList<>();
        bullets.add(new NormalBullet(ship.point,
                new Mover(ship.getMover().getRotation().getX() * speed, ship.getMover().getRotation().getY() * speed),
                10.0));
        return bullets;
    }
}
