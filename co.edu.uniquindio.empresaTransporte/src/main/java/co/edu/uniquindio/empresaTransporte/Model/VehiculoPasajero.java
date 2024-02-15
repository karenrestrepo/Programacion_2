package co.edu.uniquindio.empresaTransporte.Model;

public class VehiculoPasajero extends Vehiculo {

    private int maximopasajeros;

    /*Constructor*/

    public VehiculoPasajero() {
    }

    public VehiculoPasajero(String placa, String modelo, String marca, String color, int maximopasajeros) {
        super(placa, modelo, marca, color);
        this.maximopasajeros = maximopasajeros;
    }

    /*Getters and Setters*/

    public int getMaximopasajeros() {
        return maximopasajeros;
    }

    public void setMaximopasajeros(int maximopasajeros) {
        this.maximopasajeros = maximopasajeros;
    }
}
