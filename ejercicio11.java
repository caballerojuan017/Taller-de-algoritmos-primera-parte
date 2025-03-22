import java.util.Scanner;


public class ejercicio11 {

    public static void main(String[] args) {
        

        Scanner scanner =new Scanner (System.in);


        int horasTrabajo= 204;
        int precioHoraNormal= 7000;
        int sueldoBase; 
        int horasExtras= 60;
        int actualizacionAcademica= 25000;
        int bonificaciónHijo= 17300;
        int primaHogar= 18000;
        int paroForzoso, politicaHabitacional, cajaAhorro;
        int asiganciones, deducciones, sueldoNeto;
        
        sueldoBase= horasTrabajo * precioHoraNormal;
        
        horasExtras= (precioHoraNormal * 25 / 100) * horasExtras; 
        
        asiganciones= horasExtras + actualizacionAcademica + bonificaciónHijo + primaHogar;

        paroForzoso= sueldoBase * 5 / 100;

        politicaHabitacional= sueldoBase * 2 / 100;

        cajaAhorro= sueldoBase * 7 / 100;

        deducciones= paroForzoso + politicaHabitacional + cajaAhorro;
        
        sueldoNeto= sueldoBase + asiganciones - deducciones;

        System.out.println("Sueldo neto del trabajador  " + sueldoNeto);

        System.out.println("Deducciones totales sobre sueldo base del trabajador  " + deducciones);

        System.out.println("Asignaciones totales sobre sueldo base del trabajador   " + asiganciones);

        scanner.close();

    }
}