package ejercicios;
import java.util.Scanner;
public class Nota{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{ 
        Nota.Modulo();
     }

    /*Un alumno quiere saber si tiene aprobado
    el modulo de Ana, para ello deberá de intro-
    ducir sus 3 notas de los 3 trimestres y obtener el resultado.*/
    public static void Modulo(){
        char respuesta;
        boolean continuar = true;
        System.out.print("Introduce tu nombre: ");
        String nombre = Nota.sc.nextLine();
        while (continuar) {
            System.out.print("Introduce el modulo: ");
            String modulo = Nota.sc.nextLine();
            System.out.print("Introduce la nota obtenida: ");
            double nota = Nota.sc.nextDouble();
            if (nota>=0 && nota<5) {
                System.out.print(nombre+" tiene un "+nota+" en "+modulo+" lo cual quiere decir que esta suspenso.");
            } else if (nota>=5 && nota<7) {
                System.out.print(nombre+" tiene un "+nota+" en "+modulo+" lo cual quiere decir que esta aprobad.");
            } else if (nota>=6 && nota<8) {
                System.out.print(nombre+" tiene un "+nota+" en "+modulo+" lo cual quiere decir que esta bien.");
            } else if (nota>=8 && nota<9) {
                System.out.print(nombre+" tiene un "+nota+" en "+modulo+" lo cual quiere decir que esta notable.");
            } else if (nota>=9 && nota==10) {
                System.out.print(nombre+" tiene un "+nota+" en "+modulo+" lo cual quiere decir que esta sobresaliente.\n");
            } else if(nota>10){
                System.out.println("Error, vuelbe a introducir la nota"); }
            
            System.out.println("Desea volver a introducir los datos S/N?: ");
            respuesta = Nota.sc.next().toUpperCase().charAt(0);
            if (respuesta == 'N')
                continuar = false;
        }
    }

}
