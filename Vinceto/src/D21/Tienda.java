package D21;
import java.util.List;

public class Tienda {
    private String nombreTienda;
    private List<Vendedor> vendedores;
    private List<Vehiculos> vehiculos;

    public Tienda(String nombreTienda, List<Vendedor> vendedores, List<Vehiculos> vehiculos) {
        this.nombreTienda = nombreTienda;
        this.vendedores = vendedores;
        this.vehiculos = vehiculos;
    }

    public int cantidadStock(Vehiculos vehiculo) {
        return vehiculo.getStock();
    }

    public boolean venderVehiculo(Vehiculos vehiculo) {
        return vehiculo.reducirStock();
    }

    private int totalVehiculosEnStock() {
        int total = 0;
        for (Vehiculos vehiculo : vehiculos) {
            total += vehiculo.getStock();
        }
        return total;
    }

    @Override
    public String toString() {
        return "\nNombre Tienda: " + nombreTienda +
                ",\nCantidad de Vendedores: " + vendedores.size() +
                ",\nTotal de Vehículos en Stock: " + totalVehiculosEnStock();
    }
}