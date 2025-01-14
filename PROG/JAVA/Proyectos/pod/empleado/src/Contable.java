import java.util.Scanner;

public class Contable extends Empleado{
    static Scanner sc = new Scanner(System.in);
    private double plusSalario = 200;
    
    public Contable(String DNI, String nombre){
        super(DNI, nombre);
    }

    public double calcularSueldo(){
        return super.calcularSueldo() + plusSalario;
    }

    public void contabilizar(){
        System.out.println("Estoy contabilizando facturas.");
    }
}
