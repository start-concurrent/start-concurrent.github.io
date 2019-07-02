import java.awt.*; //<.>

public class Triangle extends Polygon {
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) { //<.>
        super(toPointArray(x1, y1, x2, y2, x3, y3));
    }
    
    protected static Point[] toPointArray(int x1, int y1, int x2, int y2, int x3, int y3) {  
        Point[] array = {new Point(x1, y1), new Point(x2, y2), new Point(x3, y3)}; //<.>
        return array;
    }
    
    public String getType() {
        double a = points[0].distance(points[1]);
        double b = points[1].distance(points[2]);
        double c = points[2].distance(points[0]);
        if(a == b && b == c)
            return "Equilateral";
        if(a == b || b == c || a == c)
            return "Isosceles";
        return "Scalene";
    }
}