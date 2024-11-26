package aemet;
import java.util.Scanner;
import aemet.RegCiudad2;

public class AEMET2 {
    static Scanner sc = new Scanner(System.in);
    static final int NCIUDADES = 8;
    public static String[] ciudades = {"Almeria", "Sevilla", "Granada", "Cordoba", "Cadiz", "Huelva", "Jaen", "Malaga"};
    public static RegCiudad2[] regTemperaturas = new RegCiudad2[NCIUDADES];

    public static void main(String[] args) {
        // AEMET2.GenerarRegitroTemp();
    }

    // public static void GenerarRegitroTemp(){
    //     int vmax; int vmin;
    //     for (int i = 0; i<NCIUDADES; i++){
    //         System.out.println(ciudades[i] + ": ");
    //         System.out.print("  Vmax: ");
    //         vmax = AEMET2.sc.nextInt();
    //         System.out.print("  Vmin: ");
    //         vmin = AEMET2.sc.nextInt();
    //         AEMET2.regTemperaturas[i] = new RegCiudad2(ciudades[i], vmin, vmax);
    //     }
    // }

    public static void ListarRegistroTemperaturas(){
        for (int i=0; i<NCIUDADES; i++){
            AEMET2.regTemperaturas[i].mostrarTabla();
        }
    }
}
