package D25;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("ABCD12", 30);
        Vehiculo vehiculo = new Vehiculo("Toyota");

        LibroVenta venta = new LibroVenta("Venta1", "07/06/2020");
        venta.guardarVenta(cliente, vehiculo);

    }
}
