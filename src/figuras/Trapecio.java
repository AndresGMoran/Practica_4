package figuras;

public class Trapecio {
    public static void calcularAreaTrapecio(){
        System.out.println("Dime la base AB");
        double baseAb = App.scanner.nextDouble();

        System.out.println("Dime la base DC");
        double baseDc = App.scanner.nextDouble();

        System.out.println("Dime la altura");
        double altura = App.scanner.nextDouble();
        
        double area = ((baseAb+baseDc)*altura)/2;
        System.out.println("El area del trapecio es " + area);
    }
}
