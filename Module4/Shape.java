import java.util.*;

public class Shape {
    
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public static void main(String[]args) {
        Scanner scnr = new Scanner(System.in);
        Circle circ1 = new Circle();
        System.out.println("A circle has " + circ1.getNumSides() + " sides.");
        Rectangle rect1 = new Rectangle(4);
        circ1.area(scnr);
        rect1.area(scnr);

        scnr.close();
    }
}

class Circle extends Shape {
    public Circle(){
        super(0);
    }

    public void area(Scanner scnr) {
        System.out.println("Enter the Radius of the Circle: ");
        double radius = scnr.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of Circle: %.2f\n", area);
    }
}

class Rectangle extends Shape {
    public Rectangle(int numSides) {
        super(numSides);
    }

    public void area(Scanner scnr) {
        System.out.println("Please enter the length of the rectangle: ");
        double length = scnr.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        double width = scnr.nextDouble();
        System.out.println("Area of Rectangle: "  + width * length);
    }
}
