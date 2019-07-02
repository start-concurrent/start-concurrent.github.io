import java.awt.*;

public class Rectangle extends Polygon {
    public Rectangle(int x, int y, int length, int width) { //<.>
        super(toArray(x, y, length, width));
    }

    protected static Point[] toArray(int x, int y, int length, int width) { //<.>
        Point[] array = {new Point(x, y), new Point(x + length, y),
            new Point(x + length, y + width), new Point(x, y + width)};
        return array;
    }

    public int getArea() { //<.>
        int length = points[1].x - points[0].x;
        int width = points[2].y - points[1].y;
        return length * width;
    }
}