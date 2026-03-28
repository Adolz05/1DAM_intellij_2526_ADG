import java.util.Scanner;

public class Ejercicio2_ADG {

    public boolean procesoSeleccion() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt();

        if (edad > 40) {
            System.out.println("Descartado del proceso (mayor de 40 años)");
            return false;
        }

        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Años trabajados: ");
        int anyosTrabajados = sc.nextInt();
        System.out.print("Sueldo bruto anual anterior: ");
        double sueldoAnterior = sc.nextDouble();

        if (sueldoAnterior > 30000) {
            System.out.println("Descartado (sueldo anterior superior a 30.000€)");
            return false;
        }


        double sumaNominas = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Importe nómina " + i + ": ");
            sumaNominas += sc.nextDouble();
        }

        double media = sumaNominas / 5;
        double subida;
        double nuevaNomina;

        if (media > 2500) {
            subida = 0.05; // 5% [cite: 298]
        } else {
            subida = 0.10; // 10% [cite: 299]
        }

        nuevaNomina = media * (1 + subida);
        System.out.println("Contratado. Se le sube el sueldo. Cantidad resultante: " + nuevaNomina);
        return true;
    }
}
