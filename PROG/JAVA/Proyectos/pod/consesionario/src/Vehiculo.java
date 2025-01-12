package pod.consesionario;

public class Vehiculo {
    private String marca;
    private String modelo;
    String color;
    int potencia;
    int velocidad;
    double[] kmSemana = new double[7];
    int DIAS = 7;
    String[] diasSemana = {"L", "M", "X", "J", "V", "S", "D"};
    double kmTotales = 0;

    // 1- Constructor -> creacion.
    public Vehiculo(String marca, String modelo, int velocidad){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVelocidad(velocidad);
    }
    // 3- Metodos funcionales -> comportamiento.
    public double kmDia(int dia){
        // d = getindexSemane('Jueves');
        return this.kmSemana[dia];
    }

    public void generarKmSemana(){
        for(int i=0; i<DIAS; i++){
            double temp = Math.random()*200;
            this.kmSemana[i] = Math.round(temp*100.00)/100.00;
            this.kmTotales += this.kmSemana[i];
        }
    }
    // 2- Metodos getters y setters -> validacion de datos
    public void setMarca(String marca){
        this.marca = marca.toUpperCase();
    }

    public void setModelo(String modelo){
        this.modelo = modelo.toUpperCase();
    }

    public void setColor(String color){
        this.color = color.toUpperCase();
    }

    public void setVelocidad(int velocidad){ // Condiciones.
        if (velocidad < 100) {
            this.velocidad = 100;
            System.out.println("Error en velocidad, asigna xdef velocidad mínima.");
        } else{
            this.velocidad = velocidad;
        }
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public String getMarca(){
        return this.marca.toLowerCase();
    }

    public String getModelo(){
        return this.modelo.toLowerCase();
    }

    public String getColor(){
        return this.color.toLowerCase();
    }

    public int getVelocidad(){
        return this.velocidad;
    }

    public int getPotencia(){
        return this.potencia;
    }

    public void Inf(){
        System.out.println("Vehiculo: " + this.getMarca() + " " + this.getModelo()
        + this.getColor() + this.getVelocidad() + this.getPotencia());
    }

    public String toString(){
        String info;
        info = "Vehiculo{ \n" 
        + "Marca: " + this.getMarca() + " \n" 
        + "Modelo:" + this.getModelo() + " \n" 
        + "Velocidad: "+ this.getVelocidad() + "km/h \n";

        String kmdias = "";
        for(int i=0; i<DIAS; i++){
            kmdias = kmdias + diasSemana[i] + ": " + kmSemana[i] + "\n";
        }
        info= info.concat("Viajes: \n").concat(kmdias).concat("}");
        return info;
    }
}
