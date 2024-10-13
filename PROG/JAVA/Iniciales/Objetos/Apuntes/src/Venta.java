import java.util.Scanner;
public class Venta {
    static Scanner sc = new Scanner(System.in);
    //Aquí van los valores que se van a usar a nivel de clase.
    static int dia;
    static int entradas;
    static char respuesta;
    static double preciobase;
    static double total;
    static char continuar;
    public static void main(String[] args) throws Exception { 
        //LLamamos al metodo que muestra los resultados.
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
        //Calculamos el porcentaje de descuento a aplicar en caso de poseer la tarjeta.
        double descuento = 0;
        if (respuesta =='S') {
            descuento = 0.1;
        } return descuento;
    }
    public static void CalculoPreBase(){
        //Calculamos el precio base teniendo en cuenta los 2 días que este cambia.
        //Si "dia" es "3" el precio base es de 5.
        //Pero si es "4" el precio base es de 11 por ser un precio para parejas.
        //Si no es ninguni de esos casos o si el dia 4 viene un cliente solo el precio sera de 8.
        preciobase = 0;
        if (dia==3) {
            preciobase = 5;
        } else if (dia==4) {
            preciobase = 11;
        } else{
            preciobase = 8;
        }
    }
    public static void Total(){
        //Realizamos todos los calculos con los datos obtenidos, el precio base y el descuento.
        double descuento = Venta.CalcularDtoTrajeta();
        //En caso de que "dia" sea "4" calculará el total de un grupo impar de personas.
        if (dia==4) {
            int nparejas = entradas/2;
            int individual = entradas%2;
            total = (nparejas * 11) + (individual * 8);
        } else {
            total = preciobase*entradas;
        }
        total = total-(total*descuento);
    }
    
    public static void mostrarResultados() {
        //Ponemos los reltados a mostrar dentro de un bucle para que se repita.
        //En este caso se el "do" es el bloque que se va a repetir si se cumple la condición.
        do{
        Venta.Datos();
        Venta.CalculoPreBase();
        Venta.Total();
        //Aquí asociamos los numeros de la semana (menos el domingo)con su respectivo numero.
        String ndia = "";
        switch (dia) {
            case 1: ndia = "Lunes"; break;
            case 2: ndia = "Martes"; break;
            case 3: ndia = "Miercoles"; break;
            case 4: ndia = "Jueves"; break;
            case 5: ndia = "Viernes"; break;
            case 6: ndia = "Sabado"; break;
            default: ndia = "Día desconocido"; break;
        }
        //Pintamos los reltados en un ticket.
        System.out.println("Día de la semana: "+ndia);
        System.out.println("Número de entradas: "+entradas);
        System.out.println("El precio individual sin descuento es de: "+preciobase);
        System.out.println("El precio total con descuento del: "+Venta.CalcularDtoTrajeta()*100+"% es de: "+total);
        //L a condición a cumplir es "S" en caso de que continuar se marque con un "N" te soltará el mensaje predeterminado.
        System.out.print("\n¿Desea realizar otra operación? (S/N): ");
        continuar = sc.next().toUpperCase().charAt(0);
        } while (continuar == 'S');
        System.out.println("Gracias por venir. ¡Disfrute de la peli!");
    }
}
