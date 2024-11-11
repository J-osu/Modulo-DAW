package array;
import java.util.Scanner;
public class Notas {
    static Scanner sc = new Scanner(System.in);
    static int ALUMNOS = 5;
    static int MODULOS = 4;
    static String[] alumnos = {"José", "Ana", "María", "Luis", "Noelia"};
    static String[] modulos = {"Programación", "Redes", "Base de datos", "Desarrollo servidor"};
    static int[][] notas = new int[ALUMNOS][MODULOS];
    public static void main(String[] args) throws Exception {
        //Llama a la función correpomdiemte.
        Notas.lecturaNotas();
    }

   public static void lecturaNotas(){
    for(int i =0; i<ALUMNOS; i++){
        System.out.println("Nota de " + alumnos[i] + " : " );
        for(int j=0; i<MODULOS; j++){
            System.out.println("    -" + modulos[j] + " : ");
        }
    }
   }
   public static void ImprimirNotas(){

   }
}