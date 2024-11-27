public class punto6 {


    // Ejercicio 6: Cálculo de impuestos
    //Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.
    //
    //**Instrucciones**:
    //- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
    //- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.

    public static void main(String[] args) {
        double[] facturas= {1800,2000,532,400,30000,400,512,200,3000,4500,5500};

        calcularImpuesto(facturas);

    }

    public static void calcularImpuesto( double[] facturas) {
        double[] ivaDeFacturas;
        ivaDeFacturas = new double[facturas.length];
        for (int i = 0; i < facturas.length; i++) {
            double iva = facturas[i]*0.21;
            ivaDeFacturas[i] = iva;

            System.out.println("el importe de "+ facturas[i] + " tiene un IVA de: " + ivaDeFacturas[i]);

        }


    }




}
