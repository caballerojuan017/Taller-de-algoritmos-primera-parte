import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pulgadas = 39.27; // Conversión correcta
        double pies = 12;
        int Metros = 0;
        double resultado1 = 0;
        double resultado2 = 0;

        System.out.print("Ingrese el número de metros a convertir a pulgadas y pies: ");
        Metros = scanner.nextInt();

        resultado1 = Metros * pulgadas; 
        resultado2 = resultado1 / pies;

        System.out.println(Metros + " metros son " +  resultado2 + " pies y " + (resultado1) + " pulgadas");

        scanner.close();
    }
}