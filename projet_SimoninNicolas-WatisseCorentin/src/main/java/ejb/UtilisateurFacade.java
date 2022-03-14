/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import entities.Utilisateur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Nicolas
 */
@Stateless
public class UtilisateurFacade extends AbstractFacade<Utilisateur> {

    @PersistenceContext(unitName = "projetPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilisateurFacade() {
        super(Utilisateur.class);
    }
    
    public Utilisateur findUtilisateur(String mail){ 
        Query query = em.createNamedQuery("Utilisateur.findByMail");
        return (Utilisateur) query.getSingleResult();
        
    }
    
}
