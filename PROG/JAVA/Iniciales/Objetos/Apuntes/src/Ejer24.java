import java.util.Scanner;
public class Ejer24 {
    static Scanner sc = new Scanner(System.in);
    static String nombre;
    static double cargo;
    static double estado;
    static double dias;
    static double sueldo;
    static double sueldodietas;
    static double sueldobruto;
    static double neto;
    static double retencion;
    public static void main(String[] args) throws Exception { 
        Ejer24.Datos();
        Ejer24.sueldo();
        Ejer24.sueldobase();
        System.out.print("Nombre: "+nombre);
        System.out.print("Sueldo base: "+sueldo);
        System.out.print("Dietas: "+dias+" "+sueldodietas);
        System.out.print("Sueldo bruto: "+sueldobruto);
        System.out.print("IRPF: "+retencion);
        System.out.print("Netos: "+neto);
    }
    public static void Datos(){
        System.out.print("introduce tu nombre: ");
        Ejer24.nombre = Ejer24.sc.nextLine();
        System.out.print("Introduce tu cargo en la empresa(1-junior, 2-senior o 3-jefe de proyecto): ");
        Ejer24.cargo = Ejer24.sc.nextDouble();
        System.out.print("Itroduce los dias que hayas estado fuera: ");
        Ejer24.dias = Ejer24.sc.nextDouble();
        System.out.print("Introduce tu estado civil(1-soltero o 2-casado): ");
        Ejer24.estado = Ejer24.sc.nextDouble();
    }
     public static void sueldobase(){
        Ejer24.Datos();
        double sueldo = 0;
        if (cargo==1) {
            sueldo = 950;
        } else if (cargo==2) {
            sueldo = 1200;
        } else if (cargo==3) {
            sueldo = 1600;
        }
     }
     public static void retencion(){
        Ejer24.Datos();
        double irpf = 0;
        if (estado==1) {
            irpf = 0.25;
        } else if (estado==2) {
            irpf= 0.20;
        }
        double retencion = sueldobruto*irpf;
     }
     public static void sueldo(){
        double sueldobruto = sueldo+sueldodietas;
        double sueldodietas = dias * 30;
        double neto = sueldobruto-retencion;
     }
     
}
