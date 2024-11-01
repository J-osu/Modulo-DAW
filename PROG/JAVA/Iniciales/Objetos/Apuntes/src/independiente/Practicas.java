package independiente;
import java.text.Normalizer; //Importamos la utileria Normalizer, se usa para eliminar acentos y diacríticos.
import java.util.Arrays; //Importamos la utileria Arrays, proporciona una serie de métodos estáticos para manipular arrays.
import java.util.Scanner;
public class Practicas{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        //llamamos a la funcion correspondiente.
        // Practicas.AnagramaPD();
        Practicas.PalindromoPD();
    }
    public static void Clear(){
        System.out.println("");
        System.out.print("Desea continuar s/n: ");;
        char n = Practicas.sc.next().toLowerCase().charAt(0);
        if (n == 's'){
            System.out.print("\033[H\033[2J");
            System.out.flush();
      }
    }
    
    public static void FizzBuzz(){
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt(); //Escanea el texto intruducido y lo pasa a valor numerico int.
        for (int i = 1; i<= num ; i++) {
            boolean divisiblede3 = i % 3 == 0; //Selecciona los numeros multiplos por 3.
            boolean divisiblede5 = i % 5 == 0; //Selecciona los numeros multiplos por 5.
                if (divisiblede3 && divisiblede5) {
                    System.out.println("fizzbuzz"); //Pilla los divisible de 3 y 5 y los sustituye por fizzbuzz.
                } else if (divisiblede3) {
                    System.out.println("fizz"); //Pilla los divisibles de 3 y los cambia por fizz.
                } else if (divisiblede5) {
                    System.out.println("buzz"); //Pilla los divisibles de 5 y los cambia por buzz.
                } else {
                    System.out.println(i);
                }
        }
    }

    public static void AnagramaPD(){
        //Pedimos los datos.
        System.out.print("Introduce la 1ª palabra: ");
        String palabra1 = Practicas.sc.nextLine().toLowerCase(); //Pasamos las palabras introducidas a minuscula para evitar posibles fallos.
        System.out.print("Introduce la 2ª palabra: ");
        String palabra2 = Practicas.sc.nextLine().toLowerCase(); //Con ".toLowerCase()".
        Anagrama(palabra1, palabra2);
    }
    public static void Anagrama(String palabra1, String palabra2){
        if (palabra1.equals(palabra2)) {
            System.out.println("No son iguales"); //En caso de que las 2 palabras introducidas no sean iguales devuelve el mensaje.
            return;
        }
        char[] chpalabra1 = palabra1.toCharArray(); //Convertimos las palabras introducidas en caracteres.
        char[] chpalabra2 = palabra2.toCharArray();
        Arrays.sort(chpalabra1); //Ordenamos de manera ascendente con ".sort()".
        Arrays.sort(chpalabra2);
        boolean vuelta = Arrays.equals(chpalabra1, chpalabra2); //Comparamos si son iguales.
        if (vuelta) {
            System.out.println("Las palabras son anagramas."); //Devolveoms mensaje en caso positivo.
        } else {
            System.out.println("Las palabras no son anagramas."); //Devolvemos mensaje en caso negativo.
        }
    }

    public static void PalindromoPD(){
        //Pedimos los datos.
        System.out.print("Introduce la 1ª palabra: ");
        String palabra = Practicas.sc.nextLine().toLowerCase(); //Escanea la caneda de texto y los pasa a minuscula.
        boolean espalindromo = Practicas.Palindromo(palabra);
        if (espalindromo) {
            System.out.println("Es un palíndromo."); //Si resulta ser un palindromo "verdadero" devuelve el mensaje.
        } else {
            System.out.println("No es un palíndromo."); //Si resulta no ser un palindromo "false "devuelve el mensaje.
        }
    }
    public static boolean Palindromo(String palabra){
        palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD); //Separa los caracteres base de los diacriticos; ejem cación -> "cancion"-" ` ".
        palabra =  palabra.replaceAll("[^\\p{ASCII}]", ""); // Eliminamos los acentos y caracteres especiales.
        palabra =  palabra.replaceAll("[^a-z0-9]", ""); // Eliminamos todo lo que no sea letras o números.
        String palabrareves = new StringBuilder(palabra).reverse().toString();
        return palabra.equals(palabrareves); //Comparamos la palabra original con su reverso para ver si coinciden.
    }
}

