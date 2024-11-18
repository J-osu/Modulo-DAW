package pod;

public class Vehiculo {
    // Una clase tiene propiedades y métodos.
    // Ámbito de la propiedad o método: public, private o protected.
    /*
        Private ocula a la clse que hace clientela y a la que hereda, es decir, solo se ve en la clase en la que esta.
        Public se puede ver en la clase que hace clientela y en la que hereda, es decir, se puede ver en cualquier clase.
        Protected es privado a la clase cliente y publico a la clase que hereda, es decir, lo puede ver la clase que ereda
        pero en la clase cliente no.
        No se deben modificar las propiedades desde el cliente (exterior).
     */

    private String marca;
    private String modelo;

    // Los setters son los responsable de modificar cada clase.
    public void setMarca(String marca){
        this.marca = marca.toUpperCase();
    }

    public void setModelo(String nombre){
        this.modelo.toUpperCase();
    }

    // Los getters responsable de leer las propiedades de clase.
    public String getMarca(){
        return this.marca.toLowerCase();
    }

    public String getModelo(){
        return this.modelo.toLowerCase();
    }

    // Visualización de la clase.
    public void Inf(){
        System.out.println("Vehiculo: " + this.getMarca() + " " + this.getModelo());
    }

    public String toString(){
        String info;
        info = " Vehiculo: " + this.getMarca() + " " + this.getModelo();
        return info;
    }
}
