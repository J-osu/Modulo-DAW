import java.util.Scanner;

public class Empleado {
    protected Scanner sc = new Scanner(System.in);
    protected String DNI;
    protected String nombre;
    protected String email;
    protected double salarioBase = 1000;
    protected int horasExtra;
    protected double precioHoraExtra = 10;

    public Empleado(){
        pedirDatos();
        calcularSueldo();
    }

    public Empleado(String DNI, String nombre){
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public void pedirDatos(){
        System.out.println("DNI: ");
        DNI = sc.nextLine();
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Horas extra: ");
        horasExtra = sc.nextInt();
        sc.nextLine();
    }

    public double calcularSueldo(){
        return salarioBase+(precioHoraExtra*horasExtra);
    }
    
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setHorasExtra(int horasExtra){
        this.horasExtra = horasExtra;
    }
    public String getDNI(){
        return DNI;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEmail(){
        return email;
    }
    public int getHorasExtra(){
        return horasExtra;
    }

    public String toString(){
        return "Empleado: " + this.getNombre() + " con DNI " + this.getDNI() + " tiene un salario de " + this.calcularSueldo() + "€";
    }
    
}
