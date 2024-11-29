package pod.consesionario;

public class Moto {
    private int nruedas;
    private String tipo;

    public void setNruedas(int ruedas){
        this.nruedas = ruedas;
    }

    public void setTipo(String tipo){
        this.tipo = tipo.toUpperCase();
    }

    public int getNruedas(){
        return this.nruedas;
    }

    public String getTipo(){
        return this.tipo.toLowerCase();
    }

    public void Inf(){
        System.out.println("Vehiculo: " + this.getNruedas() + " " + getTipo());
    }

    public String toString(){
        String info;
        info = " Vehiculo: " + this.getNruedas() + " " + this.getTipo();
        return info;
    }
}
