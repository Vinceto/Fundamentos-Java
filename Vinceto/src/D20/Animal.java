package D20;

class Animal {
    private int edad;
    private String origen;

    public Animal(int edad, String origen) {
        this.edad = edad;
        this.origen = origen;
    }

    // Métodos getters y setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Edad: " + edad + ", Origen: " + origen;
    }
}