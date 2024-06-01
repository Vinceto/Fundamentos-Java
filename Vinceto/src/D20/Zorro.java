package D20;

class Zorro extends Animal {
    private String tipoDeZorro;

    public Zorro(int edad, String origen, String tipoDeZorro) {
        super(edad, origen);
        this.tipoDeZorro = tipoDeZorro;
    }

    // Métodos getters y setters
    public String getTipoDeZorro() {
        return tipoDeZorro;
    }

    public void setTipoDeZorro(String tipoDeZorro) {
        this.tipoDeZorro = tipoDeZorro;
    }

    @Override
    public String toString() {
        return "Zorro [" + super.toString() + ", Tipo de Zorro: " + tipoDeZorro + "]";
    }
}