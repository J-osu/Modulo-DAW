package pod.consesionario;

public class Camion {
    private int nejes;

    public void setNejes(int nejes){
        this.nejes = nejes;
    }

    public int getNejes(){
        return this.nejes;
    }
    
    public void Inf(){
        System.out.println("Vehiculo: " + this.getNejes());
    }

    public String toString(){
        String info;
        info = " Vehiculo: " + this.getNejes();
        return info;
    }
}
