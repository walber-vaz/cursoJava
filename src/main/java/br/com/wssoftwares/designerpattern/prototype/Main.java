package br.com.wssoftwares.designerpattern.prototype;

import br.com.wssoftwares.designerpattern.prototype.shapes.Circle;
import br.com.wssoftwares.designerpattern.prototype.shapes.Rectangle;
import br.com.wssoftwares.designerpattern.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> copyShapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, copyShapes);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> copyShapes) {
        for (Shape shape : shapes) {
            copyShapes.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != copyShapes.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(copyShapes.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
