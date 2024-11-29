package array;
import java.util.Scanner;
public class Array2 {
    static Scanner sc = new Scanner(System.in);
    static int CIUDADES = 5;
    static String ciudades[] = new String[CIUDADES];
    static double tempperaturas[] = new double[CIUDADES];
    static double max;
    static double min;
    static int Pmax;
    static int Pmin;
    static double media;
    public static void main(String[] args) throws Exception {
        Array2.pedirCiudades();
        Array2.generarTemp();
        Array2.imprimirResultados();
    }

    public static void pedirCiudades(){
        for  ( int i = 0; i<Array2.CIUDADES; i++){
            System.out.print("Nombre de la ciudad " + (i + 1) + ": ");
            Array2.ciudades[i] = Array2.sc.next();
        }
    }
    public static void generarTemp(){
        for (int i = 0; i<Array2.CIUDADES; i++){
            double temp = (Math.random()*20)+20;
            temp = Math.round(temp * 10.0) / 10.0;
            tempperaturas[i] = temp;
        }
         max = 0; min = 0; Pmax = 0; Pmin = 0; media = 0;
        max = tempperaturas[0]; min = tempperaturas[0];
        Pmax = 0; Pmin = 0;
        for (int i=0; i<Array2.CIUDADES; i++){
            media = media + tempperaturas[i];
            if (tempperaturas[i]>max){
                max = tempperaturas[i];
                Pmax = i;
            }
            if (tempperaturas[i]<min){
                min = tempperaturas[i];
                Pmin = i;
            }
        }
        media = media / Array2.CIUDADES;
    }
    public static void imprimirResultados(){
        System.out.println("Temperatura max :  " + max + " y es de " + Array2.ciudades[Pmax]);
        System.out.println("Temperatura min :  " + min + " y es de " + Array2.ciudades[Pmin]);
        System.out.println("Media : " + media);
    }
}