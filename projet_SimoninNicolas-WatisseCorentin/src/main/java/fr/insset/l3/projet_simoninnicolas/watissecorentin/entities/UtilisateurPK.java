/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nicolas
 */
@Embeddable
public class UtilisateurPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idUtilisateur")
    private int idUtilisateur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Parcours_idParcours")
    private int parcoursidParcours;

    public UtilisateurPK() {
    }

    public UtilisateurPK(int idUtilisateur, int parcoursidParcours) {
        this.idUtilisateur = idUtilisateur;
        this.parcoursidParcours = parcoursidParcours;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getParcoursidParcours() {
        return parcoursidParcours;
    }

    public void setParcoursidParcours(int parcoursidParcours) {
        this.parcoursidParcours = parcoursidParcours;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUtilisateur;
        hash += (int) parcoursidParcours;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UtilisateurPK)) {
            return false;
        }
        UtilisateurPK other = (UtilisateurPK) object;
        if (this.idUtilisateur != other.idUtilisateur) {
            return false;
        }
        if (this.parcoursidParcours != other.parcoursidParcours) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.UtilisateurPK[ idUtilisateur=" + idUtilisateur + ", parcoursidParcours=" + parcoursidParcours + " ]";
    }
    
}
