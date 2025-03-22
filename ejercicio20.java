import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el capital prestado (X): ");
        double capital = scanner.nextDouble();
        
        System.out.print("Ingrese el interés pagado (Y): ");
        double interesPagado = scanner.nextDouble();
        
        int tiempo = 4;
        double tasaInteres = (interesPagado * 100) / (capital * tiempo);
        
        System.out.println("La tasa de interés anual es: " + tasaInteres + "%");
        
        scanner.close();
    }
}
    
