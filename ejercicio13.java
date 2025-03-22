import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de billetes de 50000: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 20000: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 10000: ");
        int n3 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 5000: ");
        int n4 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 2000: ");
        int n5 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 1000: ");
        int n6 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 500: ");
        int n7 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 100: ");
        int n8 = scanner.nextInt();

        int total = (n1 * 50000) + (n2 * 20000) + (n3 * 10000) + (n4 * 5000) +
                    (n5 * 2000) + (n6 * 1000) + (n7 * 500) + (n8 * 100);

        System.out.println("El total de dinero en el banco es: " + total);

        scanner.close();
    }
}