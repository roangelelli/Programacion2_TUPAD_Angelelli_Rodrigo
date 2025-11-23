package tp8.e.commerce;
public class TP8ECommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rodrigo");

        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 12000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(total);

        tarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("PAGADO");
    }
    
}
