package ejercicios;
import java.util.Scanner;
public class Ejer {
    public static void main(String[] args) throws Exception {

        //Punto 1:
        //1.1
        //System.out.println("Hola me llamo JOsue y voy a ser tu Dios :)");
        //1.2
        // System.out.println("Hola me llamo JOsue y voy a ser tu Dios :)");
        // System.out.println("Vivo en mi casa, mi numero es mio y ya esta");
        //
        //1.3
        // System.out.println("┌──────────────────────┐");
        // System.out.println("│Ingles      Castellano│");
        // System.out.println("│──────────────────────│");
        // System.out.printf("│%-10s %11s│\n","Computer","Ordenador");
        // System.out.printf("│%-10s %11s│\n","Cat","Gato");
        // System.out.printf("│%-10s %11s│\n","Setudent","Estudiante");
        // System.out.println("└──────────────────────┘");
        //
        //1.4
        // System.out.println("┌─────┬─────┬──────┬─────────┬──────┬───────┐");
        // System.out.println("│Horas│Lunes│Martes│Miercoles│Jueves│Viernes│");
        // System.out.println("├─────┼─────┼──────┼─────────┼──────┼───────┤");
        // System.out.println("│08:00│Digi │LMSGI │PROG     │ENT   │LMSGI  │");
        // System.out.println("├─────┼─────┼──────┼─────────┼──────┼───────┤");
        // System.out.println("│09:00│PROG │LMSGI │PROG     │ENT   │PROG   │");
        // System.out.println("├─────┼─────┼──────┼─────────┼──────┼───────┤");
        // System.out.println("│10:00│PROG │SIS   │PROG     │SIS   │PROG   │");
        // System.out.println("├─────┼─────┼──────┼─────────┼──────┼───────┤");
        // System.out.println("│10:00│IPPE │SIS   │SIS      │SIS   │PROG   │");
        // System.out.println("├─────┼─────┼──────┼─────────┼──────┼───────┤");
        // System.out.println("│10:00│BD   │IPPE  │SOSTE    │BD    │BD     │");
        // System.out.println("├─────┼─────┼──────┼─────────┼──────┼───────┤");
        // System.out.println("│10:00│BD   │ENT   │IPPE     │BD    │BD     │");
        // System.out.println("└─────┴─────┴──────┴─────────┴──────┴───────┘");
        //
        //1.7 LUEGO CONTINUO

        //Punto 2:
        //Ejercicio 2.1
        // int x = 144;
        // int y = 999;
        // System.out.println("La x tiene un valor de: "+x+" y la y tiene un valor de: "+y);
        // int suma = x+y;
        // int resta = x-y;
        // int multi = x*y;
        // double div = (double) x/y;
        // System.out.println("La suma de los 2 es de: "+suma);
        // System.out.println("La resta de los 2 es de: "+resta);
        // System.out.println("La multiplicacion de los 2 es de: "+multi);
        // System.out.println("La division de los 2 es de: "+div);
        //
        //2.2
        // String nombre = ("Josue de la Cruz");
        // System.out.println(nombre);
        //
        //2.3
        // String nombre = ("Josue de la Cruz");
        // int edad = 19;
        // String vivo = ("coño de tu madre");
        // System.out.println(nombre+" tengo "+edad+" y vivo en el "+vivo);
        //
        //2.4
        // int euro = 1;
        // double peseta = 166.386;
        // double pesetas = euro*peseta;
        // System.out.println(euro+" euro a pesetas es "+pesetas);
        //
        //2.5
        // double euro = 166.386;
        // double peseta = 1;
        // double euros = peseta/euro;
        // System.out.println(peseta+" pesetas a euros es "+euros);
        //
        //2.6
        // double producto = 4.5;
        // int iva = 21;
        // double x1 = (producto*iva)/100;
        // double total = producto+x1;
        // System.out.println("El precio total con iva incluido del colacao es de: "+total);
        //
        //2.7 
        // char letra = 'J';
        // String nombre = ("Josue de la Cruz");
        // System.out.println(nombre+letra); //Creo que no deberia de funcionar aunque no sé.
        //
        //2.8
        // char letra1 = 'J';
        // char letra2 = 'O';
        // char letra3 = 'S';
        // char letra4 = 'U';
        // String palabra = " "+letra1+letra2+letra3+letra4;
        // System.out.println("Me llamo"+palabra);

        //Punto 3:
        Scanner sc = new Scanner(System.in);
        //3.1
        // System.out.print("Introduce 2 numeros separados por un espacio: ");
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int multi = n1*n2;
        // System.out.println("El resultado de la multiplicacion es: "+multi);
        //
        //3.2
        // System.out.print("Introduce la cantidad en euros que quieras pasar a pesetas: ");
        // int euro = Integer.parseInt(sc.nextLine());
        // double peseta = 166.386;
        // double pesetas = euro*peseta;
        // System.out.println(euro+" euro a pesetas es "+pesetas);
        //
        //3.3
        // System.out.print("Introduce la cantidad en euros que quieras pasar a pesetas: ");
        // int peseta = Integer.parseInt(sc.nextLine());
        // double euro = 166.386;
        // double euros = peseta/euro;
        // System.out.println(peseta+" pesetas a euros es "+euros);
        //
        //3.4
        // System.out.print("Introduce 2 numeros separados por un espacio: ");
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int suma = n1+n2;
        // int resta = n1-n2;
        // int multi = n1*n2;
        // double div = (double) n1/n2;
        // System.out.println("El resultado de la suma es: "+suma);
        // System.out.println("El resultado de la resta es: "+resta);
        // System.out.println("El resultado de la multiplicacion es: "+multi);
        // System.out.println("El resultado de la division es: "+div);
        //
        //3.5
        // System.out.print("Introduce 2 numeros(separados por un espacio) para sacar el área de un rectangulo: ");
        // double l1 = sc.nextDouble();
        // double a1 = sc.nextDouble();
        // double areaR = l1*a1;
        // System.out.printf("El area del rectangulo es de: %.2f\n", areaR);
        //
        //3.6
        // System.out.print("Introduce 2 numeros(separados por un espacio) para sacar el área de un triangulo: ");
        // double b1 = sc.nextDouble();
        // double a1 = sc.nextDouble();
        // double areaT = (b1*a1)/2;
        // System.out.printf("El area del rectangulo es de: %.2f\n", areaT);
        //
        //3.7
        // System.out.print("Introduce el nombre del producto: ");
        // String nombre = sc.nextLine();
        // System.out.print("Introduce el precio del producto: ");
        // double precio = sc.nextDouble();
        // double iva = (precio*21) /100;
        // double total = precio + iva;
        // System.out.printf("El %s tiene un precio total de: %.2f\n",nombre,total);
        //
        //3.8
        // System.out.print("Introduce las horas trabajadas: ");
        // double horas = sc.nextDouble();
        // double dia = horas*12;
        // double semana = (dia*7);
        // System.out.printf(horas+"h equivalen a: "+dia+" euros al dia y "+semana+" euros a la semana");
        //
        //3.9
        // System.out.print("Introduce la base del cono: ");
        // double radio = sc.nextDouble();
        // System.out.print("Introduce la altura del cono: ");
        // double altura = sc.nextDouble();
        // double pi = Math.PI;
        // double volumen = (1.0 / 3) * pi * Math.pow(radio, 2) * altura;
        // System.out.printf("El volumen del cono es: %.2f\n", volumen);
        //
        //3.10
        // final int conversion = 1024;
        // System.out.print("Introduce el número de MB que quieres convertir a kb: ");
        // int MB = sc.nextInt();
        // double Kb = (double) MB*conversion;
        // System.out.printf("%d MB son %.2f Kb.\n", MB, Kb);
        //
        //3.11
        // final double conversion = 1024.0;
        // System.out.print("Introduce el número de Kb que quieres convertir a MB: ");
        // int Kb = sc.nextInt();
        // double MB = Kb/conversion;
        // System.out.printf("%d Kb son %.2f MB.\n", Kb, MB);
        //
        //3.12
        // System.out.print("Introduce la nota del 1ºer trimestre: ");
        // double n1 = Double.parseDouble(sc.nextLine());
        // System.out.print("Introduce la nota deseada al final del trimestre: ");
        // double n = Double.parseDouble(sc.nextLine());
        // double n2 = (n - (n1 * 0.4)) / 0.6;
        // if (n2 <= 10 && n2 >= 5) {
        //     System.out.printf("Bro, te puedes relajar (no tanto), vas bien porque necesitas un %.1f en el segundo examen.\n", n2);
        // } else if (n2 > 10) {
        //     System.out.printf("Men, es IMPOSIBLE, necesitas un %.2f en el segundo examen para alcanzar la media deseada.\n", n2);
        // } else {
        //     System.out.println("Error inesperado con la nota calculada.");
        // }
        sc.close();
        
        //Punto 4:
    }
}
