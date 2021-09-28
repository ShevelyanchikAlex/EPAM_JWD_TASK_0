package by.epam.task4;

import by.epam.task4.area.Area;
import by.epam.task4.area.Rectangle;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(-2, 0, 4, 4));
        rectangles.add(new Rectangle(-4, -3, 8, 3));
        Area area = new Area(rectangles);

        System.out.println(area.contains(-3, -1));
    }
}
