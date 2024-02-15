package co.edu.uniquindio.empresaTransporte.Model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;
    List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    List<VehiculoPasajero> listaVehiculosPasajero = new ArrayList<>();
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

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoPasajero> getListaVehiculosPasajero() {
        return listaVehiculosPasajero;
    }

    public void setListaVehiculosPasajero(List<VehiculoPasajero> listaVehiculosPasajero) {
        this.listaVehiculosPasajero = listaVehiculosPasajero;
    }

    public List<Asociado> getListaAsociados() {
        return listaAsociados;
    }

    public void setListaAsociados(List<Asociado> listaAsociados) {
        this.listaAsociados = listaAsociados;
    }
}
