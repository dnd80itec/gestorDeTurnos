/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mycompany.gestordeturnospersistencia.dao.Conexion;
import dao.OrganismoJpaController;
import model.Organismo;

/**
 *
 * @author USER
 */
public class GestorOrganismo {
    private OrganismoJpaController organismoDAO;

    public GestorOrganismo() {
        this.organismoDAO = new OrganismoJpaController(Conexion.getEmf());
    }
    
    
    public void crearOrganismo(Organismo nuevoOrganismo){
        this.organismoDAO.create(nuevoOrganismo);
    }
}
