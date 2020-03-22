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
public class CarrozaAdapter extends Vehiculo{
    
    Carroza carroza = new Carroza();

    @Override
    public void frenar() {
        carroza.halarRiendas();
    }

    @Override
    public void acelerar() {
        carroza.moverRiendas();
        carroza.arrearCaballos();
    }
}
