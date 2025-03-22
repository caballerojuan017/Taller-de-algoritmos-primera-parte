public class ejercicio14 {
    public static void main(String[] args) {

        double a = 2, b = 3, c = 5, d = 4, e = 6, f = 7;
        double denominator = a * e - b * d;
        
        
        if (denominator == 0) {
            System.out.println("El sistema no tiene solución única.");
            return;
        }

        double x = (c * e - b * f) / denominator;
        double y = (a * f - c * d) / denominator;
        System.out.println("X = " + x + ", Y = " + y);

        
    }

}
