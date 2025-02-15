package jic.empresa;

import java.util.Scanner;
import java.util.ArrayList;

// import com.google.gson.Gson;
// import com.google.gson.GsonBuilder;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.FileReader;

public class Main {
    private static ArrayList<Empleado> LEmpleados = new ArrayList<Empleado>();
    // private ArrayList<Director> LDirectores = new ArrayList<Director>();
    // private ArrayList<Contable> LContables = new ArrayList<Contable>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
    public static void menu() {
        System.out.println("1. Alta de empleado");
        System.out.println("2. Alta de director");
        System.out.println("3. Alta de contable");
        System.out.println("4. Listar empleados");
        System.out.println("5. Listar directores");
        System.out.println("6. Listar contables");
        System.out.println("7. Salir");
        System.out.print("Opcion: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                nuevoEmpleado();
                break;
            case 2:
                nuevoDirector();
                break;
            case 3:
                nuevoContable();
                break;
            case 4:
                añadirHoras();
                break;
            case 5:
                // listartodoslosEmpleados();
                break;
            case 6:
                listarEmpleados();
                break;
            case 7:
                // listarDirectores();
                break;
            case 8:
                // listarContables();
                break;
            case 9:
                // cargarEmpleados();
                // imprimirTodoslosEmpleados();
                break;
            case 10:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void nuevoEmpleado(){
        Empleado empleado = new Empleado();
        LEmpleados.add(empleado);
        System.out.println("El empleado ha sido añadido correctamente.");
    }
    
    public static void nuevoDirector(){
        Director director = new Director();
        LEmpleados.add(director);
        System.out.println("El director ha sido añadido correctamente.");
    }

    public static void nuevoContable(){
        Contable contable = new Contable();
        LEmpleados.add(contable);
        System.out.println("El contable ha sido añadido correctamente.");
    }

    public static void añadirHoras(){
        System.out.println("Introduce el nombre del empleado: ");
        String dni = sc.next();
        for (Empleado e : LEmpleados) {
            if (e.getDNI().equals(dni)) {
                System.out.println("Introduce las horas exra: ");
                int horasExtra = sc.nextInt();
                sc.nextLine();
                e.setHorasExtra(e.getHorasExtra()+horasExtra);
                System.out.println("Las horas extras han sido añadidas correctamente.");
                return;
            }
        }
        System.out.println("No se ha podido encontrar al empleado.");
    }

    public static void listarEmpleados(){
        
    }
}