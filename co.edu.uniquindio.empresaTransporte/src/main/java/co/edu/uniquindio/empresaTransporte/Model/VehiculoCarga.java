package co.edu.uniquindio.empresaTransporte.Model;

public class VehiculoCarga extends Vehiculo{

    private float capacidad;
    private int numeroEjes;

    /*Constructor*/

    public VehiculoCarga() {
    }

    public VehiculoCarga(String placa, String modelo, String marca, String color, float capacidad, int numeroEjes) {
        super(placa, modelo, marca, color);
        this.capacidad = capacidad;
        this.numeroEjes = numeroEjes;
    }

    /*Getters and Setters*/

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidad=" + capacidad +
                ", numeroEjes=" + numeroEjes +
                "} " + super.toString();
    }
}
