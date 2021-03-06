package by.epam.task4.area;

import by.epam.task4.point.Point;

public class Rectangle {
    private final Point pointMin;
    private final Point pointMax;

    public Rectangle(Point pointMin, double width, double height) {
        this.pointMin = pointMin;
        this.pointMax = new Point(pointMin.getX() + width, pointMin.getY() + height);
    }

    public boolean contains(double x, double y) {
        return (x >= pointMin.getX() && x <= pointMax.getX() && y >= pointMin.getY() && y <= pointMax.getY());
    }
}
