package array;
import java.util.Scanner;
public class Array2 {
    static Scanner sc = new Scanner(System.in);
    static int CIUDADES = 5;
    static String ciudades[] = new String[CIUDADES];
    static double[] temperaturas = new double[21];
    public static void main(String[] args) throws Exception {
        Array2.pedirCiudades();
    }

    public static void pedirCiudades(){
        for  ( int i = 0; i<Array2.CIUDADES; i++){
            System.out.print("Nombre de la ciudad " + (i + 1) + ": ");
            Array2.ciudades[i] = Array2.sc.next();
        }
        System.out.println(CIUDADES);
    }

    public static void calcularTempMaxyMin(){
        double temp[] = new double[CIUDADES];
        double max = 0; double min = 0; int Pmax = 0; int Pmin = 0; double media = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = 20 + i;
        }
        for (int i = 0; i<Array2.CIUDADES; i++){
            
        }
        max = temp[0];
        min = temp[0];
        Pmax = 0;
        Pmin = 0;
        for (int i=0; i<Array1.ALUMNOS; i++){
            media = media + temp[i];
            if (temp[i]>max){
                max = temp[i];
                Pmax = i;
            }
            if (temp[i]<min){
                min = temp[i];
                Pmin = i;
            }
        }
        System.out.println("Temperatura max :  " + max + " y es de " + Array2.ciudades[Pmax]);
        System.out.println("Temperatura min :  " + min + " y es de " + Array2.ciudades[Pmin]);
        media = media / Array2.CIUDADES;
        System.out.println("Media : " + media);

    }
}