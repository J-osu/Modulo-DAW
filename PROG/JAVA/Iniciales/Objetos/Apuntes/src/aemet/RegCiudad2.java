package aemet;

public class RegCiudad2 {
    public final int NDIAS = 7;
    public final int NTEMP = 3;
    private String[] dias = {"L", "M", "X", "J", "V", "S", "D"};
    private int[][] temperaturas = new int[NDIAS][NTEMP];
    private String[] nombre;
    private int vmax;
    private int vmin;

    public RegCiudad2(String[] nombre) {
        this.nombre = (nombre);
        this.setVmax(40);
        this.setVmin(-1);
        this.GenerarTemperaturas();

    }

    public RegCiudad2(String[] nombre, int vmax, int vmin) {
        this.nombre = (nombre);
        this.vmax = (vmax);
        this.vmin = (vmin);
        this.GenerarTemperaturas();
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

    public void GenerarTemperaturas() {
        for (int i = 0; i < NDIAS; i++) {
            for (int j = 0; j < NTEMP; j++) {
                int temperatura = (int) (Math.random() * (vmax - vmin + 1) + vmin);
                this.temperaturas[i][j] = temperatura;
            }
        }
    }

    public void mostrarTabla(){
        String temp="";
        System.out.printf("%10s",this.getNombre());
        for(int i =0; i<7; i++){
            System.out.printf("%15s",this.dias[i]+" ");
        }
        System.out.println();
        System.out.printf("%10s","");

        for(int i =0; i<NDIAS; i++){
            temp ="";
            for(int j =0; j<NTEMP; j++){
                temp = temp + this.temperaturas[i][j]+" ";
            }
            System.out.printf("%15s", temp);
        }
        System.out.println();
    }
}
