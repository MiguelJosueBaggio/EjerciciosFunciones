public class punto8 {

    //Ejercicio 8: Control de horas trabajadas
    //Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.
    //
    //**Instrucciones**:
    //- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas trabajadas en la semana.
    //- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).
    public static void main(String[] args) {
        String[] empleados = {"Juan", "Antonio", "Alberto", "Ramón"};
        int[] horasTrabajadas = {40, 35, 20, 50};
        calcularPagoSemanal(empleados ,horasTrabajadas);

    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas ) {
        for (int i = 0; i < empleados.length; i++) {
            int pagoSemanal = horasTrabajadas[i]*15;
            System.out.println("El empleado "+ empleados[i]+ " cobró "+pagoSemanal);

        }


    }

}
