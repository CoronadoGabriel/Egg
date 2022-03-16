/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.poo.extra3;

import guia6.poo.extra3.entidades.Raices;
import guia6.poo.extra3.servicios.ServicioRaices;

/**
 *
 * @author coron
 */
public class GUIA6POOEXTRA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioRaices sr = new ServicioRaices();
        Raices r = sr.crearRaices();
    }
    
}
