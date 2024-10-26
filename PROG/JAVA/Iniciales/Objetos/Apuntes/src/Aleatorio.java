import java.util.Random;
import java.util.Scanner;
public class Aleatorio{
    public static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) throws Exception{
       Aleatorio.Ejer5();
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
        System.out.println("Total de cartas seleccionadas: " + totalcartas);
        System.out.println("Conteo de cartas J, Q y K: " + recuentofiguras);
        System.out.println("Valor mínimo obtenido: " + valorMin);
        System.out.println("Valor máximo obtenido: " + valorMax);
    }

    public static void Ejer5(){
        int sumanumero = 0;
        int valorMax = Integer.MIN_VALUE; //Contamos el valor maximo.
        int valorMin = Integer.MAX_VALUE; //Contamos el valor minimo.
        for (int i = 1; i <= 50 ; i++){
            int numero = 100 + random.nextInt(100 + 1);
            System.out.print(numero + " ");
            sumanumero += numero; //guarda los numeros para sumarlos.
            if (numero > valorMax) {
                valorMax = numero;
            }
            if (numero < valorMin) {
                valorMin = numero;
            }
        }
        double media = (double) sumanumero / 50; //realiza la media de todos los numeros sumados.
        System.out.println("\n\nResultados:"); //muestra los resultados.
        System.out.println("Máximo: " + valorMax);
        System.out.println("Mínimo: " + valorMin);
        System.out.println("Media: " + media);
    }

    public static void Ejer6(){
        System.out.println("algo");
    }

    public static void Ejer7(){
        System.out.println("Algo");
    }
    
    public static void Ejer8(){
        System.out.println("no");
    }
}

