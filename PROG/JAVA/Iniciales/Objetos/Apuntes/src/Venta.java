import java.util.Scanner;
public class Venta {
    static Scanner sc = new Scanner(System.in);
    static int dia;
    static int precio;
    static int entradas;
    static char respuesta;
    static double individual;
    static double total;
    public static void main(String[] args) throws Exception { 
        //LLamamos a los metodos correspondientes.
        Venta.Datos();
        Venta.CalculoPreBase();
        Venta.CalcularTotal();
        Venta.mostrarResultados();
    }
    public static void Datos(){
        //Pedimos los datos del empleado.
        System.out.print("introduce día de la semana(en numeración del 1-Lunes al 6-Sábado): ");
        Venta.dia = Venta.sc.nextInt();
        System.out.print("Especifique el número de entradas: ");
        entradas = Venta.sc.nextInt();
        System.out.print("¿Tiene tarjeta CineCampa? S/N: ");
        respuesta = Venta.sc.next().toUpperCase().charAt(0);
    }
    public static double CalcularDtoTrajeta(){
        double descuento = 0;
        if (respuesta =='S') {
            descuento = 0.1;
        } return descuento;
    }
    public static void CalculoPreBase(){
        individual = 0;
        if (dia==3) {
            individual = 5;
        } else{
            individual = 8;
        }
    }
    public static void CalcularTotal(){
        double descuento = Venta.CalcularDtoTrajeta();
        total = (individual*entradas)-(individual*descuento);
    }
    
    public static void mostrarResultados() {
        System.out.println("Día de la semana: "+dia);
        System.out.println("Número de entradas: "+entradas);
        System.out.println("El precio individual sin descuento es de: "+individual);
        System.out.println("El precio total con descuento del: "+Venta.CalcularDtoTrajeta()+" es de: "+total);
    }
}
