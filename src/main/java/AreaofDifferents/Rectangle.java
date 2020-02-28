package AreaofDifferents;

public class Rectangle extends Objects {
    Points p1,p2;

    public Rectangle(Points p1, Points p2) {
        this.p1 = p1;
        this.p2 = p2;
    }



    @Override
    public double area() {
        return Math.abs(p2.x-p1.x)*(p2.y-p1.y);
    }
}
