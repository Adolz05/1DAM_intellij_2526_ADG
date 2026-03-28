import java.util.Scanner;

public class Ejercicio3_ADG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nombre: "); String nombre = sc.nextLine();
        System.out.print("Edad: "); int edad = sc.nextInt();
        System.out.print("Peso: "); double peso = sc.nextDouble();
        System.out.print("Altura: "); double altura = sc.nextDouble();
        sc.nextLine();
        System.out.print("Sexo: "); String sexo = sc.nextLine();

        System.out.print("Velocidad Inicial: "); double vIni = sc.nextDouble();
        System.out.print("Distancia Inicial: "); double dIni = sc.nextDouble();
        System.out.print("Calorías Iniciales: "); double cIni = sc.nextDouble();

        double imc = peso / (altura * altura);


        double sumaV = 0, sumaD = 0, sumaC = 0;
        double maxDist = 0, maxCal = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Sesión " + i + ":");
            System.out.print("Velocidad: "); double v = sc.nextDouble();
            System.out.print("Distancia: "); double d = sc.nextDouble();
            System.out.print("Calorías: "); double c = sc.nextDouble();

            sumaV += v; sumaD += d; sumaC += c;
            if (d > maxDist) maxDist = d;
            if (c > maxCal) maxCal = c;
        }


        System.out.println("\nHola " + nombre + ", te presentamos la ficha de seguimiento:");
        System.out.println("Edad: " + edad + " | Peso: " + peso + " | Altura: " + altura + " | Sexo: " + sexo);
        System.out.println("Índice de masa corporal: " + imc);

        double mediaV = sumaV / 10;
        double mediaD = sumaD / 10;
        double mediaC = sumaC / 10;

        System.out.println("Medias (10 sesiones):");
        System.out.println("Velocidad: " + mediaV + " | Distancia: " + mediaD + " | Calorías: " + mediaC);
        System.out.println("Máxima distancia: " + maxDist + " | Máximas calorías: " + maxCal);


        if (mediaV > vIni) System.out.println("¡Enhorabuena! Has superado tu velocidad media inicial.");
        if (mediaD > dIni) System.out.println("¡Enhorabuena! Has superado tu distancia media inicial.");
        if (mediaC > cIni) System.out.println("¡Enhorabuena! Has superado tu media de calorías inicial.");
    }
}
