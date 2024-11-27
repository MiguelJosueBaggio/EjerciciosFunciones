public class punto3 {
    //Ejercicio 3: Gestión de clientes
    //Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas, pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.
    //
    //**Instrucciones**:
    //- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
    //- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.

    public static void main(String[] args) {

        String[] clientes ={"Gonzalez","Ramirez","Baggio", "Mealla", "Quintero"};
        int [] facturasPendientes = {2000,5000,100,200,450};

        enviarFacturas(clientes,facturasPendientes);


    }

  public static void enviarFacturas(String[] clientes , int[] facturasPendientes){
      for (int i = 0; i < clientes.length; i++) {
          if (facturasPendientes[i]>500){
              System.out.println("el cliente " + clientes[i] + " tiene una factura pendiente de "+ facturasPendientes[i]);
          }

      }





  }
}
