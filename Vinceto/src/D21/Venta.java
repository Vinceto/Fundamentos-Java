package D21;

public class Venta {
    private Cliente cliente;
    private Vendedor vendedor;
    private Tienda tienda;
    private Vehiculos vehiculo;

    public Venta(Cliente cliente, Vendedor vendedor, Tienda tienda, Vehiculos vehiculo) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.tienda = tienda;
        this.vehiculo = vehiculo;
    }

    public boolean realizarVenta() {
        if (tienda.venderVehiculo(vehiculo)) {
            System.out.println("\nVenta realizada: " + this);
            return true;
        } else {
            System.out.println("Venta fallida: no hay stock disponible para " + vehiculo);
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nCliente: " + cliente + ",\nVendedor: " + vendedor + ",\nTienda: " + tienda + ",\nVehículo: " + vehiculo;
    }
}

