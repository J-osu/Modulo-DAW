import java.util.Scanner;
public class Ejer24 {
    static Scanner sc = new Scanner(System.in);
    static String nombre;
    static int cargo;
    static int estado;
    static double dias;
    static double sueldo;
    static double sueldodietas;
    static double sueldobruto;
    static double neto;
    static double retencion;
    public static void main(String[] args) throws Exception { 
        //LLamamos a los metodos correspondientes.
        Ejer24.Datos();
        Ejer24.sueldobase();
        Ejer24.CalcularDietas();
        Ejer24.CalcularSueldoBruto();
        Ejer24.Calcularretencion();
        Ejer24.mostrarResultados();
    }
    public static void Datos(){
        //Pedimos los datos del empleado.
        System.out.print("introduce tu nombre: ");
        Ejer24.nombre = Ejer24.sc.nextLine();
        System.out.print("Introduce tu cargo en la empresa(1-junior, 2-senior o 3-jefe de proyecto): ");
        Ejer24.cargo = Ejer24.sc.nextInt();
        System.out.print("Itroduce los dias que hayas estado fuera: ");
        Ejer24.dias = Ejer24.sc.nextDouble();
        System.out.print("Introduce tu estado civil(1-soltero o 2-casado): ");
        Ejer24.estado = Ejer24.sc.nextInt();
    }
     public static void sueldobase(){
        //Calculamos el sueldo base en funcion de la opcion elegida.
        sueldo = 0;
        if (cargo==1) {
            sueldo = 950;
        } else if (cargo==2) {
            sueldo = 1200;
        } else if (cargo==3) {
            sueldo = 1600;
        }
     }
     public static void CalcularDietas(){
        //Se calcula el nº de dias por el pago por viaje.
       sueldodietas = dias * 30;
     }
     public static void CalcularSueldoBruto(){
        //Calculamos el sueldo bruto.
        sueldobruto = sueldo+sueldodietas;
     }
     public static void Calcularretencion(){
        //Calculamos la retencion y el precio neto.
        double irpf = 0;
        if (estado==1) {
            irpf = 0.25;
        } else if (estado==2) {
            irpf= 0.20;
        }
        retencion = sueldobruto*irpf;
        neto = sueldobruto-retencion;
     }
     public static void mostrarResultados() {
        //la tabla de la nomina con todos los datos solicitados.
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│Nombre: "+nombre+"                 │");
        System.out.println("│Sueldo base: "+sueldo +" euros    │");
        System.out.println("│Dietas: "+dias+" días "+sueldodietas+" euros│");
        System.out.println("│Sueldo bruto: "+sueldobruto+" euros   │");
        System.out.println("│Retención IRPF:  "+retencion+" euros │");
        System.out.println("│Sueldo neto: " + neto + " euros    │");
        System.out.print("└─────────────────────────────┘");
    }
}
