import java.util.Scanner;

public class ejercicio23 {

    public static void main(String[] args) {

    Scanner scanner =new Scanner(System.in);

    int m, n ;
    int bulto= 24;
    double cajaAceite= 15;
    double precioBulto= 132;
    double precioAceite= 180;
    double precioBultoDetal= 7.50;
    double precioAceiteDetal= 14.50;

    System.out.print("Ingrese la cantidad de kilogramos de harina obtenidos: " );
    m= scanner.nextInt();

    System.out.print("Ingrese la cantidad de litros de aceite obtenidos: " );
    n= scanner.nextInt();
    

    int sobranteBulto= (m % bulto);
    System.out.println(sobranteBulto);

    double sobranteAceite= (n % cajaAceite);
    int totalBultosXMayor= (int) Math.floor(m / bulto);
    System.out.println(totalBultosXMayor);
    int totalAceiteXMayor=  (int) Math.floor(n / cajaAceite);
    System.out.println(totalAceiteXMayor);


    double TotalIngresoBulto= (totalBultosXMayor * precioBulto) + (sobranteBulto * precioBultoDetal); 
    double totalIngresoAceite= (totalAceiteXMayor * precioAceite) + (sobranteAceite * precioAceiteDetal);
    double totalIngresosProduccion= totalIngresoAceite + TotalIngresoBulto;

    System.out.println(TotalIngresoBulto);
    System.out.println(totalIngresoAceite);


    System.out.print("El ingreso total por venta de produccion: " + totalIngresosProduccion);

    scanner.close();

    }
}


