package D21;

public class MiniBus extends Vehiculos {
    private String tipoViaje;

    public MiniBus(String color, String patente, int cantidadAsientos, int stock, String tipoViaje) {
        super(color, patente, cantidadAsientos, stock);
        this.tipoViaje = tipoViaje;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Viaje: " + tipoViaje;
    }
}
