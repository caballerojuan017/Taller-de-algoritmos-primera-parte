import java.util.Scanner;

public class ejercicio2 {

    public static void main (String[] args) {

    Scanner scanner = new Scanner (System.in);

    int inversionMonto = 0;
    int mesesInversion = 0;
    int porcentajeInteres = 2;
    int gananciaTotalInversion = 0;

    System.out.println("Ingrese el monto que desea invertir: " );
    inversionMonto = scanner.nextInt();

    System.out.println("Ingrese meses de inversion: ");
    mesesInversion = scanner.nextInt();


    gananciaTotalInversion = (inversionMonto * porcentajeInteres)/100 * mesesInversion;

    System.out.println("la ganancia total de su inversion es; " + gananciaTotalInversion);

    
    scanner.close();

    }
}
