package co.edu.uniquindio.empresaTransporte.Model;

public class VehiculoCarga extends Vehiculo{

    private float capacidad;
    private short numeroEjes;

    /*Constructor*/

    public VehiculoCarga() {
    }

    public VehiculoCarga(String placa, String modelo, String marca, String color, float capacidad, short numeroEjes) {
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

    public short getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(short numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
