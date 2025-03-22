import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto del presupuesto anual: ");

    
        int presupuesto = scanner.nextInt();
        
        int ginecologia = presupuesto * 40 / 100;
        int traumatologia = presupuesto * 30 / 100;
        int pediatria = presupuesto * 30 / 100;
        
        System.out.println("Ginecología recibirá: " + ginecologia + " pesos");
        System.out.println("Traumatología recibirá: " + traumatologia + " pesos");
        System.out.println("Pediatría recibirá: " + pediatria + " pesos");
        
        scanner.close();
    }
}
