/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Johan
 */
public class VehiculoElectricoAdapter extends Vehiculo{
    
    VehiculoElectrico vehiculoElectrico = new VehiculoElectrico();

    @Override
    public void frenar() {
        vehiculoElectrico.frenarElectrico();
    }

    @Override
    public void acelerar() {
        vehiculoElectrico.acelerarElectrico();
    }
    
}
