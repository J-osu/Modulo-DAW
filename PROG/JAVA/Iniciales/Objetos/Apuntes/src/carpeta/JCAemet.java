package carpeta;
import java.util.Scanner;

public class JCAemet {
    static Scanner sc = new Scanner(System.in);
    static final int NCIUDADES = 8;
    static String[] nombres = {"Almeria", "Sevilla", "Granada", "Cordoba", "Cadiz", "Huelva", "Jaen", "Malaga"};
    static JCRegCiudad[] ciudades = new JCRegCiudad[NCIUDADES];
    static String ciudad;

    public static void main(String[] args) {
        generarRegistroTemp();
        mostrarDatosDia();
        System.out.println("Ciudad con la temperatura máxima en Lunes: " + getCiudadTempMax("Lunes"));
        System.out.println("Temperatura media en Andalucía el Lunes: " + getTempMediaDia("Lunes"));listarRegistroTemp();
    }

    public static void generarRegistroTemp() {
        for (int i = 0; i < NCIUDADES; i++) {
            ciudades[i] = new JCRegCiudad(nombres[i]);
        }

        for (JCRegCiudad ciudades : ciudades) {
            ciudades.generarTemperaturas();
        }
    }

    public static void listarRegistroTemp() {
        System.out.println();
        System.out.println("Listado de temperaturas semanales de todas las ciudades:\n");
        for (JCRegCiudad ciudades : ciudades) {
            ciudades.mostrarTabla();
            System.out.println();
        }
    }

    public static void mostrarDatosDia() {
        System.out.println();
        System.out.print("Ingrese el nombre de la ciudad: ");
        ciudad = JCAemet.sc.nextLine();
        System.out.print("Ingrese el día de la semana: ");
        ciudad = JCAemet.sc.nextLine();
        String dia = JCAemet.sc.nextLine();
        for (JCRegCiudad ciudades : ciudades) {
            if (ciudades.getNombre().equalsIgnoreCase(ciudad)) {
                double[] datos = ciudades.getDatosDia(dia);
                System.out.println("Datos para " + ciudad + " el " + dia + ":");
                System.out.println("Temperatura máxima: " + datos[0]);
                System.out.println("Temperatura mínima: " + datos[1]);
                System.out.println("Temperatura media: " + datos[2]);
                return;
            }
        }
    }

    public static String getCiudadTempMax(String dia) {
        double maxTemp = Double.MIN_VALUE;
        String ciudadMax = "";
        for (JCRegCiudad ciudades : ciudades) {
            double[] datos = ciudades.getDatosDia(dia);
            if (datos[0] > maxTemp) {
                maxTemp = datos[0];
                ciudadMax = ciudades.getNombre();
            }
        }
        return ciudadMax != "" ? ciudadMax : "No disponible";
    }

    public static double getTempMediaDia(String dia) {
        double suma = 0;
        int totalRegistros = 0;

        for (JCRegCiudad ciudades : ciudades) {
            double[] datos = ciudades.getDatosDia(dia);
            suma += datos[2];
            totalRegistros++;
        }
        return Math.round((suma / totalRegistros) * 10.0) / 10.0;
    }
}