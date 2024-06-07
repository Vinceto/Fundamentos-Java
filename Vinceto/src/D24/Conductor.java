package D24;

public class Conductor {
    private String nombre;
    private Auto autoConducido;

    public Conductor() {
    }

    public Conductor(String nombre, Auto autoConducido) {
        this.nombre = nombre;
        this.autoConducido = autoConducido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Auto getAutoConducido() {
        return autoConducido;
    }

    public void setAutoConducido(Auto autoConducido) {
        this.autoConducido = autoConducido;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", autoConducido=" + autoConducido +
                '}';
    }
}
