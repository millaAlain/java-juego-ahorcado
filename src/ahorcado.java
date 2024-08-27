import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdvinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdvinadas.length; i++){
            letrasAdvinadas[i] = '_';
        }
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("La palabra a adivinar: " + String.valueOf(letrasAdvinadas));

            System.out.println("Introduce una letra por favor");
            char letra = Character.toLowerCase(teclado.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdvinadas[i] = letra; 
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrcto, te quenda : " + (intentosMaximos - intentos) + " Intentos");
            }
            if (String.valueOf(letrasAdvinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("felicidades, has adivinado la palabra : " + palabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("Has perdido!!");
        }
        teclado.close();
    }
}
