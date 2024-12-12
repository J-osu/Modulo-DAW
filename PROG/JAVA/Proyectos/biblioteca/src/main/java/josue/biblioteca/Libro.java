package josue.biblioteca;
import java.util.Scanner;
import josue.biblioteca.Autor;

public class Libro {
    private int codigo;
    private String titulo;
    private Autor autor;
    private int año;
    private boolean prestado;

    public static Scanner sc = new Scanner(System.in);

    public Libro (int codigo){
        this.setCodigo(codigo);
        this.PedirDatos();
    }
    public void PedirDatos(){
        System.out.println("Libro con id: "+this.getCodigo());
        System.out.println("Añade el nombre del nuevo autor: ");
        String titulo = sc.nextLine();
        this.setTitulo(titulo);
        System.out.println("Añade el año: ");
        int año = sc.nextInt();
        this.setAño(año);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public Autor getAutor() {
        return this.autor;
    }
    public int getAño() {
        return this.año;
    }
    
    public void mostrardatos(){
        System.out.println("Libro: "+this.getCodigo()+" ( "+this.getTitulo()+" "+this.getAño()+") "+" Autor: "+this.autor.getGenerarNombreCompleto());
    }

}
