package by.epam.task4.area;

public class Rectangle {
    private final double xMin;
    private final double xMax;
    private final double yMin;
    private final double yMax;

    public Rectangle(double x, double y, double width, double height) {
        this.xMin = x;
        this.xMax = x + width;
        this.yMin = y;
        this.yMax = y + height;
    }

    public boolean contains(double x, double y) {
        return (x >= xMin && x <= xMax && y >= yMin && y <= yMax);
    }
}
