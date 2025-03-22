

public class ejercicio16 {

    public static void main (String[] args) {


        double laminaLargo= 4;
        double laminaAncho= 1.5;
        double piezaConsumoLargo= 0.5;
        double piezaConsumoAncho= 0.5;        


        double areaLamina= laminaLargo * laminaAncho;
        double areaPieza= piezaConsumoLargo * piezaConsumoAncho;
        int totaLPiezas= (int) (areaLamina / areaPieza);

        double desperdicio = areaLamina % areaPieza; 

        System.out.println("El total de piezas que sale en una lamina con " + laminaLargo + " m largo " + "y " + laminaAncho + " m ancho son: " + totaLPiezas + " piezas");
        System.out.println("El total de desperdicio es " + desperdicio + "m");
    }
}

