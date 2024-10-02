import java.util.Scanner;
public class figura{
    public static double r1;
    public static double b1;
    public static double a1;
    public static final double pi = 3.1416;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        //Area del cuadrado.
        // System.out.print("Introduce 1 numero(separados por un espacio) para sacar el área de un rectangulo: ");
        // double b1 = sc.nextDouble();
        // figura.b1 = figura.sc.nextDouble();
        // double areaC = figura.b1*figura.b1;
        // System.out.printf("El area del cuadrado es: %.2f\n",areaC);
        //
        //Area del rectanguo.
        // System.out.print("Introduce 1 numero: ");
        // double b1 = sc.nextDouble();
        // figura.b1 = figura.sc.nextDouble();
        // System.out.print("Introduce otro numero para sacar el área de un rectangulo: ");
        // double a1 = sc.nextDouble();
        // figura.a1 = figura.sc.nextDouble();
        // double areaR = figura.b1 * figura.a1;
        // System.out.printf("El area del rectangulo es de: %.2f\n", areaR);
        //
        //Area del triangulo
        // System.out.print("Introduce 1 numero: ");
        // double b1 = sc.nextDouble();
        // figura.b1 = figura.sc.nextDouble();
        // System.out.print("Introduce otro numero para sacar el área de un triangulo: ");
        // double a1 = sc.nextDouble();
        // figura.a1 = figura.sc.nextDouble();
        // double areaT = (b1*a1)/2;
        // System.out.printf("El area del rectangulo es de: %.2f\n", areaT);
        //
        //Area del circulo.
        System.out.print("Introduce el radio del circulo: ");
        // double r1 = sc.nextDouble();
        figura.r1 = figura.sc.nextDouble();
        // double pi = 3.14;
        double area = figura.pi*(r1*2);
        System.out.printf("El area del rectangulo es de: %.2f\n", area);
        //
        //Volumen del cono.
        // System.out.print("Introduce la base del cono: ");
        // double radio = sc.nextDouble();
        // System.out.print("Introduce la altura del cono: ");
        // double altura = sc.nextDouble();
        // double pi = Math.PI;
        // double volumen = (1.0 / 3) * pi * Math.pow(radio, 2) * altura;
        // System.out.printf("El volumen del cono es: %.2f\n", volumen);

    }
}
