/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "parcours")
@NamedQueries({
    @NamedQuery(name = "Parcours.findAll", query = "SELECT p FROM Parcours p"),
    @NamedQuery(name = "Parcours.findByIdParcours", query = "SELECT p FROM Parcours p WHERE p.idParcours = :idParcours"),
    @NamedQuery(name = "Parcours.findByNom", query = "SELECT p FROM Parcours p WHERE p.nom = :nom")})
public class Parcours implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idParcours")
    private Integer idParcours;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom")
    private String nom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parcoursidParcours")
    private Collection<Formateur> formateurCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parcours")
    private Collection<Utilisateur> utilisateurCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parcours")
    private Collection<Formation> formationCollection;

    public Parcours() {
    }

    public Parcours(Integer idParcours) {
        this.idParcours = idParcours;
    }

    public Parcours(Integer idParcours, String nom) {
        this.idParcours = idParcours;
        this.nom = nom;
    }

    public Integer getIdParcours() {
        return idParcours;
    }

    public void setIdParcours(Integer idParcours) {
        this.idParcours = idParcours;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<Formateur> getFormateurCollection() {
        return formateurCollection;
    }

    public void setFormateurCollection(Collection<Formateur> formateurCollection) {
        this.formateurCollection = formateurCollection;
    }

    public Collection<Utilisateur> getUtilisateurCollection() {
        return utilisateurCollection;
    }

    public void setUtilisateurCollection(Collection<Utilisateur> utilisateurCollection) {
        this.utilisateurCollection = utilisateurCollection;
    }

    public Collection<Formation> getFormationCollection() {
        return formationCollection;
    }

    public void setFormationCollection(Collection<Formation> formationCollection) {
        this.formationCollection = formationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParcours != null ? idParcours.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcours)) {
            return false;
        }
        Parcours other = (Parcours) object;
        if ((this.idParcours == null && other.idParcours != null) || (this.idParcours != null && !this.idParcours.equals(other.idParcours))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.Parcours[ idParcours=" + idParcours + " ]";
    }
    
}
