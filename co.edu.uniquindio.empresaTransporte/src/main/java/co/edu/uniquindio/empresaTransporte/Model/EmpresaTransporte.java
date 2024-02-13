package co.edu.uniquindio.empresaTransporte.Model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;
    List<Vehiculo> listaVehiculos = new ArrayList<>();
    List<Asociado> listaAsociados = new ArrayList<>();


    /* Constructor*/

    public EmpresaTransporte() {
    }

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
    }

    /* Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public List<Asociado> getListaAsociados() {
        return listaAsociados;
    }

    public void setListaAsociados(List<Asociado> listaAsociados) {
        this.listaAsociados = listaAsociados;
    }
}
