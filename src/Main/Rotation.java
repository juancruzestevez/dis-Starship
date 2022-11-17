package Main;

public class Rotation {
    public final double degree;

    public Rotation(double degree) {
        this.degree = degree;
    }

    public double getX(){
        return Math.cos(Math.toRadians(degree));
    }

    public double getY(){
        return Math.sin(Math.toRadians(degree));
    }

    public double getDegree() {
        return degree;
    }
}
