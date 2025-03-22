import java.util.Scanner;


public class ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int descuento= 0;
        int totalCompra= 0;
        int totalFinal= 0;
    
        System.out.println("Ingrese monto de compra total: ");
        totalCompra= scanner.nextInt();

        descuento= totalCompra * (15) / 100;
        totalFinal= totalCompra - descuento;
        System.out.println("Valor total de la compra con descuento: " + totalFinal);

        scanner.close();

        
    }    
}
