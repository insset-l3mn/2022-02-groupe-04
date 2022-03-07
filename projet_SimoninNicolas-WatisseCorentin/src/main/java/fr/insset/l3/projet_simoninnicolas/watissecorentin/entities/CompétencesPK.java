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
public class CompétencesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idComp\u00e9tences")
    private int idCompétences;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Graphe_idGraphe")
    private int grapheidGraphe;

    public CompétencesPK() {
    }

    public CompétencesPK(int idCompétences, int grapheidGraphe) {
        this.idCompétences = idCompétences;
        this.grapheidGraphe = grapheidGraphe;
    }

    public int getIdCompétences() {
        return idCompétences;
    }

    public void setIdCompétences(int idCompétences) {
        this.idCompétences = idCompétences;
    }

    public int getGrapheidGraphe() {
        return grapheidGraphe;
    }

    public void setGrapheidGraphe(int grapheidGraphe) {
        this.grapheidGraphe = grapheidGraphe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCompétences;
        hash += (int) grapheidGraphe;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompétencesPK)) {
            return false;
        }
        CompétencesPK other = (CompétencesPK) object;
        if (this.idCompétences != other.idCompétences) {
            return false;
        }
        if (this.grapheidGraphe != other.grapheidGraphe) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.Comp\u00e9tencesPK[ idComp\u00e9tences=" + idCompétences + ", grapheidGraphe=" + grapheidGraphe + " ]";
    }
    
}
