package bucles;
import java.util.Scanner;
public class Prueba1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception { 
        // Prueba1.numerdo10();
        // Prueba1.numeroN();
        
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

}
