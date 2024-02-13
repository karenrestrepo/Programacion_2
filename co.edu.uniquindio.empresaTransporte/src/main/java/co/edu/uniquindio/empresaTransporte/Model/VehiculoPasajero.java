package co.edu.uniquindio.empresaTransporte.Model;

public class VehiculoPasajero extends Vehiculo {

    private short maximopasajeros;

    /*Constructor*/

    public VehiculoPasajero() {
    }

    public VehiculoPasajero(String placa, String modelo, String marca, String color, short maximopasajeros) {
        super(placa, modelo, marca, color);
        this.maximopasajeros = maximopasajeros;
    }

    /*Getters and Setters*/

    public short getMaximopasajeros() {
        return maximopasajeros;
    }

    public void setMaximopasajeros(short maximopasajeros) {
        this.maximopasajeros = maximopasajeros;
    }
}
