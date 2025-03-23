import java.util.Locale;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        System.out.println("Ingrese la nota del examen de Matemáticas: ");
        double examenMat = scanner.nextDouble();

        System.out.println("Ingrese las 3 notas de tareas de Matemáticas: ");

        System.out.println("Ingrese la 1 nota: ");
        double tarea1 = scanner.nextDouble();
        System.out.println("Ingrese la 2 nota: ");
        double tarea2 = scanner.nextDouble();
        System.out.println("Ingrese la 3 nota: ");
        double tarea3 = scanner.nextDouble();

        double promedioTareasMat = (tarea1 + tarea2 + tarea3) / 3;
        double promedioMat = (examenMat * 0.90) + (promedioTareasMat * 0.10);

        System.out.println("Ingrese la nota del examen de Física: ");
        double examenFis = scanner.nextDouble();

        System.out.println("Ingrese las 2 notas de tareas de Física: ");

        System.out.println("Ingrese la 1 nota: ");
        double tareaFis1 = scanner.nextDouble();
        System.out.println("Ingrese la 2 nota: ");
        double tareaFis2 = scanner.nextDouble();

        double promedioTareasFis = (tareaFis1 + tareaFis2) / 2;
        double promedioFis = (examenFis * 0.80) + (promedioTareasFis * 0.20);

        System.out.print("Ingrese la nota del examen de Química: ");
        double examenQui = scanner.nextDouble();

        System.out.println("Ingrese las 3 notas de tareas de Química: ");

        System.out.println("Ingrese la 1 nota: ");
        double tareaQui1 = scanner.nextDouble();
        System.out.println("Ingrese la 2 nota: ");
        double tareaQui2 = scanner.nextDouble();
        System.out.println("Ingrese la 3 nota: ");
        double tareaQui3 = scanner.nextDouble();

        double promedioTareasQui = (tareaQui1 + tareaQui2 + tareaQui3) / 3;
        double promedioQui = (examenQui * 0.85) + (promedioTareasQui * 0.15);

        double promedioGeneral = (promedioMat + promedioFis + promedioQui) / 3;

        System.out.printf("Promedio de Matemáticas: %.1f%n", promedioMat);
        System.out.printf("Promedio de Física: %.1f%n", promedioFis);
        System.out.printf("Promedio de Química: %.1f%n", promedioQui);
        System.out.printf("Promedio general: %.1f%n", promedioGeneral);

        scanner.close();
    }
}
