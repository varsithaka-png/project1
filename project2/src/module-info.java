class Area {
    double findArea(double side) {
        return side * side;
    }
    double findArea(double length, double width) {
        return length * width;
    }
    double findArea(int radius) {
        return 3.14159 * radius * radius;
    }
}

public class AreaTest {
    public static void main(String[] args) {
        Area a = new Area();
        
        System.out.println("Area of Square: " + a.findArea(5.5));
        System.out.println("Area of Rectangle: " + a.findArea(4.0, 6.0));
        System.out.println("Area of Circle: " + a.findArea(7));
    }
}