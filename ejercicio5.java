import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner (System.in);

        double calificacionFinal= 0;
        double primerNota, segundaNota, tercerNota= 0;
        double promedioCalificaciones= 0;
        double calificacionExamenFinal= 0;
        double calificacionTrabajoFinal= 0;

    System.out.println("Ingrese primer nota parcial: ");
    primerNota= scanner.nextDouble();

    System.out.println("Ingrese segunda nota parcial: ");
    segundaNota= scanner.nextDouble();

    System.out.println("Ingrese tercer nota parcial: ");
    tercerNota= scanner.nextDouble();

    promedioCalificaciones= (primerNota + segundaNota + tercerNota) / 3;
    
    System.out.println("Ingrese calificacion de examen final: ");
    calificacionExamenFinal= scanner.nextDouble();
    
    System.out.println("Ingrese calificacion de trabajo final: ");
    calificacionTrabajoFinal= scanner.nextDouble();

    
    calificacionFinal = (promedioCalificaciones * 0.55) + (calificacionExamenFinal * 0.30) + (calificacionTrabajoFinal * 0.15);
    System.out.printf("Su calificación final es: %.1f", calificacionFinal);

        scanner.close();


        
    }
    
}