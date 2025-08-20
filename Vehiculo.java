public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad;        // km/h
    private int velocidadMaxima;  // km/h

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = Math.max(1, velocidadMaxima);
        this.velocidad = 0;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVelocidad() { return velocidad; }
    public int getVelocidadMaxima() { return velocidadMaxima; }

    protected void setVelocidad(int nuevaVelocidad) {
        if (nuevaVelocidad < 0) nuevaVelocidad = 0;
        if (nuevaVelocidad > velocidadMaxima) nuevaVelocidad = velocidadMaxima;
        this.velocidad = nuevaVelocidad;
    }

    public void acelerar(int delta) {
        setVelocidad(getVelocidad() + Math.max(0, delta));
    }

    public void frenar(int delta) {
        setVelocidad(getVelocidad() - Math.max(0, delta));
    }

    @Override
    public String toString() {
        return String.format("%s %s - %dkm/h (máx %d)", marca, modelo, velocidad, velocidadMaxima);
    }
}