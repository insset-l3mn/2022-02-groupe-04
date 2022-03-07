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
public class FormationPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idFormation")
    private int idFormation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Comp\u00e9tences_idComp\u00e9tences")
    private int compétencesidCompétences;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Parcours_idParcours")
    private int parcoursidParcours;

    public FormationPK() {
    }

    public FormationPK(int idFormation, int compétencesidCompétences, int parcoursidParcours) {
        this.idFormation = idFormation;
        this.compétencesidCompétences = compétencesidCompétences;
        this.parcoursidParcours = parcoursidParcours;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    public int getCompétencesidCompétences() {
        return compétencesidCompétences;
    }

    public void setCompétencesidCompétences(int compétencesidCompétences) {
        this.compétencesidCompétences = compétencesidCompétences;
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
        hash += (int) idFormation;
        hash += (int) compétencesidCompétences;
        hash += (int) parcoursidParcours;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormationPK)) {
            return false;
        }
        FormationPK other = (FormationPK) object;
        if (this.idFormation != other.idFormation) {
            return false;
        }
        if (this.compétencesidCompétences != other.compétencesidCompétences) {
            return false;
        }
        if (this.parcoursidParcours != other.parcoursidParcours) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.FormationPK[ idFormation=" + idFormation + ", comp\u00e9tencesidComp\u00e9tences=" + compétencesidCompétences + ", parcoursidParcours=" + parcoursidParcours + " ]";
    }
    
}
