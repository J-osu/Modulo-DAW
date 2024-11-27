package aemet;
import java.util.ArrayList;

public class RegCiudad1 {
    public final int NDIAS = 7;
    public final int NTEMP = 3;
    private String[] dias1 = {"L", "M", "X", "J", "V", "S", "D"};
    private ArrayList<String> dias = new ArrayList<>();
    private int[][] temperaturas1 = new int[NDIAS][NTEMP];
    ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();
    private String[] nombre;
    private int vmax;
    private int vmin;

    public RegCiudad1(String[] nombre) {
        this.nombre = (nombre);
        this.setVmax(40);
        this.setVmin(-1);
        this.GenerarTemperaturas();

    }

    public RegCiudad1(String[] nombre, int vmax, int vmin) {
        this.nombre = (nombre);
        this.vmax = (vmax);
        this.vmin = (vmin);
        this.GenerarTemperaturas();
        this.mostrarTaemperaturas();
    }

    public void setDias(String[] dias) {
        this.dias.add("Lunes");this.dias.add("Martes");this.dias.add("Miércoles");
        this.dias.add("Jueves");this.dias.add("Viernes");
        this.dias.add("Sábado");this.dias.add("Domingo");
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public void setVmax(int Vmax) {
        this.vmax = Vmax;
    }

    public void setVmin(int Vmin) {
        this.vmin = Vmin;
    }

    public String getNombre() {
        String nombre = "";
        for (int i = 0; i < this.nombre.length; i++) {
            nombre += this.nombre[i];
        }
        return nombre;
    }

    public int getVmax() {
        return this.vmax;
    }

    public int getVmin() {
        return this.vmin;
    }

    public String[] getDias() {
        return this.dias1;
    }

    public void GenerarTemperaturas() {
        for(String nombre: this.dias){
            ArrayList<Integer> tempDia = new ArrayList<>();
            for(int j =0; j<this.NTEMP; j++){
                int temperatura = (int) (Math.random() * (this.vmax - this.vmin + 1) + this.vmin);
                tempDia.add(temperatura);
            }
            this.temperaturas.add(tempDia);
        }
    }
    // public void GenerarTemperaturas() {
    //     for (int i = 0; i < NDIAS; i++) {
    //         for (int j = 0; j < NTEMP; j++) {
    //             int temperatura = (int) (Math.random() * (vmax - vmin + 1) + vmin);
    //             this.temperaturas[i][j] = temperatura;
    //         }
    //     }
    // }

    public void mostrarTaemperaturas(){
        for(String nombre: this.dias){
            System.out.println("Temperaturas del: " + nombre);
        } 
        for(ArrayList<Integer> tempDia: this.temperaturas){
            for(Integer temp: tempDia){
                System.out.println(temp + ", ");
            }
            System.out.println();
        }
    }

    // public void mostrarTabla(){
    //     String temp="";
    //     System.out.printf("%10s",this.getNombre());
    //     for(int i =0; i<7; i++){
    //         System.out.printf("%15s",this.dias1[i]+" ");
    //     }
    //     System.out.println();
    //     System.out.printf("%10s","");

    //     for(int i =0; i<NDIAS; i++){
    //         temp ="";
    //         for(int j =0; j<NTEMP; j++){
    //             temp = temp + this.temperaturas[i][j]+" ";
    //         }
    //         System.out.printf("%15s", temp);
    //     }
    //     System.out.println();
    // }
}
