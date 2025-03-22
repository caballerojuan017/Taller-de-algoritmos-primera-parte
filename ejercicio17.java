import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio de venta al público (PVP): ");
        double pvp = scanner.nextDouble();

        System.out.print("Ingrese el precio final pagado: ");
        double precioFinal = scanner.nextDouble();

        double descuento = ((pvp - precioFinal) / pvp) * 100;

        System.out.println("El porcentaje de descuento aplicado es: " + descuento + "%");

        scanner.close();
    }
}

