package AreaofDifferents;

public class Circle extends Objects {
    Points Center;
    int Radius;

    public Circle(Points center, int radius) {
        Center = center;
        Radius = radius;
    }


    @Override
    public double area() {
        return Math.PI*Radius*Radius;
    }
}
