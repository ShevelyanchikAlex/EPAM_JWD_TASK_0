package by.epam.task4.area;

import by.epam.task4.point.Point;

import java.util.ArrayList;

public class Area {
    private final ArrayList<Rectangle> rectangles;

    public Area(ArrayList<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public boolean contains(Point point) {
        for (Rectangle rectangle : rectangles) {
            if (rectangle.contains(point.getX(), point.getY())) {
                return true;
            }
        }
        return false;
    }
}
