public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar(int delta) {
        int v = getVelocidad();
        int ganancia;
        if (v < 40) {
            ganancia = delta * 2;
        } else if (v < 80) {
            ganancia = (int) (delta * 1.2);
        } else {
            ganancia = (int) (delta * 0.7);
        }
        if (ganancia < 1 && delta > 0) ganancia = 1;
        setVelocidad(v + ganancia);
    }
}