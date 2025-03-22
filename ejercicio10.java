import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double precioChelinesAustriacos= 9568.71;
        double precioDolar= 122499;
        double precioDracmaGriegos= 886.07;
        //double precioFrancosBelgas= 3327.28;//
        double precioFrances= 20110;
        //double precioLibraEsterlina= 178938;//
        double precioLirasItalianas= 92.89;
        int chelinesPesetas= 0;
        double dracmaFrancos= 0;
        double pesetasItaliana= 0;
        double pesetasDolar= 0;
        double chelinesPesetasR, dracmaFrancosR, pesetasDolarR, pesetasItalianaR ;

        System.out.println("Ingrese chelines austriacos a convertir a pesetas: ");
        chelinesPesetas= scanner.nextInt();

        chelinesPesetasR= precioChelinesAustriacos * chelinesPesetas; 
        System.out.printf("%d chelines austriacos son %.2f pesetas%n", chelinesPesetas, chelinesPesetasR);

        System.out.print("Ingrese cantidad de dracmas griegos a convertir a franco frances: ");
        dracmaFrancos = scanner.nextDouble();

        dracmaFrancosR = precioDracmaGriegos / precioFrances * dracmaFrancos;
        System.out.printf("%.2f dracmas griegos equivalen a %.2f francos franceses%n", dracmaFrancos, dracmaFrancosR);

        System.out.print("\nIngrese cantidad de pesetas a convertir a dólares y liras italianas: ");
        pesetasDolar = scanner.nextDouble();

        pesetasDolarR = pesetasDolar / precioDolar;
        pesetasItalianaR = (pesetasItaliana * 100) / precioLirasItalianas;
        System.out.printf("%.2f pesetas equivalen a %.2f dólares%n", pesetasDolar, pesetasDolarR);
        System.out.printf("%.2f pesetas equivalen a %.2f liras italianas%n", pesetasItaliana, pesetasItalianaR);

        scanner.close();
        


        scanner.close();
    }
} 