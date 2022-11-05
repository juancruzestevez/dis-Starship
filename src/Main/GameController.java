package Main;

import Bullets.Bullet;
import Wheapon.Weapon;

import java.util.List;

final class GameController {

    public Ship rotateA(Ship ship){
        return new Ship(ship.score,
                ship.getPoint(),
                new MoverShip(ship.getMover().getAcceleration(), ship.getMover().getXs(), ship.getMover().getYs(),
                        new Rotation(ship.getMover().getRotation().getDegree() + 5)));
    }

    public Ship rotateB(Ship ship){
        return new Ship(ship.getScore(),
                ship.getPoint(),
                new MoverShip(ship.getMover().getAcceleration(),
                        ship.getMover().getXs(), ship.getMover().getYs(),
                        new Rotation(ship.getMover().getRotation().getDegree() - 5)));
    }

    public Ship accelerate(Ship ship){
        return new Ship(ship.score,
                ship.point,
                new MoverShip(ship.mover.acceleration, ship.mover.xs + ship.mover.acceleration, ship.mover.ys + ship.mover.acceleration,
                ship.mover.rotation));
    }

    public List<Bullet> shoot(Weapon wheapon){
        return wheapon.shoot();
    }
}