import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio al contado del computador: ");
        double precioContado = scanner.nextDouble();

        System.out.print("Ingrese el valor de la cuota mensual: ");
        double cuotaMensual = scanner.nextDouble();

        double precioCuotas = cuotaMensual * 12;

        double recargo = ((precioCuotas - precioContado) / precioContado) * 100;

        System.out.println("El precio total por cuotas es: " + precioCuotas + " Bolívares");
        System.out.println("El porcentaje de recargo es: " + recargo + "%");

        scanner.close();
    }
}
