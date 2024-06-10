import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione la figura geométrica a calcular:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Triángulo");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calcularCirculo(scanner);
                break;
            case 2:
                calcularRectangulo(scanner);
                break;
            case 3:
                calcularCuadrado(scanner);
                break;
            case 4:
                calcularTriangulo(scanner);
                break;
            default:
                System.out.println("Opción inválida.");
        }
        
        scanner.close();
    }
    
    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        System.out.println("Ingrese el color del círculo:");
        String color = scanner.next();
        
        Circulo circulo = new Circulo(radio, color);
        
        System.out.println("Área del círculo: " + circulo.getArea());
        System.out.println("Perímetro del círculo: " + circulo.getPerimetro());
        System.out.println("Color del círculo: " + circulo.getColor());
    }
    
    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese el color del rectángulo:");
        String color = scanner.next();
        
        Rectangulo rectangulo = new Rectangulo(base, altura, color);
        
        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());
        System.out.println("Color del rectángulo: " + rectangulo.getColor());
    }
    
    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        System.out.println("Ingrese el color del cuadrado:");
        String color = scanner.next();
        
        Cuadrado cuadrado = new Cuadrado(lado, color);
        
        System.out.println("Área del cuadrado: " + cuadrado.getArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.getPerimetro());
        System.out.println("Color del cuadrado: " + cuadrado.getColor());
    }
    
    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese el tercer lado del triángulo:");
        double lado3 = scanner.nextDouble();
        System.out.println("Ingrese el color del triángulo:");
        String color = scanner.next();
        
        Triangulo triangulo = new Triangulo(base, altura, lado3, color);
        
        System.out.println("Área del triángulo: " + triangulo.getArea());
        System.out.println("Perímetro del triángulo: " + triangulo.getPerimetro());
        System.out.println("Color del triángulo: " + triangulo.getColor());
    }
}

class Circulo {
    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    private double area() {
        return Math.PI * radio * radio;
    }

    private double perimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo {
    private double base;
    private double altura;
    private String color;

    public Rectangulo(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    private double area() {
        return base * altura;
    }

    private double perimetro() {
        return 2 * (base + altura);
    }
}

class Cuadrado {
    private double lado;
    private String color;

    public Cuadrado(double lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    public double getLado() {
        return lado;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    private double area() {
        return lado * lado;
    }

    private double perimetro() {
        return 4 * lado;
    }
}

class Triangulo {
    private double base;
    private double altura;
    private double lado3;
    private String color;

    public Triangulo(double base, double altura, double lado3, String color) {
        this.base = base;
        this.altura = altura;
        this.lado3 = lado3;
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado3() {
        return lado3;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    private double area() {
        return base * altura / 2;
    }

    private double perimetro() {
        return base + altura + lado3;
    }
}