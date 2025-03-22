import java.util.Scanner; 

public class ejercicio8 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        double a= 0;
        double b= 0;
        double c= 0;
        double p= 0;
        double resultadoMultipliacion= 0;
        double areaTriangulo= 0;
        
        System.out.println("Ingrese la primera longuitud de uno de los lados: ");
        a= scanner.nextDouble();

        System.out.println("Ingrese la segunda longuitud de uno de los lados: ");
        b= scanner.nextDouble();

        System.out.println("Ingrese la tercera longuitud de uno de los lados: ");
        c= scanner.nextDouble();

        p= (a+b+c) / 2;
        resultadoMultipliacion= p * (p-a) * (p-b) * (p-c);
        areaTriangulo= Math.sqrt(resultadoMultipliacion);

        System.out.printf("El area del triangulo es  %.2f cm²%n", areaTriangulo);

        scanner.close();
    }
}