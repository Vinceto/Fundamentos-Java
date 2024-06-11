package D25;

class Cliente {
    private String patente;
    private int edad;

    public Cliente(String patente, int edad) {
        this.patente = patente;
        this.edad = edad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
