package hackerrank.takehome;


import java.util.Scanner;

public class InterviewAssessment {

    public void main(String[] args) {


        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        ((Shape) circle).drawShape();
        ((Shape) square).drawShape();
        ((Shape) rectangle).drawShape();

        System.out.println();

        ShapeFactory factory = new ShapeFactory();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String type = in.next();
            factory.drawShape(type);
        }
    }

    class Shape {

        public void drawShape() {
            System.out.println("Drawing a Shape");


        }
    }

    class Circle extends Shape {
        @Override
        public void drawShape() {
            System.out.println("Drawing a Circle");
        }
    }

    class Square extends Shape {
        @Override
        public void drawShape() {
            System.out.println("Drawing a Square");
        }
    }

    class Rectangle extends Shape {
        @Override
        public void drawShape() {
            System.out.println("Drawing a Rectangle");
        }
    }



    /*
     * Create the Circle, Square, Rectangle and ShapeFactory class.
     */

    class ShapeFactory {
        public void drawShape(String type) {
            switch (type) {
                case "Circle":
                    Circle circle = new Circle();
                    circle.drawShape();
                    break;
                case "Square":
                    Square square = new Square();
                    square.drawShape();
                    break;
                case "Rectangle":
                    Rectangle rectangle = new Rectangle();
                    rectangle.drawShape();
                    break;
                default:
                    System.out.println("Drawing " + type + " is not supported");
                    break;
            }
        }
    }

}