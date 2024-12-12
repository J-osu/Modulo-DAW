package josue.biblioteca;
import josue.biblioteca.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class Autor {
    private String nombre;
    private String apellidos;
    private String email;
    private int autorid;
    public static Scanner sc = new Scanner(System.in);
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public Autor(int id){
        this.setAutorId(id);
        this.PedirDatos();
    }

    public void PedirDatos(){
        System.out.println("Autor con id: "+this.getAutorId());
        System.out.println("Añade el nombre del nuevo autor: ");
        String nombre = sc.nextLine();
        this.setNombre(nombre);
        System.out.println("Añade los apellidos del nuevo autor: ");
        String apellidos = sc.nextLine();
        this.setApellidos(apellidos);
        System.out.println("Añade el email del nuevo autor: ");
        String email = sc.nextLine();
        this.setEmail(email);
    }

    public void setLibro(Libro libro){
        this.libros.add(libro);
    }
    public void setAutorId(int id){
        this.autorid = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getEmail() {
        return email;
    }
    public int getAutorId(){
        return this.autorid;
    }
    public String getGenerarNombreCompleto(){
        return this.getNombre()+" "+this.getApellidos();
    }
    public ArrayList<Libro> getLibro(){
        return this.libros;
    }

    public void MostrarDatos(){
        System.out.println("Autor: "+this.getNombre()+" "+this.getApellidos()+" "+this.getEmail());
    }
}
