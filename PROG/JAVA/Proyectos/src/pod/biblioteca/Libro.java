package pod.biblioteca;

public class Libro {
    private String codigo;
    private String titulo;
    private Autor autor;
    private int año;
    private boolean prestado;

    //=================== Constructor =======================

    public Libro(String codigo, String titulo, Autor autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.prestado = false;
    }

    //================= Métodos funcionales ================
    //================== Setters/Getters ===================

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getCodigo() {
        return this.codigo;
    }
    public Autor getAutor() {
        return this.autor;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public int getAño() {
        return this.año;
    }
    public boolean isPrestado() {
        return this.prestado;
    }

    //==================== Informacion Mostrada ===================
}
