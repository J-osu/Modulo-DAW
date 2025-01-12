package pod.biblioteca;

public class Autor {
    public int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;

    //=================== Constructor =======================

    public Autor( String nombre, String apellido1, String apellido2, String email ) {
        this.id = GenID();
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
    }

    //================= Métodos funcionales ================

    public int GenID(){
        int digito =(int)(Math.random()*10000000);
        return digito;
    }
    public String getNombreCita() {
        return this.apellido1 + " " + this.apellido2 + ", " + this.nombre;
    }

    //================== Setters/Getters ===================

    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre.toUpperCase();
    }
    public void setApellido1(String apellido1){
        this.apellido1 = apellido1.toUpperCase();
    }
    public void setApellido2(String apellido2){
        this.apellido2 = apellido2.toUpperCase();
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre.toLowerCase();
    }
    public String getApellido1(){
        return this.apellido1.toLowerCase();
    }
    public String getApellido2(){
        return this.apellido2.toLowerCase();
    }
    public String getEmail(){
        return this.email;
    }

    //==================== Informacion Mostrada ===================

    public String toString(){
        String info;
        info = "ID: " + this.getId() + " " + this.getNombreCita();
        return info;
    }
}
