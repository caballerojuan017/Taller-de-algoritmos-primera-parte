import java.util.Scanner;

public class ejercicio1 {
    public static void main (String[] args) {
       

        Scanner scanner = new Scanner (System.in);

         int edad1, edad2, edad3;
         int promedio;

         System.out.println("Ingrese la edad de la persona 1: ");
         edad1 = scanner.nextInt();

         System.out.println("Ingrese la edad de la persona 2: ");
         edad2 = scanner.nextInt();

         System.out.println("Ingrese la edad de la persona 3: ");
         edad3 = scanner.nextInt();

         promedio = (edad1 + edad2 + edad3) / 3;



        System.out.println("El promedio de las 3 edades es: " + promedio);

        
        scanner.close();

    }
}