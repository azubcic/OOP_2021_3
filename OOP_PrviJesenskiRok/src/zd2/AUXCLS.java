package zd2;

import java.util.ArrayList;
import java.util.Random;

public class AUXCLS {
    private static final String[] ARR_SHP = {"Circle" , "Oval", "Rectangle", "Square", "Triangle"};

    public static ArrayList<Shape> genShapes(int num) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            String val = ARR_SHP[random.nextInt(ARR_SHP.length)];
            switch (val) {
                case "Circle":
                    shapes.add(new Circle());
                    break;
                case "Oval":
                    shapes.add(new Oval());
                    break;
                case "Triangle":
                    shapes.add(new Triangle());
                    break;
                case "Square":
                    shapes.add(new Square());
                    break;
                case "Rectangle":
                    shapes.add(new Rectangle());
                    break;
            }
        } return shapes;
    }

    public static void testAll(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + "\n---------------------------------------------------");
            shape.DrawShape();
            shape.playShapeSound();
            shape.translateShape();
            shape.eraseShape();
            System.out.println("---------------------------------------------------");
        }
    }
}
