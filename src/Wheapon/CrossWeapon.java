package Wheapon;

import Bullets.Bullet;
import Bullets.NormalBullet;
import Main.Mover;
import Main.Rotation;
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
        Rotation rotation90 = new Rotation(ship.getMover().getRotation().getDegree() + 90);
        Rotation rotation180 = new Rotation(ship.getMover().getRotation().getDegree() + 180);
        Rotation rotation270 = new Rotation(ship.getMover().getRotation().getDegree() + 270);
        bullets.add(new NormalBullet(ship.point,
                new Mover((ship.getMover().getRotation().getX())* speed, ship.getMover().getYs() * speed),
                10.0));
        bullets.add(new NormalBullet(ship.point,
                new Mover(rotation90.getX() * speed, rotation90.getY() * speed),
                10.0));
        bullets.add(new NormalBullet(ship.point,
                new Mover(rotation180.getX() * speed, rotation180.getY() * speed),
                10.0));
        bullets.add(new NormalBullet(ship.point,
                new Mover(rotation270.getX() * speed, rotation270.getY() * speed),
                10.0));
        return bullets;
    }

}
