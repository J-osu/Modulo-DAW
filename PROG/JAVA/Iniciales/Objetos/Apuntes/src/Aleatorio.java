import java.util.Random; //importamos la utilieria random.
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
       Aleatorio.Ejer11();
    }
    public static void Clear(){
    //     System.out.println("");
    //     System.out.print("Desea continuar s/n: ");;
    //     char n = Mat.sc.next().toLowerCase().charAt(0);
    //     if (n == 's'){
    //         System.out.print("\033[H\033[2J");
    //         System.out.flush();
    //   }
    }

    public static void Ejer2(){
        //hacer un programa que nos devuelva
        //el total, recuento de J,K y Q y el maxymin que salga.
        String[] palos = { "pica", "corazones", "diamantes", "treboles"};
         //arrai que contiene los tipos de cartas.
        String[] valores = { "A", "2","3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K"};
        //arrai que contiene los valores de las cartas.
        int totalcartas = 0; //Contamos el total de cartas.
        int recuentofiguras = 0; //Contamos el recuento de cartas especiales.
        int valorMax = Integer.MIN_VALUE; //Contamos el valor amaximo.
        int valorMin = Integer.MAX_VALUE; //Contamos el valor minimo.
        boolean continuar = true;
        while (continuar) {
            String palosselect = palos[random.nextInt(palos.length)];
            //seleccionamos un palo de manera random de la arrai.
            String valorselect = valores[random.nextInt(valores.length)];
            //seleccionamos un valor de manera random de la arrai.
            System.out.print("Haz seleccionado la carta -> " + valorselect + " de " + palosselect);
            totalcartas ++; //el total de cartas incrementa en funcion de las veces que se generen.
            if (valorselect.equals("J") || valorselect.equals("Q") || valorselect.equals("K")) {
                recuentofiguras ++; //el numero de las figuras aumenta cada vez que se repite.
            }
            int valornum; //Establecemos un valor condicional a las cartas especiales.
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
            //Preguntamos para una siguiente tirada.
            System.out.print("¿Desea continuar generando cartas antes de mostrar los resultados(s/n)? ");
            char respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta != 's') {
                continuar = false;
            }
        }
        System.out.println("\nResultados:");
        //Mostramos los resultados al finalizar.
        System.out.println("Total de cartas seleccionadas: " + totalcartas); //cuenta todas las cartas sacadas.
        System.out.println("Conteo de cartas J, Q y K: " + recuentofiguras); //recuento de veces que ha salido las especiales.
        System.out.println("Valor mínimo obtenido: " + valorMin);
        System.out.println("Valor máximo obtenido: " + valorMax);
    }

    public static void Ejer5(){
        int sumanumero = 0; //guarda los numeros para sumarlos.
        int valorMax = Integer.MIN_VALUE; //Contamos el valor maximo.
        int valorMin = Integer.MAX_VALUE; //Contamos el valor minimo.
        for (int i = 1; i <= 50 ; i++){
            int numero = 100 + random.nextInt(100 + 1); //con esto incluye los valores 100 y 199.
            System.out.print(numero + " ");
            sumanumero += numero; 
            if (numero > valorMax) {
                valorMax = numero;
            }
            if (numero < valorMin) {
                valorMin = numero;
            }
        }
        double media = (double) sumanumero / 50; //realiza la media de todos los numeros sumados.
        System.out.println("\n\nResultados generados:"); //muestra los resultados.
        System.out.println("Máximo: " + valorMax);
        System.out.println("Mínimo: " + valorMin);
        System.out.println("Media: " + media);
    }

    public static void Ejer6(){
        System.out.println("Puedes adivinar el numero que tengo en mis datos?"); //retamos al usuario.
        int secretonumero = random.nextInt(101); //seleccionamos un numero random entre 0 y 100.
        int chances = 5; //establecemos el numero de intentos.
        while (chances > 0) {
            System.out.print("Introduce un numero entre 0-100: ");
            int numeroprobado = Aleatorio.sc.nextInt();
            chances --; //el contador de intentos disminuye.
            if (secretonumero == numeroprobado) {
                System.out.println("Diste en el clavo ^^"); //una respuesta en caso de acertar.
            } else if (secretonumero > numeroprobado) {
                System.out.println("Es un numero mayor, te quedan " + chances + " intentos.");
            } else {
                System.out.println("Es un numero mas pequeño, te quedan " + chances + " intentos.");
            }
            if (chances == 0) {
                System.out.println("A tu casa manco, que te has quedado sin intentos.");
                //una respuesta en caso de perder los intentos.
            }
        }
    }

    public static void Ejer7(){
        System.out.println("Algo");
    }
    
    public static void Ejer9(){
        int contador = 0;
        int numero;
        System.out.println("Generandor de números aleatorios pares entre 0 y 100 hasta obtener el 24");
        do {
            numero = random.nextInt(51) * 2; // Genera un número par entre 0 y 100 al miltiplicar 50 por 2.
            System.out.print(numero + " ");
            contador++; // incrementamos el contador de los números generados
        } while (numero != 24);
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
            int nota = random.nextInt(11); // Genera un número aleatorio entre 0 y 10
            // Se asigna una calificación basada en la nota y se actualiza el contador.
            if (nota < 5) {
                System.out.print("Suspenso ");
                suspensos++;
            } else if (nota == 5) {
                System.out.print("Suficiente ");
                suficientes++;
            } else if (nota <= 6) {
                System.out.print("Bien ");
                bienes++;
            } else if (nota <= 8) {
                System.out.print("Notable ");
                notables++;
            } else {
                System.out.print("Sobresaliente ");
                sobresalientes++;
            }
        }
        System.out.println("\n\nAqui tienes un resumen y recuento total:"); //imprimimos el resultado.
        System.out.println("Suspensos: " + suspensos + " Suficientes: " + suficientes);
        System.out.println("Bienes: " + bienes + " Notables: " + notables + " Sobresalientes: " + sobresalientes);
    }
}

