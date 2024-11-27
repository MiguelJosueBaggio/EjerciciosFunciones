public class punto5 {

    // Ejercicio 5: Promedio de satisfacción del cliente
    //Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.
    //
    //**Instrucciones**:
    //- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
    //- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.
    public static void main(String[] args) {
    double[] calificaciones= {1,2,5,4,3,4,5,2,3,4,5};

         calcularPromedioSastifaccion(calificaciones);

    }

    public static void calcularPromedioSastifaccion( double[] calificaciones) {
        double suma =0;
        double conteo=0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
            conteo +=1;
        }
            double promedio = suma/conteo;
        System.out.println( "el promedio de las calificaioces es: " + promedio);

        }

}
