package pod.biblioteca;
import java.util.Scanner;
import java.util.ArrayList; 

public class Biblioteca {
    static Scanner sc = new Scanner(System.in);
    static int NAUTORES = 1;
    static int NLIBROS = 1;
    static Autor[] autor = new Autor[NAUTORES];
    static ArrayList<String> listaAutores = new ArrayList<>();
    static Libro[] libro = new Libro[NLIBROS];
    static ArrayList<String> listaLibros = new ArrayList<>();
    public static void main(String[] args) {
        Biblioteca.menuLibro();
        Biblioteca.ImprimirAutores();
    }

    public static void AddAutores(){
        String nombre; String apellido1; String apellido2, email;
        for(int i=0; i<NAUTORES; i++){
            System.out.print("Nombre autor " + (i+1) + " : ");
            nombre = sc.next();
            System.out.print("Apellido1 del autor " + (i+1) + " : ");
            apellido1 = sc.next();
            System.out.print("Apellido2 del autor " + (i+1) + " : ");
            apellido2 = sc.next();
            System.out.print("Email del autor " + (i+1) + " : ");
            email = sc.next();
            autor[i] = new Autor(nombre, apellido1, apellido2, email);
        }
    }

    

    public static void ImprimirAutores(){
        for(int i=0; i<NAUTORES; i++){
            System.out.println(autor[i]);
        }
    }
    public static void ImprimirLibros() {
        System.out.println("Lista de libros:");
        for (int i = 0; i < NLIBROS; i++) {
            System.out.println(libro[i]);
        }
    }

    public static void menuLibro(){
        System.out.println("Menú de libros:");
        System.out.println("==========================");
        System.out.println("1- Añadir autores.");
        System.out.println("2- Añadir libro.");
        System.out.println("3- Listar libros.");
        System.out.println("4- Prestar libro.");
        System.out.println("5- Devolver libro.");
        System.out.println("6- Salir.");
        System.out.println("==========================");
        System.out.println("Ingrese la opción: ");
        System.out.println("==========================");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            Biblioteca.AddAutores();
        }
        else if (opcion==2){
            // Biblioteca.AddLibros();
        }
    }
}
