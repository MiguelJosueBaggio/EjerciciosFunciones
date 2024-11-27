public class punto9 {
    //Ejercicio 9: Calcular el precio final con descuentos
    //Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.
    //
    //**Instrucciones**:
    //- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
    //- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.

    public static void main(String[] args) {
        double[] PrecioOriginales= {1500,250,500,400,};

        calcularPrecioFinal(PrecioOriginales);

    }

    public static void calcularPrecioFinal( double[] PrecioOriginales) {

        for (int i = 0; i < PrecioOriginales.length; i++) { double PrecioFinal =PrecioOriginales[i]- PrecioOriginales[i]*0.1;
            System.out.println( "el precio originale es de " + PrecioOriginales[i] + " y el precio final es  "+PrecioFinal);

        }



    }








}
