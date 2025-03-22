import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double mujeres= 0;
        double hombres= 0;
        double totalEstudiantes= 0;
        double porcetajeHombre= 0;
        double porcentajeMujer= 0;


        System.out.println("Ingrese numero de estudiantes: ");
        totalEstudiantes= scanner.nextDouble();
        
        System.out.println("Ingrese numero de estudiantes hombres: ");
        hombres= scanner.nextDouble();

        System.out.println("Ingrese numero de estudiantes mujeres: ");
        mujeres= scanner.nextDouble();

        porcentajeMujer= (mujeres/totalEstudiantes) * 100;
        System.out.printf("El porcentaje de mujeres en el aula es de: %.1f%%%n", porcentajeMujer,"%");


        porcetajeHombre= (hombres/totalEstudiantes) * 100;
        System.out.printf("El porcentaje de hombres en el aula es de: %.1f%%%n",  porcetajeHombre,"%");

        scanner.close();







        
    }
}


