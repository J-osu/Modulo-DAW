import java.util.Scanner;
public class figura{
    public static double area;
    public static final double pi = 3.1416;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        figura.pintarmenu();
    }
        public static double Areadelcuadrado(){
        System.out.print("Introduce 1 numero(separados por un espacio) para sacar el área de un rectangulo: ");
        double lado = figura.sc.nextDouble();
        return lado * lado;
        }

        public static double Areadelrectanguo(){
        System.out.print("Introduce 1 numero: ");
        double lado1 = figura.sc.nextDouble();
        System.out.print("Introduce otro numero para sacar el área de un rectangulo: ");
        double lado2 = figura.sc.nextDouble();
        return lado1 * lado2;
        }

        public static double Areadeltriangulo(){
        System.out.print("Introduce 1 numero: ");
        double base = figura.sc.nextDouble();
        System.out.print("Introduce otro numero para sacar el área de un triangulo: ");
        double altura = figura.sc.nextDouble();
        return (base*altura)/2;
        }

        public static double Areadelcirculo(){
        System.out.print("Introduce el radio del circulo: ");
        double circulo = figura.sc.nextDouble();
        double pi = figura.pi;
        return (circulo*2)*pi;
        }

        // Volumen del cono.
        // System.out.print("Introduce la base del cono: ");
        // double radio = sc.nextDouble();
        // System.out.print("Introduce la altura del cono: ");
        // double altura = sc.nextDouble();
        // double pi = Math.PI;
        // double volumen = (1.0 / 3) * pi * Math.pow(radio, 2) * altura;
        // System.out.printf("El volumen del cono es: %.2f\n", volumen);

        public static void pintarmenu() {
            System.out.println("┌─────────────────────────────┐");
            System.out.println("│       Menu principal.       │");
            System.out.println("│─────────────────────────────│");
            System.out.println("│ 1-Area del cuadrado ■       │");
            System.out.println("│ 2-Area del rectangulo █     │");
            System.out.println("│ 3-Area del triangulo  A     │");
            System.out.println("│ 4-Area del circulo o        │");
            System.out.println("│ 5-Area del prisma traingular│");
            System.out.println("└─────────────────────────────┘");
            System.out.println("Elige una opcion: ");
            figura.condiciones();

        }
        public static void condiciones(){
            int opcion;
        char respuesta;
        boolean continuar = true; 
        while (continuar) { //Bucle whille (mientras) -> Se ejecuta mientras la CONDICION ES CIERTA
            figura.pintarmenu();
            opcion = figura.sc.nextInt();
            //1 SOLO if .. else --> 2 valore v/f ---> Condicional simple
            //varios if ANIDADOS --> decido entre n VALORES --> Condicional Compuesto
            if (opcion == 1){ //instrucción CONDICIONAL
                figura.area = figura.Areadelcuadrado(); //usando area
                System.out.println("El area del cuadrado es = " + figura.area + " m2" );
            }else if (opcion == 2) {
                figura.area = figura.Areadelrectanguo();
                System.out.println("El area del rectangulo es es = " + figura.area + " m2" );        
            }else if (opcion == 3) {
                figura.area = figura.Areadelcirculo();
                System.out.println("El area del circuloes es = " + figura.area + " m2" );
            }else if (opcion == 4){
                figura.area = figura.Areadeltriangulo();
                System.out.println("El area del triángulo es es = " + figura.area + " m2" );
            }else {
                //hacer Area Prisma
                System.out.println("ERROR");
            }
            System.out.print("¿ desea continuar S/N ? : ");
            respuesta = figura.sc.next().toUpperCase().charAt(0);
            //if ((respuesta == 'N') && (respuesta == 'n')) //or and
            if (respuesta == 'N')
                continuar = false;
            }

        }

}