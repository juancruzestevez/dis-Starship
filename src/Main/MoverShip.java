package Main;

public final class MoverShip {
    final double acceleration;
    final double xs;
    final double ys;
    public final Rotation rotation;

    public MoverShip(double acceleration, double xs, double ys, Rotation direction) {
        this.acceleration = acceleration;
        this.xs = xs;
        this.ys = ys;
        this.rotation = direction;
    }
}
