/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterejercicio;

import backend.CarrozaAdapter;
import backend.TricicloAdapter;
import backend.TroncoMovilAdapter;
import backend.Vehiculo;
import backend.VehiculoElectricoAdapter;
import backend.VehiculoGasolinaAdapter;
import java.util.Scanner;

/**
 *
 * @author Johannna
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo;
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("Seleccione el Vehiculo que desea conducir");
            System.out.println("1. Triciclo");
            System.out.println("2. TroncoMovil");
            System.out.println("3. Carroza");
            System.out.println("4. Vehiculo gasolina");
            System.out.println("5. Vehiculo electrico");
            System.out.println("6. Salir");

            int opcion = sc.nextInt();
            System.out.println("____________________________________________________");
          
            switch (opcion) {
                case 1:
                    vehiculo = new TricicloAdapter();
                    vehiculo.acelerar();
                    vehiculo.frenar();
                    break;
                case 2:
                    vehiculo = new TroncoMovilAdapter();
                    vehiculo.acelerar();
                    vehiculo.frenar();
                    break;
                case 3:
                    vehiculo = new CarrozaAdapter();
                    vehiculo.acelerar();
                    vehiculo.frenar();
                    break;
                case 4:
                    vehiculo = new VehiculoGasolinaAdapter();
                    vehiculo.acelerar();
                    vehiculo.frenar();
                    break;
                case 5:
                    vehiculo = new VehiculoElectricoAdapter();
                    vehiculo.acelerar();
                    vehiculo.frenar();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }
        }
    }
    
}
