package arraylist;
import java.util.Scanner;
import java.util.ArrayList; 
// Son arrays dinámicos. Seria interesante ver cómo seria con punteros en C++.
public class Nota{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> nombres = new ArrayList<>();
    // ArraList<T> --> Tipo dinámico.

    public static void main(String[] args) {
        // Agregar elementos al ArrayList
        // for... pidiendo datos de autores
        // autor = nrew Autor[p1, p2, p3...]
        // autorres.add(autor);
        Nota.nombres.add("Pedro"); //0
        Nota.nombres.add("Juan"); //1
        Nota.nombres.add("Ana"); //2
        Nota.nombres.add("Maria"); //3

        // Acceso a los elementos del array.
        // nota = Nosta[i] --> Array estático.
        // nota = Notas.get(i) --> Array dinámico.
        System.out.println(Nota.nombres.get(0));

        // Tamaño del array
        // lend era el tamaño de un array estático.
        // Para uno dinámico se usa size.
        // nota.length --> Array dinámico.
        System.out.println(Nota.nombres.size());

        // Modificar una posición.
        Nota.nombres.set(2, "Jorge");
        System.out.println(Nota.nombres.get(2));

        // Eliminar una posición.
        Nota.nombres.remove(2);
        System.out.println(Nota.nombres.get(2));

        // Recorrer el array.
        // Forma tradicional --> Acceso porn indice.
        for (int i = 0; i < Nota.nombres.size(); i++) {
            System.out.println("i: " + Nota.nombres.get(i));
        }

        // Moderna --> Mayoira de los lenguajes -- foreach.
        // Se recorre mientras que haya elemntos en el array/colección/kista...
        // y en "elemento" habra el objeto de esa iteración.
        for (String elemento : Nota.nombres) {
            System.out.println("nombre: " + elemento);
        }
    }

}
