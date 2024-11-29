package array;
import java.util.Scanner;
public class Array3 {
    static Scanner sc = new Scanner(System.in);
    static int NUMEROPERSONAS = 5;
    static String NOMBRES[] = {"Luffy", "Zoro", "Nami", "Usopp", "Sanji"};
    static int TIRADAS = 10, tempContador;
    static int tiradas[] = new int[TIRADAS];
    static int[] contador = new int[NUMEROPERSONAS];
    static int[] MaxMin = new int[2];
    public static void main(String[] args) throws Exception {
        //Llama a la función correpomdiemte.
        Array3.tirada();
        Array3.contador();
        Array3.generarOrden();
        Array3.imprimirResultados();
    }

    public static void tirada(){
        // función -> que genere tiradas aleatorias de nombres predefinidos.
            for( int i = 0; i<TIRADAS; i++){
                //Sacamos 10 tiradas.
                tiradas[i] = (int)(Math.random()*NOMBRES.length);
            }
    }
    public static void contador(){
        // función -> que genere un contador y además genere el máx. y el min.
        for ( int tirar : tiradas){
            //Cuenta las veces que sepiten las pociciones de NOMBRES.
            contador[tirar] ++; //Incrementa el contador.
        }
        for (int i = 0; i < NOMBRES.length; i++) {
            //Muestra NOMBRES y las veces que sale.
            System.out.println(NOMBRES[i] + ": " + contador[i] + " veces");
        }
        int valorMax = contador[0], valorMin = contador[0]; int pMax = 0, pMin = 0;
        for (int i=0; i<NOMBRES.length; i++){
            //Comparamos contado >< max/min y sustituimos.
            if (contador[i]>valorMax){
                valorMax = contador[i];
                pMax = i;
            }
            if (contador[i]<valorMin){
                valorMin = contador[i];
                pMin = i;
            }
        }
        System.out.println("El nombre con más apariciones es: " + NOMBRES[pMax] + " con " + valorMax + " veces" + " y el que menos es: " + NOMBRES[pMin] + " con: " + valorMin + " veces.");
        System.out.println("El premio de 1000$ es para: " + NOMBRES[pMax] + " con " + valorMax + " aparaciones");
        System.out.println();
    }

    public static int entregaPremios(){
        int max = contador[0];
        for (int i = 0; i>NUMEROPERSONAS; i++){
            if (contador[i]> max) {
                max = contador[i];
            }
        }
        return max;
    }

    public static void generarOrden(){
        //función-> que ordeneel array de NOMBRES en base al contador.
        for (int i = 0; i < NOMBRES.length - 1; i++) {
            //mediante el metodo burbuja se intercambian los valores para reordenarlos.
            for (int j = i + 1; j < NOMBRES.length; j++) {
                if (contador[i] < contador[j]) {
                    // Se intercambian los valores en el array de NOMBRES
                    String tempNombre = NOMBRES[i];
                    NOMBRES[i] = NOMBRES[j];
                    NOMBRES[j] = tempNombre;
                    // Se intercambian los valores en el array del contador.
                    int tempContador = contador[i];
                    contador[i] = contador[j];
                    contador[j] = tempContador;
                }
            }
        }
        System.out.println();           
    }
    public static void imprimirResultados(){
        // función -> imprimir los resultados por pantalla.
        System.out.println("Resultados una vez ordenados serian los siguientes:");
        for (int i = 0; i < NOMBRES.length; i++) {
            System.out.println(NOMBRES[i] + ": " + contador[i] + " veces");
        }
    }
}