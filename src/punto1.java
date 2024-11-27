import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class punto1 {

    //Ejercicio 1: Cálculo de ingresos mensuales
    //Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.
    //
    //**Instrucciones**:
    //- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
    //- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
    //- Imprime el total de ingresos mensuales.

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        ArrayList<Double> ventasDiarias = new ArrayList<>();


        for (int i = 0; i < 30 ; i++) {
            System.out.print("Ingresa la venta del dia " + (i+1)+ " :");
            double venta = intro.nextDouble();
            ventasDiarias.add(venta);

        }

        for (double dato:ventasDiarias){
            System.out.println(dato);






       }

        sumarLista(ventasDiarias);

    }

    public static void sumarLista (ArrayList ventasDiarias){
        double suma = 0;
        for (int i = 0; i < ventasDiarias.size() ; i++) {
            double numero = (double) ventasDiarias.get(i);
            suma = suma + numero;
        }
        System.out.println("la suma de las ventas en el mes es: " + suma);

    }



}

