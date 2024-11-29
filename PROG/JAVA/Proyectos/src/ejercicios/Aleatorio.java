package ejercicios;
import java.util.Random; //Importamos la utilieria random.
import java.util.Scanner;
public class Aleatorio{
    public static Scanner sc = new Scanner(System.in);
    static Random random = new Random(); //creamos un objeto que genere valores aleatorios.
    public static void main(String[] args) throws Exception{
        //llamamos a la funcion correspondiente.
        Aleatorio.Ejer2();
        Aleatorio.Clear();
        Aleatorio.Ejer5();
        Aleatorio.Clear();
        Aleatorio.Ejer6();
        Aleatorio.Clear();
        Aleatorio.Ejer7();
        Aleatorio.Clear();
        Aleatorio.Ejer9();
        Aleatorio.Clear();
        Aleatorio.Ejer11();
        Aleatorio.Clear();
        Aleatorio.Ejer12();
    }
    public static void Clear(){
        System.out.println("");
        System.out.print("Desea continuar s/n: ");;
        char n = Mat.sc.next().toLowerCase().charAt(0);
        if (n == 's'){
            System.out.print("\033[H\033[2J");
            System.out.flush();
      }
    }

    public static void Ejer2(){
        //Hacer un programa que nos devuelva
        //El total, recuento de J,K y Q y el maxymin que salga.
        String[] palos = { "pica", "corazones", "diamantes", "treboles"};
         //Arrai que contiene los tipos de cartas.
        String[] valores = { "A", "2","3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K"};
        //Arrai que contiene los valores de las cartas.
        int totalcartas = 0; //Cuento el total de cartas.
        int recuentofiguras = 0; //Cuento el recuento de cartas especiales.
        int valorMax = Integer.MIN_VALUE; //MIN.VALUE otorga un valor pequeño y lo sustituye por el primero que sea mayor.
        int valorMin = Integer.MAX_VALUE; //MAX.VALUE otorga un valor grande y lo sustituye por el primero que sea menor.
        boolean continuar = true;
        while (continuar) {
            String palosselect = palos[random.nextInt(palos.length)];
            //Selecciono un palo de manera random de la arrai.
            String valorselect = valores[random.nextInt(valores.length)];
            //Selecciono un valor de manera random de la arrai.
            System.out.print("Haz seleccionado la carta -> " + valorselect + " de " + palosselect);
            totalcartas ++; //El total de cartas incrementa en funcion de las veces que se generen.
            if (valorselect.equals("J") || valorselect.equals("Q") || valorselect.equals("K")) {
                recuentofiguras ++; //El numero de las figuras aumenta cada vez que se repite.
            }
            int valornum; //Establesco un valor condicional a las cartas especiales.
            if (valorselect.equals("A")) {
                valornum = 1;
            } else if (valorselect.equals("J")) {
                valornum = 11;
            } else if (valorselect.equals("Q")) {
                valornum = 12;
            } else if (valorselect.equals("K")) {
                valornum = 13;
            } else {
                valornum = Integer.parseInt(valorselect);
            }
            if (valornum < valorMin) {
                valorMin = valornum;
            }
            if (valornum > valorMax) {
                valorMax = valornum;
            }
            System.out.println();
            //le pregunto para una siguiente tirada.
            System.out.print("¿Desea continuar generando cartas antes de mostrar los resultados(s/n)? ");
            char respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta != 's') {
                continuar = false;
            }
        }
        System.out.println("\nToma tus resultados:");
        //Contamos las cartas especiales, el total de cartas sacadas Y la carta de mayor y menor valor.
        System.out.println("Total de cartas tiradas: " + totalcartas + " Conteo de cartas especiales J, Q y K: " + recuentofiguras + " que es una ");
        System.out.println("Valor mínimo obtenido: " + valorMin + " Valor máximo obtenido: " + valorMax);
    }

    public static void Ejer5(){
        int sumanumero = 0; //Guarda los numeros para sumarlos.
        int valorMax = Integer.MIN_VALUE; //Contamos el valor maximo.
        int valorMin = Integer.MAX_VALUE; //Contamos el valor minimo.
        for (int i = 1; i <= 50 ; i++){
            int numero = 100 + random.nextInt(100 + 1); //Con esto incluye los valores 100 y 199.
            System.out.print(numero + " ");
            sumanumero += numero; 
            if (numero > valorMax) {
                valorMax = numero;
            }
            if (numero < valorMin) {
                valorMin = numero;
            }
        }
        double media = (double) sumanumero / 50; //Realiza la media de todos los numeros sumados.
        System.out.println("\n\nAqui estan los resultados generados:"); //Muestra los resultados.
        System.out.println("Máximo: " + valorMax + " Mínimo: " + valorMin);
        System.out.println("Media: " + media);
    }

    public static void Ejer6(){
        System.out.println("A que no adivinas el numero que tengo entre manos, eh bobo?"); //Retamos al usuario.
        int secretonumero = random.nextInt(101); //seleccionamos un numero random entre 0 y 100.
        int chances = 5; //Establecemos el numero de intentos.
        while (chances > 0) {
            System.out.print("Introduce un numero entre 0-100: ");
            int numeroprobado = Aleatorio.sc.nextInt();
            chances --; //el contador de intentos disminuye.
            if (secretonumero == numeroprobado) {
                System.out.println("Diste en el clavo ^^"); //Una respuesta en caso de acertar.
            } else if (secretonumero > numeroprobado) {
                System.out.println("Es un numero mayor que " + numeroprobado + " te quedan " + chances + " intentos.");
            } else {
                System.out.println("Es un numero mas pequeño que " + numeroprobado + " te quedan " + chances + " intentos.");
            }
            if (chances == 0) {
                System.out.println("\nA tu casa manco, que te has quedado sin intentos.");
                //una respuesta en caso de perder los intentos.
            }
        }
    }

    public static void Ejer7(){
        System.out.println("Hazte rico con La Quiniela:");
        System.out.println("Partido\t Columna 1\t Columna 2\t Columna 3");
        //Generamos apuestas para los 14 partidos.
        for (int i = 1; i <= 14; i++) {
            System.out.printf("%2d:\t", i);
            for (int j = 1; j <= 3; j++) {
                System.out.print(generaApuesta(random) + "\t\t"); //\t es para la tabulación en horizontal.
            }
            System.out.println();
        }
        System.out.print("\nLínea 15:\t"); //Generamos el pleno al quince
        for (int j = 1; j <= 3; j++) {
            System.out.print(generaApuesta(random) + "\t\t");
        }
        System.out.println();
    }
    public static String generaApuesta(Random random) {
        int resultado = random.nextInt(3); //Generamos un número aleatorio entre 0 y 2
        return switch (resultado) {
            case 0 -> "1";  //Gana local.
            case 1 -> "empate";  //Empate.
            case 2 -> "2";  //Gana visitante.
            default -> "";  //Lo pongo para evitar advertencias en amarillo.
        };
    }
    
    public static void Ejer9(){
        int contador = 0;
        int numero;
        System.out.println("Generandor de números aleatorios pares entre 0 y 100 hasta obtener el 24");
        do {
            numero = random.nextInt(51) * 2; // Genera un número par entre 0 y 100 al miltiplicar 50 por 2.
            System.out.print(numero + " ");
            contador++; // Incrementa el contador de los números generados
        } while (numero != 24); //una vez que salga el 24 se detiene.
        System.out.println("\n\nCantidad de números generados: " + contador);
    }

    public static void Ejer11(){
        int suspensos = 0;
        int suficientes = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalientes = 0;
        System.out.println("Aqui tienes las 20 notas de la clase:");
        for (int i = 0; i < 20; i++) {
            double nota = random.nextInt(11); // Genera un número aleatorio entre 0 y 10
            // Se asigna una calificación basada en la nota y se actualiza el contador.
            if (nota < 5) {
                System.out.print(nota);
                suspensos++;
            } else if (nota == 5) {
                System.out.print(nota);
                suficientes++;
            } else if (nota <= 6) {
                System.out.print(nota);
                bienes++;
            } else if (nota <= 8) {
                System.out.print(nota);
                notables++;
            } else if (nota == 10) {
                System.out.print(nota);
                sobresalientes++;
            }
        }
        System.out.println("\n\nAqui tienes un resumen y recuento total:"); //Imprime el resultado.
        System.out.println("Suspensos: " + suspensos + " Suficientes: " + suficientes + " Bienes: " + bienes);
        System.out.println(" Notables: " + notables + " Sobresalientes: " + sobresalientes);
    }

    public static void Ejer12() throws InterruptedException{
        while (true) {
            char caracter = (char) (random.nextInt(95)+32); // Genera un número aleatorio entre 32 y 126 y lo convierte en un carácter.
            System.out.print(caracter); //Imprime los carácteres en pantalla.
            Thread.sleep(1);
        }
    }
}

