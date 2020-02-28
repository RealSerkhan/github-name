package AreaofDifferents;

public class Triangle extends Objects {
    Points p1,p2,p3;

    public Triangle(Points p1, Points p2, Points p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double area() {

        return (p1.x*p2.y+p2.x*p3.y+p3.x*p1.y-p1.x*p3.y-p2.x*p1.y-p3.x*p2.y)/2;
    }
}
//A = (x1y2 + x2y3 + x3y1 – x1y3 – x2y1 – x3y2)/2.