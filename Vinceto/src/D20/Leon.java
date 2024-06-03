package D20;

class Leon extends Animal {
    private String sexo;

    public Leon(int edad, String origen, String sexo) {
        super(edad, origen);
        this.sexo = sexo;
    }

    // Métodos getters y setters
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "León [" + super.toString() + ", Sexo: " + sexo + "]";
    }
}
