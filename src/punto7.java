public class punto7 {

    // Ejercicio 7: Descuento por compras grandes
    //Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.
    //
    //**Instrucciones**:
    //- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
    //- Escribe una función `aplicarDescuento` que aplique el descuento   a las compras que superen los $500.
    public static void main(String[] args) {
        double[] compras= {1500,250,500,400,};

        aplicarDescuentos(compras);

    }

    public static void aplicarDescuentos( double[] compras) {

        for (int i = 0; i < compras.length; i++) {
            if (compras[i]>500) { double compraDto = compras[i]-compras[i]*0.15;
                System.out.println("Su compra de " + compras[i] + " paso a ser de " + compraDto);

            } else {
                System.out.println("su compra de " +compras[i]+ " no tiene descuento") ;
            }

        }



    }





}
