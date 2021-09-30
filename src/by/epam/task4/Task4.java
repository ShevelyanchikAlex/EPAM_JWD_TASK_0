package by.epam.task4;

import by.epam.services.writer.impl.WriterImpl;
import by.epam.services.writer.interfaces.Writer;
import by.epam.task4.area.Area;
import by.epam.task4.area.Rectangle;
import by.epam.task4.point.Point;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        Writer writer = new WriterImpl();

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(new Point(-2, 0), 4, 4));
        rectangles.add(new Rectangle(new Point(-4, -3), 8, 3));

        Area area = new Area(rectangles);
        writer.write(area.contains(new Point(-3, -1)));
    }
}
