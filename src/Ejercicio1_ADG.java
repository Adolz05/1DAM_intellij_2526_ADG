public class Ejercicio1_ADG {

        public boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado,
        double salarioOficinistas, int numeroOficinistas,
        boolean proyectosTerminados, double presupuestoEmpresa) {


            if (!proyectosTerminados) {
                System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
                return false; // No apto
            }


            double gastoPersonal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);

            if (gastoPersonal > 20000) {
                System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoPersonal + " y excede el límite mensual de 20.000 euros");
                return false;
            }


            if (presupuestoEmpresa > 100000) {
                System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido en 100.000 euros");
                return false;
            } else {
                System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
                return true;
            }
        }
    }

