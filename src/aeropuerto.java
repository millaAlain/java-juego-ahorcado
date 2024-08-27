import java.util.Scanner;
public class aeropuerto {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int[][] cantidadVuelos = new int[6][3];

        for(int i = 0; i < cantidadVuelos.length ; i++ ) {
            for (int j = 0; j < cantidadVuelos[i].length ; j++){
                System.out.println("Ingrese los asientos disponibles de : "+ i);
                cantidadVuelos[i][j] = teclado.nextInt();
            }
        }
        System.out.println("ingrese la palabra --comenzar-- para inciar el programa");
        String condition = teclado.next();
        int destino, horario, cantidad;

        while (!condition.equalsIgnoreCase("fin")) {
            for(int i = 0; i < cantidadVuelos.length; i++) {
                for (int j = 0; j < cantidadVuelos[i].length; j++){
                    System.out.println("Vuelo " + i + ", Clase " + j + ": " + cantidadVuelos[i][j] + " asientos disponibles");
                }
            }
            System.out.println("ingrese su destino");
            destino = teclado.nextInt();
            System.out.println("ingrese el horario");
            horario = teclado.nextInt();
            System.out.println("ingrese la cantidad de asientos que desea comprar");
            cantidad = teclado.nextInt();

            if (cantidadVuelos[destino][horario] >= cantidad) {
                System.out.println("su reserva fue realizada con exito");
                cantidadVuelos[destino][horario] -= cantidad;
            }else {
                System.out.println("lo siento, no hay asientos disponibles");
            }

            System.out.println("Si desea terminar el proceso, ingrese la palabra --fin--");
            condition = teclado.next();
        }
        teclado.close();
    }
}

