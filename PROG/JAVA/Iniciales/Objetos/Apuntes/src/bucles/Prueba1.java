package bucles;
import java.util.Scanner;
public class Prueba1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception { 
        // Prueba1.numerdo10();
        // Prueba1.numeroN();
        Prueba1.bizzbuss();
        
    }
    public static void Clear(){
        System.out.println("Desea continuar S/N?");
    }
    public static void numerdo10(){
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            }
    }
    public static void numeroN(int n){
        System.out.println("Introduce el valor de n: ");
        n = Prueba1.sc.nextInt();
        for (int i = 1; i < n ; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
    }
    public static int sumarN(int n){
        System.out.println("Introduce el valor de n: ");
        n = Prueba1.sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++){
            suma +=i;
        }
        return suma;
        
    }
    public static void bizzbuss(){
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        for (int i = 1; i<= num ; i++) {
            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive = i % 5 == 0;
                if (divisibleByThree && divisibleByFive) {
                    System.out.println("fizzbuzz");
                } else if (divisibleByThree) {
                    System.out.println("fizz");
                } else if (divisibleByFive) {
                    System.out.println("buzz");
                } else {
                    System.out.println(i);
                }
        }
    }

}
