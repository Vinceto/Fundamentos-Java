package D24;

public class Main {
    public static void main(String[] args) {
        Auto auto =  new Auto();
        System.out.println("Auto creado!");
        auto.aumentarVelocidad();
        System.out.println(auto.toString());

        Conductor conductor = new Conductor();
        conductor.setAutoConducido(auto);
        System.out.println(conductor);
        conductor.setNombre("meteoro");
        System.out.println(conductor.toString());
    }
}
