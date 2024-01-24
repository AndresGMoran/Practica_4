// Circle.java
package figuras;

public class Circle {
    public static void calculateArea() {
        System.out.print("Ingrese el radio del círculo: ");
        double radius = App.scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("El área del círculo es: " + area);
    }
}