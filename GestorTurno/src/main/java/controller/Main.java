/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mycompany.gestordeturnospersistencia.dao.Conexion;
import model.Organismo;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        new Conexion();
        Organismo o = new Organismo();
        
        GestorOrganismo controller = new GestorOrganismo();
        controller.crearOrganismo(o);
        
        
    }
}
