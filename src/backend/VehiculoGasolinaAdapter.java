/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Johanna
 */
public class VehiculoGasolinaAdapter extends Vehiculo{
    
    VehiculoGasolina vehiculoGasolina = new VehiculoGasolina();

    @Override
    public void frenar() {
        vehiculoGasolina.frenarGasolina();
    }

    @Override
    public void acelerar() {
        vehiculoGasolina.acelerarGasolina();
    }
}
