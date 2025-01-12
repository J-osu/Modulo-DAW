package pod.biblioteca;

import java.util.Random;
public class Utilidades {
    public static String generarCodigoLibro(Autor autor) {
        if (autor == null || autor.getNombre() == null || autor.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El autor debe tener un nombre válido.");
        }
        char inicialAutor = autor.getNombre().charAt(0); // Obtiene la primera letra del nombre del autor
        int numeroAleatorio = new Random().nextInt(1000); // Genera un número aleatorio entre 0 y 999
        return inicialAutor + String.format("%03d", numeroAleatorio); 
        // Junta una inicial con un número.
    }
}
