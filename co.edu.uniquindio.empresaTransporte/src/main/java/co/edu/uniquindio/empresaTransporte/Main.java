package co.edu.uniquindio.empresaTransporte;

import co.edu.uniquindio.empresaTransporte.Model.Asociado;
import co.edu.uniquindio.empresaTransporte.Model.Vehiculo;
import co.edu.uniquindio.empresaTransporte.Model.VehiculoCarga;
import co.edu.uniquindio.empresaTransporte.Model.VehiculoPasajero;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        crearObjeto();
       calcularTotalPasajeros();
    }

    private static void crearObjeto() {
        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setPlaca("ELK196");
        vehiculoCarga.setModelo("2012");
        vehiculoCarga.setMarca("Mercedez Benz");
        vehiculoCarga.setColor("Negro");
        vehiculoCarga.setCapacidad(4500);
        vehiculoCarga.setNumeroEjes(3);

        Asociado asociado = new Asociado();
        asociado.setNombre("Camilo Perez");
        asociado.setIdentidicacion("12354");
        asociado.setEmail("Camilo@gmail.com");
        asociado.setCelular("3213213213");
        asociado.setVehiculo(vehiculoCarga);

        System.out.println("Asociado creado: " + asociado.toString());

    }

    private static void calcularTotalPasajeros() {
        VehiculoPasajero vehiculoPasajero1 = new VehiculoPasajero();
        vehiculoPasajero1.setMaximopasajeros(20);

        VehiculoPasajero vehiculoPasajero2 = new VehiculoPasajero();
        vehiculoPasajero2.setMaximopasajeros(30);

        List<VehiculoPasajero> vehiculoPasajeros = new ArrayList<>();
        vehiculoPasajeros.add(vehiculoPasajero1);
        vehiculoPasajeros.add(vehiculoPasajero2);
        int[] viajesPorVehiculo = {6, 7};

        int totalPasajeros = calcularTotalPasajeros(vehiculoPasajeros, viajesPorVehiculo);
    }

    private static int calcularTotalPasajeros(List<VehiculoPasajero> vehiculoPasajeros, int[] viajesPorVehiculo) {
        int totalPasajeros = 0;
        for (int i = 0; i < vehiculoPasajeros.size(); i++);{
            totalPasajeros += vehiculoPasajeros.get(i).getMaximopasajeros() * viajesPorVehiculo[i];
        }
        return totalPasajeros;
    }


}