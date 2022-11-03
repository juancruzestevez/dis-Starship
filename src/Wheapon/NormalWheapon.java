package Wheapon;
import Bullets.Bullet
import Bullets.Bullets;
import Main.Mover;
import Main.Ship;

public class NormalWheapon implements Wheapon {
    final Ship ship;
    final double speed;

    public NormalWheapon(Ship ship, double speed) {
        this.ship = ship;
        this.speed = speed;
    }

    public Bullets shoot(){
        return new Bullet(ship.point,
                new Mover(ship.getMover().getRotation().getX() * speed, ship.mover.rotation.getY() * speed),
                10.0);
    }
}
