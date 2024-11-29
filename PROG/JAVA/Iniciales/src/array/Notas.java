package array;
import java.util.Scanner;
public class Notas {
    static Scanner sc = new Scanner(System.in);
    static int ALUMNOS = 5;
    static int MODULOS = 4;
    static String[] alumnos = { "Jose", "Ana", "Maria", "Luis", "Noelia" };
    static String[] modulos = { "Programacion", "Redes", "BD",  "DWS" };
    static double[][] notas = new double[ALUMNOS][MODULOS];
    String[] promocion = new String[ALUMNOS];
    String[] mapobrados = new String[MODULOS];
    static String persona;
    static String modulo;

    public static void main(String[] args){
        Notas.GenerarNotas();
        Notas.quienaprueba();
        Notas.ImprimirNotasTabla();
        Notas.OrdenarMenor();
        Notas.getIndexPersona();
        Notas.getIndexModulo();
        
    }

    public static void enradaDatos(){
        System.out.print("Introduce lo que deseas bucar: ");
    }

    public static void LecturaNotas(){
        //recorrido de alumnos
        for (int i=0; i<ALUMNOS; i++){
            System.out.println("Nota de " + alumnos[i] + " : "); //1
            for (int j=0; j<MODULOS; j++){
                System.out.print("   - " + modulos[j] + " : "); //1
                // System.out.println("Nota de "+ alumnos[i] + " - " + modulos[j] + " : "); //2
                //lectura por teclado
                Notas.notas[i][j]=Notas.sc.nextInt();
            }
        }
    }

    public static void GenerarNotas(){
        //Se recorre ALUMNOS.
        for (int i=0; i<ALUMNOS; i++){
            for (int j=0; j<MODULOS; j++){
                //Se generan 4 notas aleatorias
                //para cada fila, con un total de 5 filas y 4 numeros en ellas.
                Notas.notas[i][j]=(int)(Math.random()*10);
            }
        }
    }

    public static void OrdenarMenor(){
        double temp = 0;
        for (int i = 0; i < ALUMNOS; i++) { // Recorre cada fila de notas[i] 
            //dentro de su rango  que es 5, es decir, hay 5 filas de 4 numeros.
            for (int j = 0; j < MODULOS - 1; j++) { //Aplicamos método burbuja.
                 //el - 1 es para evitar que se pase del rango que es 4.
                for (int k = 0; k < MODULOS - j - 1; k++) { //j y k se comparan con notas[i]
                    if (notas[i][k] > notas[i][k + 1]) { //En caso de que k > que k +1 se cambian.
                        temp = notas[i][k]; //se guarda temporalmente el valor de notas[i][k].
                        notas[i][k] = notas[i][k + 1];
                        notas[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("------ Notas ordenadas de menor a mayor --------------");
        System.out.println();
        System.out.printf("%-20s", "");
        for (int i=0; i<MODULOS; i++){
            System.out.printf("%-20s", modulos[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.printf("%-20s", alumnos[i] + "   ");
            for (int j = 0; j < MODULOS; j++) {
                System.out.printf("%-20s", notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ImprimirNotasTabla(){
        System.out.println("------ LISTADO DE NOTAS --------------");
        System.out.printf("%-22s", "");
        for (int i=0; i<ALUMNOS; i++){
            System.out.printf("%-20s", alumnos[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < MODULOS; i++) {
            System.out.printf("%-22s", modulos[i] + "   ");
            for (int j = 0; j < ALUMNOS; j++) {
                System.out.printf("%-20s", notas[j][i] + "        ");
            }
            System.out.println();
        }
    }

    public static void ImprimirNotas(){
        System.out.println("------ LISTADO DE NOTAS --------------");
        for (int i=0; i<ALUMNOS; i++){
            for (int j=0; j<MODULOS; j++){
                System.out.println("Nota de "+ alumnos[i] + " - " + modulos[j] + " : " + notas[i][j]) ; //2
            }
        }
    }

    public static int getIndexPersona(){ 
        int index = -1; // sup que no se encuentra
        for(int i=0; (i<ALUMNOS) && (index == -1); i++){ //ejecuto mientras no se encuentre
            if (Notas.alumnos[i]== persona){
                index = i;
            }
        }
        // System.out.println(persona + " es " + index);
        return index;
        
    }

    public static int getIndexModulo(){ 
         //dado el nombre de modulo devuelvo su posición (índice)
         int index = -1; //sup que no se encuentra
         for (int i=0; (i<MODULOS) && (index == -1); i++){
             if (Notas.modulos[i] == modulo){
                 index=i;
             }
         }
         return index;
    }

    public static String[] quienaprueba(){
        //Devolver un array de personas aprovadas. 
        String[] personas = new String[ALUMNOS];
        int Jmod = getIndexModulo();
        if (Jmod != -1){
            for (int i=0; i<ALUMNOS; i++){
                if (Notas.notas[i][Jmod] > 5){
                    personas[i] = alumnos[i];
                }
            }   
        }
        
        System.out.print("Quien aprueba " + modulo + " : ");
        return personas;
    }
    
    public static String[] modulosAprovados(){
        //Devolver un array de modulos aprobados.
        int Iper = getIndexPersona();
        String[] modulos = new String[MODULOS]; //respuesta
        if (Iper != -1){ //si esta la persona
            for (int i=0; i<MODULOS; i++){
                if (Notas.notas[Iper][i] < 5){
                    modulos[i] = Notas.modulos[i]; 
                }
            }
        }
        System.out.print(persona  + " aprueba los modulos : ");
        return modulos;
    }

    public static boolean quienPromociona(){  
        //Devuelve un array de personas.
        boolean aprueba = true; //sup que aprueba --> bandera
        int Iper = getIndexPersona();
        if (Iper != -1){
            for (int j=0; (j<MODULOS && aprueba ); j++){
                if (Notas.notas[Iper][j] < 5){ 
                    aprueba = false;
                }
            }
        }
        return aprueba;
    }

    public static int[] listadoSuspensos(){
        //Devuelve un array con el nº de personas a las que le han quedado 2, 4, 5, 6 y 8.
        int[] numSupensos = new int[ALUMNOS];
        for (int j=0; j<ALUMNOS; j++){
            numSupensos[j] = 0; //contados susp del alumno a 0
            for (int i=0; i<MODULOS; i++){
                if (Notas.notas[j][i] < 5){
                    numSupensos[j]++;
                }
            }
        }
        return numSupensos;
    }

    public static void moduloynotaMax(){

    }

    public static void personaynotaMax(){

    }

}