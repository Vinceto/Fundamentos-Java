package D21;

import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("12345678-9", "Juan Pérez", 40, "Av. Siempre Viva 742");
        Vendedor vendedor2 = new Vendedor("87654321-0", "Ana García", 35, "Calle Verdadera 321");
        List<Vendedor> vendedores = Arrays.asList(vendedor1, vendedor2);

        Cliente cliente = new Cliente("98765432-1", "María López", 30, "Calle Falsa 123");

        Vehiculos taxi = new Taxi("Rojo", "ABC123", 4, 10, 1500);
        Vehiculos bus = new Bus("Azul", "XYZ789", 50, 5);
        Vehiculos minibus = new MiniBus("Verde", "DEF456", 20, 3, "Interurbano");
        List<Vehiculos> vehiculos = Arrays.asList(taxi, bus, minibus);

        Tienda tienda = new Tienda("autosLatam", vendedores, vehiculos);

        Venta venta1 = new Venta(cliente, vendedor1, tienda, taxi);
        venta1.realizarVenta();

        Venta venta2 = new Venta(cliente, vendedor2, tienda, taxi);
        venta2.realizarVenta();

        System.out.println("Detalles de la tienda después de las ventas:");
        System.out.println(tienda);
    }
}
/*
public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("12345678-9", "Juan Pérez", 40, "Av. Siempre Viva 742");
        Vendedor vendedor2 = new Vendedor("87654321-0", "Ana García", 35, "Calle Verdadera 321");
        List<Vendedor> vendedores = Arrays.asList(vendedor1, vendedor2);

        Cliente cliente = new Cliente("98765432-1", "María López", 30, "Calle Falsa 123");

        Vehiculos taxi = new Taxi("Rojo", "ABC123", 4, 10, 1500);
        Vehiculos bus = new Bus("Azul", "XYZ789", 50, 5);
        Vehiculos minibus = new MiniBus("Verde", "DEF456", 20, 3, "Interurbano");
        List<Vehiculos> vehiculos = Arrays.asList(taxi, bus, minibus);

        Tienda tienda = new Tienda("autosLatam", vendedores, vehiculos);

        Venta venta1 = new Venta(cliente, vendedor1, tienda, taxi);
        venta1.realizarVenta();

        Venta venta2 = new Venta(cliente, vendedor2, tienda, taxi);
        venta2.realizarVenta();

        System.out.println("Stock de taxi después de las ventas: " + tienda.cantidadStock(taxi));
    }
}

 */