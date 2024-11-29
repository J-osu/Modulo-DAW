package array;
import java.util.Scanner;
public class Array1 {
    static Scanner sc = new Scanner(System.in);
    static int ALUMNOS = 5;
    static int ASIGNATURAS = 4;
    static int TRIMESTRES = 2;
    static String[] alumnos = new String[ALUMNOS];
    // static String[] alumnos = {"Jose", "Ana", "Pedro", "Pol", "Julian"};
    public static void main(String[] args) throws Exception {
        Array1.pedirNombre();
        Array1.generarNotas();
    }

    public static void pedirNombre(){
        for ( int i = 0; i<Array1.ALUMNOS; i++){
            System.out.print("Nombre Alumno " + i + ": ");
            Array1.alumnos[i] = Array1.sc.next();
        }
    }

    public static void generarNotas(){
        double notas[] = new double[ALUMNOS];
        double temp = 0.0;
        double max = 0; double min = 0; int Pmax = 0; int Pmin = 0;
        double media = 0;
        System.out.println("----- Generación de Notas ------");
        for (int i=0; i<Array1.ALUMNOS; i++){
            temp = Math.random()*10;
            temp = Math.round(temp*100.00)/100.00;
            notas[i] = temp;
        }
        System.out.println("----- Impresion de Notas ------");
        for (int i = 0; i<Array1.ALUMNOS; i++){
            System.out.println("nota de " + alumnos[i] + i + " : " + notas[i]);
        }
        System.out.println("----- Informes de Resultados --------");
        //suposicion
        max = notas[0];
        min = notas[0];
        Pmax = 0;
        Pmin = 0;
        for (int i=0; i<Array1.ALUMNOS; i++){
            media = media + notas[i];
            if (notas[i]>max){
                max = notas[i];
                Pmax = i;
            }
            if (notas[i]<min){
                min = notas[i];
                Pmin = i;
            }
        }
        System.out.println("Max :  " + max + " y es de " + Array1.alumnos[Pmax]);
        System.out.println("Min :  " + min + " y es de " + Array1.alumnos[Pmin]);
        media = media / Array1.ALUMNOS;
        System.out.println("Media : " + media);
        
    }

    public static void notasTeclado(){ 
        int[] notas = new int[Array1.ALUMNOS]; //0..4 indice's del array
        System.out.println("----- Lectura de Notas ------");
        for (int i = 0; i<ALUMNOS; i++){ //0..5 indice del for
            System.out.print("Introduce nota " + i + " : ");
            notas[i] = Array1.sc.nextInt();
        }
        System.out.println("----- Impresion de Notas ------");
        for (int i = 0; i<ALUMNOS; i++){
            System.out.print("nota " + i + " : " + notas[i]);
        }

    }

    public static void explicacion(){
        //almacenar array de notas (enteros) de 10 alumnos
        // int nota = 9; //v. monovaluada (2bytes)
        // notas --> (array [] --> v.multivaluada)
        //se usa el operador new() --> RESERVA EN T.COMPILACION(ESTATICA) 10 posiciones
        //ENTERAS de memoria RAM int-->2 bytes --> notas ocupa 20 bytes
        //----- DECLARACION DEL ARRAY (NO INICIALIZO)
        // int[] notas = new int[10]; //notas[0] ... notas[9]{0, ...., 0}
        // int[] notas1 = { 2,5,7,1,6,8,9,10,0,4 };
        //array 2D Bidimensional (tabla) (alumnos/asignaturas)
        int[][] notas2 = new int[4][5]; //5f y 6c
        notas2[0][0] = 3;
        //...
        notas2[0][4] = 7;
        notas2[1][0] = 6;
        //...
        notas2[1][4] = 7;
        //...
        notas2[3][0] = 3;
        notas2[3][4] = 7;
        //array 3D Tridimensional (cubo) (alumnos/asignaturas/trimestres)
        int[][][] notas3 = new int[Array1.ALUMNOS][Array1.ASIGNATURAS][Array1.TRIMESTRES]; //5f, 6c, 3prof
        notas3[2][1][2] = 5;
    }

}