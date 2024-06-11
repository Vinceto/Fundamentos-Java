package D24;

public class Auto {
        private String marca;
        private String modelo;
        private String color;
        private int velocidadActual;
        private boolean motorEncendido;

        public Auto(){}

        public Auto(String marca, String modelo, String color, int velocidadActual, boolean motorEncendido) {
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
            this.velocidadActual = velocidadActual;
            this.motorEncendido = motorEncendido;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getVelocidadActual() {
            return velocidadActual;
        }

        public void setVelocidadActual(int velocidadActual) {
            this.velocidadActual = velocidadActual;
        }

        public boolean isMotorEncendido() {
            return motorEncendido;
        }

        public void setMotorEncendido(boolean motorEncendido) {
            this.motorEncendido = motorEncendido;
        }

        public void aumentarVelocidad(int velocidad){
            velocidadActual = velocidadActual + velocidad;
        }

        public void aumentarVelocidad(){
            velocidadActual = velocidadActual + 10;
        }

        public void aumentarVelocidad(boolean maximoCiudad, boolean maximoCarretera){
            if (maximoCiudad){
                velocidadActual = velocidadActual + 50;
            }
            if (maximoCarretera){
                velocidadActual = velocidadActual + 100;
            }
        }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", motorEncendido=" + motorEncendido +
                '}';
    }
}
