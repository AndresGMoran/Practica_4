// Rectangle.java
package figuras;

public class Rectangle {
    public static void calculateArea() {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = App.scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double height = App.scanner.nextDouble();
        double area = base * height;
        System.out.println("El área del rectángulo es: " + area);
    }
}