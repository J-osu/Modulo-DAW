package josue.biblioteca;
import josue.biblioteca.Autor;
import josue.biblioteca.Libro;
import java.util.ArrayList;
import java.util.Scanner;


public final class Biblioteca {
    public static String nombre ;
    public static ArrayList<Autor> LAutores = new ArrayList<>();
    public static ArrayList<Libro> LLibros = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Biblioteca.añadirAutores();
        Biblioteca.ListarAutores();
        Biblioteca.añadirLibros();
        Biblioteca.ListarLibros();
    }

    public static void añadirAutores(){
        int i=1;
        while (i<=2) {
            Autor autor = new Autor(i);
            Biblioteca.LAutores.add(autor);
            i++;
        }
    }
    public static void ListarAutores(){
        for (Autor autor : Biblioteca.LAutores) {
            autor.MostrarDatos();
        }
    }
    public static void añadirLibros(){
        int i=1;
        while (i<=2) {
            Libro libro = new Libro(i);
            System.out.println("Autor del libro: ");
            int nif = Biblioteca.sc.nextInt();
            Autor autor = Biblioteca.buscarAutor(nif);
            libro.setAutor(autor);
            autor.setLibro(libro);
            Biblioteca.LLibros.add(libro);
            i++;
        }
    }
    public static void ListarLibros(){
        for (Libro libro : Biblioteca.LLibros) {
            libro.mostrardatos();
        }
    }
    public static Autor buscarAutor(int codigo){
        Autor autorEncontrado = null;
        for(Autor autor:Biblioteca.LAutores){
            if(autor.getAutorId()==codigo){
                autorEncontrado = autor;
            }
        }
        return autorEncontrado;
    }
    public static void librosAutor1(int nif){
        //sin libros en Autor (relacion inversa)
        for (Libro libro : Biblioteca.LLibros) {
            if (libro.getAutor().getAutorId() == nif) {
                libro.mostrardatos();
            }
        }
    }
    public static void librosAutor(int nif){
        //con libros en Autor( es relacion inversa)
        Autor autor = Biblioteca.buscarAutor(nif);
        for(Libro libro: autor.getLibro()){
            libro.mostrardatos();
        }
    }
}
