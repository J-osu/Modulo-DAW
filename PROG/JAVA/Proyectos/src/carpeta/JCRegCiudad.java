package carpeta;

public class JCRegCiudad {
    public static final int DIAS = 7;
    public static final int TEMP = 3;
    private String nombre;
    private double tmax;
    private double tmin;
    private double[][] temperaturas = new double[DIAS][TEMP];
    private String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    //===================== Constructor ==================================
    public JCRegCiudad(String nombre) {
        this.nombre = nombre.toUpperCase();
        this.tmax = Math.random() * (45 - 15) + 15;
        this.tmin = Math.random() * (10 - (-10)) + (-10);
    }

    //===================== Getters y Setters ==================================
    public String getNombre() {
        return nombre.toUpperCase();
    }

    public double getTmax() {
        return tmax;
    }

    public double getTmin() {
        return tmin;
    }

    public String setNombre() {
        return nombre.toLowerCase();
    }

    //===================== Metodos ==================================
    public void generarTemperaturas() {
        for (int i = 0; i < DIAS; i++) {
            double maxTemperatura = Math.random() * (tmax - tmin) + tmin;
            double minTemperatura = Math.random() * (tmax - tmin) + tmin;
            if (maxTemperatura < minTemperatura) {
                double temp = maxTemperatura;
                maxTemperatura = minTemperatura;
                minTemperatura = temp;
            }
            temperaturas[i][0] = Math.round(maxTemperatura * 10.0) / 10.0;
            temperaturas[i][1] = Math.round(minTemperatura * 10.0) / 10.0;
            temperaturas[i][2] = Math.round(((temperaturas[i][0] + temperaturas[i][1]) / 2) * 10.0) / 10.0;
        }
    }

    public double[] getDatosDia(String dia) {
        for (int i = 0; i < DIAS; i++) {
            if (diasSemana[i].equalsIgnoreCase(dia)) {
                return temperaturas[i];
            }
        }
        return new double[] {-1, -1, -1};
    }

    //===================== Tabla ==================================
    public void mostrarTabla() {
        System.out.println("Ciudad: " + nombre);
        System.out.println("Día\t\tMax\tMin\tMedia");
        for (int i = 0; i < DIAS; i++) {
            System.out.println(diasSemana[i] + "\t" + temperaturas[i][0] + "\t" + temperaturas[i][1] + "\t" + temperaturas[i][2]);
        }
    }
}