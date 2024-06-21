import java.lang.Math;

// Interfaz Figure
interface Figure {
    String getColor();
    double perimeter();
    double area();
}

// Clase para el triángulo con sus atributos concretos
class Triangle implements Figure {
    String color;
    double side1, side2, side3;

    public Triangle(String color, double side1, double side2, double side3) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

// Clase para el círculo con sus atributos concretos
class Circle implements Figure {
    String color;
    double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Clase para el rectángulo con sus atributos concretos
class Rectangle implements Figure {
    String color;
    double length, width;

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Clase para el hexágono con sus atributos concretos
class Hexagon implements Figure {
    String color;
    double side;

    public Hexagon(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimeter() {
        return 6 * side;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }
}

// Se crean instancias de cada clase de figura geométrica, se guardan en un
// array de tipo 'Figure' gracias al polimorfismo, se hace un for each en cada figura
// se accede a cada figura y se llaman a los métodos
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Rojo", 3, 4, 5);
        Circle circle = new Circle("Azul", 5);
        Rectangle rectangle = new Rectangle("Verde", 4, 6);
        Hexagon hexagon = new Hexagon("Amarillo", 4);

        Figure[] figures = {triangle, circle, rectangle, hexagon};

        for (Figure figure : figures) {
            System.out.println("Color: " + figure.getColor());
            System.out.println("Perímetro: " + figure.perimeter());
            System.out.println("Área: " + figure.area());
            System.out.println();
        }
    }
}