// Triangle.java
package figuras;

public class Triangle {
    public static void calculateArea() {
        System.out.print("Ingrese la base del triángulo: ");
        double base = App.scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double height = App.scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("El área del triángulo es: " + area);
    }
}