package PZ2;
class Figure {
    private final String name;
    
    public Figure(String name) {
        this.name = name;
    }
    
    public String getName() { 
        return name; 
    }
}

class Square extends Figure {
    private final double a;
    
    public Square(double a) {
        super("Квадрат");
        this.a = a;
    }

    public double calculateArea() {
        double area = a * a;
        System.out.println("Площадь " + getName() + ": " + area);
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter = 4 * a;
        System.out.println("Периметр " + getName() + ": " + perimeter);
        return perimeter;
    }
}

class Rectangle extends Figure {
    private final double a;
    private final double b;
    
    public Rectangle(double a, double b) {
        super("Прямоугольник");
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        double area = a * b;
        System.out.println("Площадь " + getName() + ": " + area);
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter = 2 * a + 2 * b;
        System.out.println("Периметр " + getName() + ": " + perimeter);
        return perimeter;
    }
}

class Circle extends Figure {
    private final double r;
    
    public Circle(double r) {
        super("Круг");
        this.r = r;
    }

    public double calculateArea() {
        double area = Math.PI * r * r;
        System.out.println("Площадь " + getName() + ": " + area);
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * r;
        System.out.println("Периметр " + getName() + ": " + perimeter);
        return perimeter;
    }
}

class Triangle extends Figure {
    private final double a;
    private final double b;
    private final double c;
    
    public Triangle(double a, double b, double c) {
        super("Треугольник");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double area = 0.5 * a * b;
        System.out.println("Площадь " + getName() + ": " + area);
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter = a + b + c; 
        System.out.println("Периметр " + getName() + ": " + perimeter);
        return perimeter;
    }
}

class Rhombus extends Figure {
    private final double a;
    private final double h;
    
    public Rhombus(double a, double h) {
        super("Ромб");
        this.a = a;
        this.h = h;
    }

    public double calculateArea() {
        double area = a * h;
        System.out.println("Площадь " + getName() + ": " + area);
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter = 4 * a;
        System.out.println("Периметр " + getName() + ": " + perimeter);
        return perimeter;
    }
}

public class Figures {
    public static void main(String[] args) {
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(3, 5);
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(1, 2, 3);
        Rhombus rhombus = new Rhombus(1, 6);

        square.calculateArea();
        square.calculatePerimeter();
        System.out.println();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println();

        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println();

        triangle.calculateArea();
        triangle.calculatePerimeter();
        System.out.println();

        rhombus.calculateArea();
        rhombus.calculatePerimeter();
    }
}