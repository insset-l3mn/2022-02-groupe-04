/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "formation")
@NamedQueries({
    @NamedQuery(name = "Formation.findAll", query = "SELECT f FROM Formation f"),
    @NamedQuery(name = "Formation.findByIdFormation", query = "SELECT f FROM Formation f WHERE f.formationPK.idFormation = :idFormation"),
    @NamedQuery(name = "Formation.findByNom", query = "SELECT f FROM Formation f WHERE f.nom = :nom"),
    @NamedQuery(name = "Formation.findByComp\u00e9tencesidComp\u00e9tences", query = "SELECT f FROM Formation f WHERE f.formationPK.comp\u00e9tencesidComp\u00e9tences = :comp\u00e9tencesidComp\u00e9tences"),
    @NamedQuery(name = "Formation.findByParcoursidParcours", query = "SELECT f FROM Formation f WHERE f.formationPK.parcoursidParcours = :parcoursidParcours")})
public class Formation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FormationPK formationPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom")
    private String nom;
    @JoinColumn(name = "Comp\u00e9tences_idComp\u00e9tences", referencedColumnName = "idComp\u00e9tences", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compétences compétences;
    @JoinColumn(name = "Parcours_idParcours", referencedColumnName = "idParcours", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Parcours parcours;

    public Formation() {
    }

    public Formation(FormationPK formationPK) {
        this.formationPK = formationPK;
    }

    public Formation(FormationPK formationPK, String nom) {
        this.formationPK = formationPK;
        this.nom = nom;
    }

    public Formation(int idFormation, int compétencesidCompétences, int parcoursidParcours) {
        this.formationPK = new FormationPK(idFormation, compétencesidCompétences, parcoursidParcours);
    }

    public FormationPK getFormationPK() {
        return formationPK;
    }

    public void setFormationPK(FormationPK formationPK) {
        this.formationPK = formationPK;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Compétences getCompétences() {
        return compétences;
    }

    public void setCompétences(Compétences compétences) {
        this.compétences = compétences;
    }

    public Parcours getParcours() {
        return parcours;
    }

    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formationPK != null ? formationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.formationPK == null && other.formationPK != null) || (this.formationPK != null && !this.formationPK.equals(other.formationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.Formation[ formationPK=" + formationPK + " ]";
    }
    
}
