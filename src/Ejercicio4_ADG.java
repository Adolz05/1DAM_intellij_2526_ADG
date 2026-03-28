import java.util.Random;
import java.util.Scanner;

public class Ejercicio4_ADG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        String[] arrayNombres = new String[20];
        int[] arrayPuntuacion = new int[20];


        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del equipo " + (i + 1) + ": ");
            arrayNombres[i] = sc.nextLine();

            arrayPuntuacion[i] = rnd.nextInt(66) + 35;
        }


        int maxPtos = -1, minPtos = 101, sumaPtos = 0;
        int indexGanador = 0, indexUltimo = 0;

        for (int i = 0; i < 20; i++) {
            sumaPtos += arrayPuntuacion[i];
            if (arrayPuntuacion[i] > maxPtos) {
                maxPtos = arrayPuntuacion[i];
                indexGanador = i;
            }
            if (arrayPuntuacion[i] < minPtos) {
                minPtos = arrayPuntuacion[i];
                indexUltimo = i;
            }
        }

        System.out.println("Equipo ganador: " + arrayNombres[indexGanador] + " con " + maxPtos + " puntos.");
        System.out.println("Último clasificado: " + arrayNombres[indexUltimo] + " con " + minPtos + " puntos.");
        System.out.println("Puntuación media de la liga: " + (double)sumaPtos / 20);
    }
}
