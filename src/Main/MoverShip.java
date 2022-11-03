package Main;
public class MoverShip {
    public final double acceleration;
    public final double xs;
    public final double ys;
    public final Rotation rotation;

    public MoverShip(double acceleration, double xs, double ys, Rotation direction) {
        this.acceleration = acceleration;
        this.xs = xs;
        this.ys = ys;
        this.rotation = direction;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getXs() {
        return xs;
    }

    public double getYs() {
        return ys;
    }

    public Rotation getRotation() {
        return rotation;
    }
}
