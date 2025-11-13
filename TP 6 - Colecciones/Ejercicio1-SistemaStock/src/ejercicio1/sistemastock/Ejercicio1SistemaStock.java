package ejercicio1.sistemastock;
public class Ejercicio1SistemaStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1) Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("P001", "Leche", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 8000, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 15000, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Galletitas", 900, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2) Listar todos los productos mostrando su información y categoría.
        System.out.println("==== LISTA DE PRODUCTOS ====");
        inventario.listarProductos();

        // 3) Buscar un producto por ID y mostrar su información.
        System.out.println("\n==== BUSCAR PRODUCTO POR ID (P003) ====");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4) Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\n==== PRODUCTOS DE CATEGORÍA ALIMENTOS ====");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) {
            p.mostrarInfo();
        }

        // 5) Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n==== ELIMINAR PRODUCTO P002 (Celular) ====");
        boolean eliminado = inventario.eliminarProducto("P002");
        System.out.println(eliminado ? "Producto eliminado correctamente." : "No se encontró el producto.");
        System.out.println("==== PRODUCTOS RESTANTES ====");
        inventario.listarProductos();

        // 6) Actualizar el stock de un producto existente.
        System.out.println("\n==== ACTUALIZAR STOCK DE P001 (Leche) A 80 ====");
        boolean actualizado = inventario.actualizarStock("P001", 80);
        System.out.println(actualizado ? "Stock actualizado." : "Producto no encontrado.");
        inventario.buscarProductoPorId("P001").mostrarInfo();

        // 7) Mostrar el total de stock disponible.
        System.out.println("\n==== TOTAL DE STOCK DISPONIBLE ====");
        System.out.println("Total de unidades en stock: " + inventario.obtenerTotalStock());

        // 8) Obtener y mostrar el producto con mayor stock.
        System.out.println("\n==== PRODUCTO CON MAYOR STOCK ====");
        Producto maxStock = inventario.obtenerProductoConMayorStock();
        if (maxStock != null) {
            maxStock.mostrarInfo();
        }

        // 9) Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n==== PRODUCTOS CON PRECIO ENTRE $1000 Y $3000 ====");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        // 10) Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n==== CATEGORÍAS DISPONIBLES ====");
        inventario.mostrarCategoriasDisponibles();
    }
}