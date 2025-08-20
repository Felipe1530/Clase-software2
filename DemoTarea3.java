public class DemoTarea3 {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[] {
            new Carro("Toyota", "Corolla", 180),
            new Moto("Yamaha", "MT-03", 170)
        };

        System.out.println("Estado inicial:");
        for (Vehiculo v : flota) System.out.println(" - " + v);

        System.out.println("\nAcelerar +10:");
        for (Vehiculo v : flota) {
            v.acelerar(10);
            System.out.println(" - " + v);
        }

        System.out.println("\nAcelerar +20:");
        for (Vehiculo v : flota) {
            v.acelerar(20);
            System.out.println(" - " + v);
        }

        System.out.println("\nFrenar -15:");
        for (Vehiculo v : flota) {
            v.frenar(15);
            System.out.println(" - " + v);
        }
    }
}