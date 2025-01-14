import java.util.Scanner;

public class Director extends Empleado{
    private Scanner sc = new Scanner(System.in);
    private int numDespacho;
    private double plusSalario = 400;
    
    public Director(String DNI, String nombre){
        super(DNI, nombre);
        System.out.println("Introduce el número de despacho: ");
        this.numDespacho = sc.nextInt();
        this.precioHoraExtra = 20;
    }

    public double calcularSueldo(){
        return super.calcularSueldo() + plusSalario;
    }

    public void analizarDatos(){
        System.out.println("Estoy analizando muchos datos.");
    }

    
}
