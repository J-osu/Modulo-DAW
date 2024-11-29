package ejercicios;
import java.util.Scanner;
public class Mat{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        Mat.MaxMinTemperaturas();
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

    public static void prueba1(){
        //Metodos trigonimetricos.--->MATH
        // double valor = Math.sin(90);
        // System.out.println(valor);
        // System.out.println(Math.toRadians(12));
        // System.out.println(Math.sqrt(64));
        // System.out.println(Math.pow(2, 10));
        // System.out.println(Math.abs(-10));
        // System.out.println(Math.round(10.6));
    }

    public static void MaxMinNota(){
        // double nota = 0;
        // double max = 0;
        // double min = 0;
        // for(int i = 0; i<10; i++){
        //     nota = Math.random() *10;
        //     nota = Math.round(nota*100.0)/100.00;
        //     System.out.print(nota + " - ");
        // }
        // if (nota > max) {
        //     max = nota;
        // }
        // if (nota < min) {
        //     min = nota;
        // }
        // System.out.println();
        // System.out.println("Nota maxima -> " + max);
        // System.out.println("Nota minima -> " + min);
    }

    public static void random(){
        // double numero = 0;
        // for(int i = 0; i<=5; i++){
        //     numero = Math.random()*6+1;
        //     numero = Math.random()*60 + 1;
        //     System.out.print(numero+" -> ");
        //     System.out.print(Math.round(numero)+" -> ");
        //     System.out.print((int)numero + 30);
        //     System.out.println();
        //     double nota = Math.random() +10;
        //     nota = Math.round(nota*100.0)/100.00;
        //     System.out.println("nota -> " + nota);
        // }
    }

    public static void MaxMinTemperaturas(){
        double temp = 0;
        double max = 0;
        double min = 0;
        for(int i = 0; i<10; i++){
            temp = Math.random() *10;
            temp = Math.round(temp*100.0)/100.00;
            System.out.print(temp + " - ");
            if (i == 0) {
                max = temp;
                min = temp;
            } else{
                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Temperatura maxima -> " + max);
        System.out.println("Temperatura minima -> " + min);
    }
}
