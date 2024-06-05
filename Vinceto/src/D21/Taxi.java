package D21;

public class Taxi extends Vehiculos {
    private int valorPasaje;

    public Taxi(String color, String patente, int cantidadAsientos, int stock, int valorPasaje) {
        super(color, patente, cantidadAsientos, stock);
        this.valorPasaje = valorPasaje;
    }

    public void pagarPasaje(int pasaje) {
        System.out.println("Pasaje pagado: " + pasaje);
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor Pasaje: " + valorPasaje;
    }
}