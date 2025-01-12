package pod.biblioteca;
import java.util.Scanner;
import java.util.ArrayList; 

public class Biblioteca {
    static Scanner sc = new Scanner(System.in);
    static int NAUTORES = 1;
    static int NLIBROS = 1;
    static ArrayList<Autor> listaAutores = new ArrayList<>();
    static ArrayList<Libro> listaLibros = new ArrayList<>();
    public static void main(String[] args) {
        Biblioteca.menuLibro();
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
            listaAutores.add(new Autor (nombre, apellido1, apellido2, email));
        }
    }

    public static void ListarAutores(){
        System.out.println("Lista de autores:");
        for (int i = 0; i < listaAutores.size(); i++) {
            System.out.println((i + 1) + ". " + listaAutores.get(i));
        }
    }

    public static void AddLibros(){
        String titulo =""; int año; int autorID;
        for (int i = 0; i < NLIBROS; i++) {
            System.out.print("Título del libro " + (i + 1) + ": ");
            titulo = sc.nextLine();
            System.out.print("Año de publicación del libro " + (i + 1) + ": ");
            año = sc.nextInt();
            sc.nextLine();
            System.out.println("Seleccione el autor del libro:");
            ListarAutores();
            System.out.print("Ingrese el ID del autor para el libro " + (i + 1) + ": ");
            autorID = sc.nextInt() - 1;
            sc.nextLine();

            if (autorID >= 0 && autorID < listaAutores.size()) {
                Autor autorSeleccionado = listaAutores.get(autorID);
                listaLibros.add(new Libro(titulo, autorSeleccionado, año));
                System.out.println("Libro añadido con éxito.\n");
            } else {
                System.out.println("Selección inválida. No se pudo añadir el libro.");
            }
        }
    }

    public static void ListarLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        System.out.println("Lista de libros:");
        for (int i = 0; i < listaLibros.size(); i++) {
            System.out.println((i + 1) + ". " + listaLibros.get(i));
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
            Biblioteca.AddLibros();
        }
        else if (opcion==3){
            Biblioteca.ListarAutores();
        }
        else if (opcion==4){
            Biblioteca.ListarLibros();
        }
    }
}
