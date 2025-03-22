import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de naranjas compradas (X): ");
        int cantidadNaranjas = scanner.nextInt();
        
        System.out.print("Ingrese el precio por docena (Y): ");
        double precioPorDocena = scanner.nextDouble();
        
        System.out.print("Ingrese el dinero obtenido de la venta (K): ");
        double dineroObtenido = scanner.nextDouble();
        
        double costoTotal = (cantidadNaranjas / 12.0) * precioPorDocena;
        double ganancia = ((dineroObtenido - costoTotal) / costoTotal) * 100;
        
        System.out.println("El porcentaje de ganancia obtenido es: " + ganancia + "%");
        
        scanner.close();
    }
}
