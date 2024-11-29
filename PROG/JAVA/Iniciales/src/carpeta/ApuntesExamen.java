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
    static double[][] notas = new double[PERSONAS][MODULOS];
    static double max, min, media;
    static int Pmax, Pmin;
    public static void main(String[] args) throws Exception {

    }

    public static void entradaDatos(){
        String entrada;
        System.out.print("Introduce los datos solicitados: ");
        for (int i = 0; i<ApuntesExamen.CIUDADES; i++) {
            do {
                System.out.print("Nombre de la ciudad " + (i + 1) + ": ");
                entrada = ApuntesExamen.sc.nextLine().trim(); // ".trim" elimina espacios en blanco
                if (entrada.isEmpty()) // ".isEmpty" verifica que la cadena String no este vacio.
                {
                    System.out.println("El nombre de la ciudad no puede estar vacío. Inténtalo de nuevo.");
                }
            } while (entrada.isEmpty()); // Repite mientras la entrada sea inválida
            ApuntesExamen.ciudades[i] = entrada;
        }
        for  ( int i = 0; i<ApuntesExamen.PERSONAS; i++){
            do {
                System.out.print("Nombre de las personas " + (i + 1) + ": ");
                entrada = ApuntesExamen.sc.nextLine().trim();
                if (entrada.isEmpty()){
                    System.out.println("El nombre de la persona no puede estar vacío. Inténtalo de nuevo.");
                }
            } while (entrada.isEmpty());
            ApuntesExamen.personas[i] = ApuntesExamen.sc.next();
        }
        for  ( int i = 0; i<ApuntesExamen.MODULOS; i++){
            do {
                System.out.print("Nombre de los modulos" + (i + 1) + ": ");
                entrada = ApuntesExamen.sc.nextLine().trim();
                if (entrada.isEmpty()){
                    System.out.println("El nombre del modulo no puede estar vacío. Inténtalo de nuevo.");
                }
            } while (entrada.isEmpty());
            ApuntesExamen.modulos[i] = ApuntesExamen.sc.next();
        }
    }

    public static void ciudadesTempRandom(){
        //Genera temperaturas de manera aleatoria para las ciudades.
        for (int i = 0; i < CIUDADES; i++) {
            double temp = (Math.random() * 20) + 20;
            temp = Math.round(temp * 10.0) / 10.0;
            tempperaturas[i] = temp;
        }
    }

    public static void calcularEstadisticas() {
        double max = tempperaturas[0], min = tempperaturas[0], media = 0;
        int Pmax = 0, Pmin = 0;
        for (int i = 0; i < CIUDADES; i++) {
            media += tempperaturas[i];
            if (tempperaturas[i] > max) {
                max = tempperaturas[i];
                Pmax = i;
            }
            if (tempperaturas[i] < min) {
                min = tempperaturas[i];
                Pmin = i;
            }
        }
        media /= CIUDADES;
        System.out.println("Temperatura máxima: " + max + "°C en " + ciudades[Pmax]);
        System.out.println("Temperatura mínima: " + min + "°C en " + ciudades[Pmin]);
        System.out.println("Temperatura media: " + media + "°C");
    }

    public static void GenerarNotas(){
        //Se recorre ALUMNOS.
        for (int i=0; i<PERSONAS; i++){
            for (int j=0; j<MODULOS; j++){
                //Se generan 4 notas aleatorias
                //para cada fila, con un total de 5 filas y 4 numeros en ellas.
                ApuntesExamen.notas[i][j]=(int)(Math.random()*10);
            }
        }
    }

    public static void cursosPersona(){
        //Genrea una tabla con los modulos que cursa cada persona.
        System.out.println("------ LISTADO DE NOTAS --------------");
        System.out.printf("%-22s", "");
        for (int i=0; i<PERSONAS; i++){
            System.out.printf("%-20s", personas[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < MODULOS; i++) {
            System.out.printf("%-22s", modulos[i] + "   ");
            for (int j = 0; j < PERSONAS; j++) {
                System.out.printf("%-20s", notas[j][i] + "        ");
            }
            System.out.println();
        }
    }

    public static void ordenarCiudadesManual() {
        System.out.println("\nCiudades antes de ordenar:");
        imprimirArreglo(ciudades);
        for (int i = 0; i<CIUDADES - 1; i++) {
            for (int j = 0; j<CIUDADES  - i - 1; j++) {
                if (ciudades[j].compareTo(ciudades[j + 1]) > 0) {
                    String temp = ciudades[j];
                    ciudades[j] = ciudades[j + 1];
                    ciudades[j + 1] = temp;
                }
            }
        }
        System.out.println("\nCiudades después de ordenar:");
        imprimirArreglo(ciudades);
    }

    public static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.println(elemento);
        }
    }
}