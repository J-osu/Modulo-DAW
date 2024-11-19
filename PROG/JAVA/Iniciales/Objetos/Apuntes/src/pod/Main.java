package pod;
import pod.Vehiculo;
public class Main {
    public static void main (String[] args){
        Vehiculo v1 = new Vehiculo();
        v1.setMarca("Seat");
        v1.setModelo("A3");
        Vehiculo v2 = new Vehiculo();

        // System.out.println("Vehiculo: " + v1.getMarca() + " " + v1.getModelo());
        v1.Inf();
        System.out.println(v1);
    }
}
