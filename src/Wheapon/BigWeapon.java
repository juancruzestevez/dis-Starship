package Wheapon;

import Bullets.BigBullet;
import Bullets.Bullet;
import Bullets.NormalBullet;
import Main.Mover;
import Main.Ship;

import java.util.ArrayList;
import java.util.List;

public class BigWeapon implements Weapon{
    final Ship ship;
    final double speed;

    public BigWeapon(Ship ship, double speed) {
        this.ship = ship;
        this.speed = speed;
    }

    public List<Bullet> shoot(){
        List<Bullet> bullets = new ArrayList<>();
        bullets.add(new BigBullet(ship.point,
                new Mover(ship.getMover().getXs() * speed, ship.getMover().getYs() * speed),
                10.0, 20.0));
        return bullets;
    }
}
