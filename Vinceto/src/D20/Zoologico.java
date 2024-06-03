package D20;

class Zoologico {
    private Zorro zorro;
    private Leon leon;
    private String ciudad;

    public Zoologico(Zorro zorro, Leon leon, String ciudad) {
        this.zorro = zorro;
        this.leon = leon;
        this.ciudad = ciudad;
    }

    // Métodos getters y setters
    public Zorro getZorro() {
        return zorro;
    }

    public void setZorro(Zorro zorro) {
        this.zorro = zorro;
    }

    public Leon getLeon() {
        return leon;
    }

    public void setLeon(Leon leon) {
        this.leon = leon;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Zoológico [Ciudad: " + ciudad + ", " + zorro + ", " + leon + "]";
    }
}
