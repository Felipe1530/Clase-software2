public class Carro extends Vehiculo {
    public Carro(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar(int delta) {
        int ganancia = (int) Math.ceil(delta * 0.8);
        if (ganancia < 1 && delta > 0) ganancia = 1;
        setVelocidad(getVelocidad() + ganancia);
    }
}