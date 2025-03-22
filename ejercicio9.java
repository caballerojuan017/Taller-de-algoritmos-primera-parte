import java.util.Scanner;


public class ejercicio9 {

    public static void main(String[] args) {
        

        Scanner scanner =new Scanner (System.in);

        int numeroHoras= 0;
        int precioHora= 0;
        int descuentoFijo= 20;
        int salario= 0;
        int salarioNeto= 0;

        System.out.println("Ingrese numero de horas trabajadas: ");
        numeroHoras= scanner.nextInt();

        System.out.println("Ingrese numero de precio de hora trabajada: ");
        precioHora= scanner.nextInt();

        salario= numeroHoras * precioHora;
        salarioNeto= salario - (salario * descuentoFijo / 100);
        
        System.out.println("El salario neto del trabajador es: " + salarioNeto);

        scanner.close();

    }
}