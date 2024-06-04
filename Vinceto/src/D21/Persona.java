package D21;

public class Persona {
    private String rut;
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(String rut, String nombre, int edad, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\nRUT: " + rut + ",\nNombre: " + nombre + ",\nEdad: " + edad + ",\nDirección: " + direccion;
    }
}
