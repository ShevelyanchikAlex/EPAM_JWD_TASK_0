package by.epam.task4.area;

import java.util.ArrayList;

public class Area {
    private final ArrayList<Rectangle> rectangles;

    public Area(ArrayList<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public boolean contains(double x, double y) {
        for (Rectangle rectangle : rectangles) {
            if (rectangle.contains(x, y)) {
                return true;
            }
        }
        return false;
    }
}
