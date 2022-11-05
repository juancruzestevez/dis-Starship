package Wheapon;

import Bullets.Bullet;
import Bullets.NormalBullet;
import Main.Mover;
import Main.Ship;

import java.util.ArrayList;
import java.util.List;

public class CrossWeapon implements Weapon{
    final Ship ship;
    final double speed;

    public CrossWeapon(Ship ship, double speed) {
        this.ship = ship;
        this.speed = speed;
    }

    public List<Bullet> shoot(){
        List<Bullet> bullets = new ArrayList<>();
        bullets.add(new NormalBullet(ship.point,
                new Mover(ship.getMover().getXs() * speed, ship.getMover().getYs() * speed),
                10.0));
        bullets.add(new NormalBullet(ship.point,
                new Mover(ship.getMover().getYs() * speed, ship.getMover().getXs() * speed),
                10.0));
        bullets.add(new NormalBullet(ship.point,
                new Mover(ship.getMover().getXs() * speed, -ship.getMover().getYs() * speed),
                10.0));
        bullets.add(new NormalBullet(ship.point,
                new Mover(-ship.getMover().getXs() * speed, -ship.getMover().getYs() * speed),
                10.0));
        return bullets;
    }

}
