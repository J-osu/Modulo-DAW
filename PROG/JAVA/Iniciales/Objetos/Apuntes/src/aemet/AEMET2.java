package aemet;
import java.util.Scanner;

public class AEMET2 {
    static Scanner sc = new Scanner(System.in);
    static final int NCIUDADES = 8;
    static String[] ciudades = {"Almeria", "Sevilla", "Granada", "Cordoba", "Cadiz", "Huelva", "Jaen", "Malaga"};
    public static RegCiudad2[] regTemperaturas = new RegCiudad2[NCIUDADES];

    public static void main(String[] args) {
        AEMET2.generarRegistroTemp();
    }

    public static void generarRegistroTemp() {
        int vmax; int vmin;
        for(int i =0; i < NCIUDADES; i++){
            System.out.println(ciudades[i]);
        }
    }
}
