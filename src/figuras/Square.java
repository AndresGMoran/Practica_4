// Square.java
package figuras;

public class Square {
    public static void calculateArea() {
        System.out.print("Ingrese el lado del cuadrado: ");
        double side = App.scanner.nextDouble();
        double area = side * side;
        System.out.println("El área del cuadrado es: " + area);
    }
}