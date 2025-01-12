package pod.biblioteca;

public class Libro {
    private String codigo;
    private String titulo;
    private Autor autor;
    private int año;
    private boolean prestado;

    //=================== Constructor =======================
    public Libro(String titulo, Autor autor, int año) {
        this.codigo = Utilidades.generarCodigoLibro(autor);
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.prestado = false;
    }

    //================= Métodos funcionales ================
    public boolean prestar() {
        if (!prestado) {
            prestado = true;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (prestado) {
            prestado = false;
            return true;
        }
        return false;
    }

    //================= Getters ============================

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
        this.codigo = Utilidades.generarCodigoLibro(autor);
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

    public String getTitulo() {
        return this.titulo;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public int getAño() {
        return this.año;
    }

    public boolean isPrestado() {
        return this.prestado;
    }

    //==================== Información Mostrada ===================

    public String toString() {
        return "Código: " + this.getCodigo()+
               "\nTítulo: " + this.getTitulo() +
               "\nAutor: " + this.getAutor() +
               "\nAño: " + this.getAño() +
               "\nEstado: " + (prestado ? "Prestado" : "Disponible");
    }
}
