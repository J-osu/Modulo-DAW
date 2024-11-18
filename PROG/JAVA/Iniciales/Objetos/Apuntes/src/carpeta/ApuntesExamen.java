package carpeta;
import java.util.Scanner;

public class ApuntesExamen {
    static Scanner sc = new Scanner(System.in);
    static int CIUDADES = 15;
    static int PERSONAS = 10;
    static int MODULOS = 5;
    static String ciudades[] = new String[CIUDADES];
    static double tempperaturas[] = new double[CIUDADES];
    static String personas[] = new String[PERSONAS];
    static String modulos[] = new String[MODULOS];
    public static void main(String[] args) throws Exception {

    }

    public static void entradaDatos(){
        System.out.print("Introduce los datos solicitados: ");
        for  ( int i = 0; i<ApuntesExamen.CIUDADES; i++){
            System.out.print("Nombre de la ciudad " + (i + 1) + ": ");
            ApuntesExamen.ciudades[i] = ApuntesExamen.sc.next();
        }
        for  ( int i = 0; i<ApuntesExamen.PERSONAS; i++){
            System.out.print("Nombre de las personas " + (i + 1) + ": ");
            ApuntesExamen.personas[i] = ApuntesExamen.sc.next();
        }
        for  ( int i = 0; i<ApuntesExamen.MODULOS; i++){
            System.out.print("Nombre de los modulos" + (i + 1) + ": ");
            ApuntesExamen.modulos[i] = ApuntesExamen.sc.next();
        }
    }

    public static void ciudadesRandom(){
        //Genera temperaturas de manera aleatoria para las ciudades.
    }

    public static void cursosPersona(){
        //Genrea una tabla con los modulos que cursa cada persona.
    }

}