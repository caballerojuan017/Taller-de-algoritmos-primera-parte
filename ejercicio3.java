import java.util.Scanner;

public class ejercicio3 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

    int sueldoBase = 1200000;
    int comision = 10;
    int ventasMes = 0;
    int sueldoTotal = 0;


    System.out.println("Ingrese ventas realizadas en el mes:" );
    ventasMes = scanner.nextInt();

    sueldoTotal = (sueldoBase * comision) / 100 * ventasMes + sueldoBase;
    
    System.out.println("Sueldo total por comisiones: " + sueldoTotal); 

    scanner.close();

    
}
}
