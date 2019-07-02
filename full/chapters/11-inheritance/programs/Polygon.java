import java.awt.*; //<.>

public class Polygon {
    protected Point[] points; //<.>

    public Polygon(Point[] points) { //<.>
        this.points = points;
    }

    public double getPerimeter() { //<.>
        double perimeter = 0.0;
        for(int i = 0; i < points.length - 1; i++)
            perimeter += points[i].distance(points[i + 1]);
        perimeter += points[0].distance(points[points.length - 1]);
        return perimeter;
    }

    public void draw(Graphics g) { //<.>
        for(int i = 0; i < points.length - 1; i++)
            g.drawLine(points[i].x, points[i].y, points[i+1].x, points[i+1].y);
        g.drawLine(points[0].x, points[0].y,
			points[points.length - 1].x, points[points.length - 1].y);
    }
}