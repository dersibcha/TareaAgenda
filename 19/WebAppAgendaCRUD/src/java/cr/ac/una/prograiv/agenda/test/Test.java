/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.agenda.test;

import cr.ac.una.prograiv.agenda.bl.PersonasBL;
import cr.ac.una.prograiv.agenda.dao.PersonasDAO;
import cr.ac.una.prograiv.agenda.domain.Personas;
import java.util.Date;

/**
 *
 * @author chgari
 */
public class Test {
    public static void main(String arg[]){
        PersonasBL bl = new PersonasBL();
        Personas p1 = new Personas(112540149, "Jose ", "Nose", 
                                 "Fonseca", new Date(), 1, "Prueba", 
                                 "chgari", new Date());
        bl.merge(p1);
    }
}















