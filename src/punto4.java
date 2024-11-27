public class punto4 {

    //Ejercicio 4: Cálculo de descuentos para fidelización
    //Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado. Si han comprado más de 10 veces, reciben un 10% de descuento.
    //
    //**Instrucciones**:
    //- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
    //- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.
    //¡Claro! Aquí tienes cinco ejercicios adicionales en Java, orientados a pequeñas empresas y enfocados en bucles y funciones.

    public static void main(String[] args) {

        String[] clientes = {"perez", "Maquez", "Gonzalez", "marques"};
        int[][] compras = {{250, 300, 500, 145, 14, 156}, {145, 56, 89, 47}, {187, 791, 44, 55, 66, 88, 77, 66}, {44, 44}};

        calcularDescuentos(clientes,compras);

    }

    public static void calcularDescuentos(String[] clientes , int[][] compras) {

        for (int i = 0; i < clientes.length; i++) { int conteo =0; ///este recoore la primer capa

            for (int j = 0; j < compras[i].length; j++) { conteo=conteo +1; // este recorre la segunda capa

            }
            if (conteo>5) {System.out.println("el cliente "+clientes[i]+ " tiene " + conteo + " de compras" );

            }

        }

    }
}

