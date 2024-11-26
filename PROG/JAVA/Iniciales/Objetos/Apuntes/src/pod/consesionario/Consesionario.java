package pod.consesionario;
import java.util.Scanner;

public class Consesionario {
    static int NVEHICULOS = 2;
    static Scanner sc = new Scanner(System.in);
    static Vehiculo[] vehiculos = new Vehiculo[NVEHICULOS];
    public static void main (String[] args){
        Consesionario.LecturaVehiculos();
        Consesionario.ImprimirVehiculos();
        Consesionario.kmTotalesFlota();
    }

    public static void kmTotalesFlota(){
        double suma = 0;
        for(int i=0; i<NVEHICULOS; i++){
            System.out.println("v" + (i+1) + ": " + vehiculos[i]);
            suma += vehiculos[i].kmTotales;
        }
        System.out.println("km Flota : "+ suma);
    }

    public static void ImprimirVehiculos(){
        for(int i=0; i<NVEHICULOS; i++){
            System.out.println(vehiculos[i]);
        }
    }

    public static void LecturaVehiculos(){
        String marca, modelo; int velocidad;
        for(int i=0; i<NVEHICULOS; i++){
            System.out.print("Marca vehiculos " + (i+1) + " : ");
            marca = sc.next();
            System.out.print("Modelo vehiculos " + (i+1) + " : ");
            modelo = sc.next();
            System.out.print("Velocidad vehiculos " + (i+1) + " : ");
            velocidad = sc.nextInt();
            vehiculos[i] = new Vehiculo(marca, modelo, velocidad);
            System.out.println();
            vehiculos[i] = new Vehiculo(marca, modelo, velocidad);
            vehiculos[i].generarKmSemana();
        }
    }
}
