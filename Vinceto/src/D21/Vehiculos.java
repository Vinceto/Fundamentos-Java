package D21;

public class Vehiculos {
    private String color;
    private String patente;
    private int cantidadAsientos;
    private int stock;

    public Vehiculos(String color, String patente, int cantidadAsientos, int stock) {
        this.color = color;
        this.patente = patente;
        this.cantidadAsientos = cantidadAsientos;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public boolean reducirStock() {
        if (stock > 0) {
            stock--;
            return true;
        } else {
            return false;
        }
    }

    public int asientosDisponibles() {
        return cantidadAsientos;
    }

    @Override
    public String toString() {
        return "\nColor: " + color + ",\nPatente: " + patente + ",\nAsientos: " + cantidadAsientos + ",\nStock: " + stock;
    }
}

