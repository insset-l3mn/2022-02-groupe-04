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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "graphe")
@NamedQueries({
    @NamedQuery(name = "Graphe.findAll", query = "SELECT g FROM Graphe g"),
    @NamedQuery(name = "Graphe.findByIdGraphe", query = "SELECT g FROM Graphe g WHERE g.idGraphe = :idGraphe")})
public class Graphe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idGraphe")
    private Integer idGraphe;
    @JoinTable(name = "graphe_has_graphe", joinColumns = {
        @JoinColumn(name = "Graphe_idGraphe", referencedColumnName = "idGraphe")}, inverseJoinColumns = {
        @JoinColumn(name = "Graphe_idGraphe1", referencedColumnName = "idGraphe")})
    @ManyToMany
    private Collection<Graphe> grapheCollection;
    @ManyToMany(mappedBy = "grapheCollection")
    private Collection<Graphe> grapheCollection1;
    @JoinColumn(name = "Formateur_idFormateur", referencedColumnName = "idFormateur")
    @ManyToOne(optional = false)
    private Formateur formateuridFormateur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grapheidGraphe")
    private Collection<Utilisateur> utilisateurCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "graphe")
    private Collection<Compétences> compétencesCollection;

    public Graphe() {
    }

    public Graphe(Integer idGraphe) {
        this.idGraphe = idGraphe;
    }

    public Integer getIdGraphe() {
        return idGraphe;
    }

    public void setIdGraphe(Integer idGraphe) {
        this.idGraphe = idGraphe;
    }

    public Collection<Graphe> getGrapheCollection() {
        return grapheCollection;
    }

    public void setGrapheCollection(Collection<Graphe> grapheCollection) {
        this.grapheCollection = grapheCollection;
    }

    public Collection<Graphe> getGrapheCollection1() {
        return grapheCollection1;
    }

    public void setGrapheCollection1(Collection<Graphe> grapheCollection1) {
        this.grapheCollection1 = grapheCollection1;
    }

    public Formateur getFormateuridFormateur() {
        return formateuridFormateur;
    }

    public void setFormateuridFormateur(Formateur formateuridFormateur) {
        this.formateuridFormateur = formateuridFormateur;
    }

    public Collection<Utilisateur> getUtilisateurCollection() {
        return utilisateurCollection;
    }

    public void setUtilisateurCollection(Collection<Utilisateur> utilisateurCollection) {
        this.utilisateurCollection = utilisateurCollection;
    }

    public Collection<Compétences> getCompétencesCollection() {
        return compétencesCollection;
    }

    public void setCompétencesCollection(Collection<Compétences> compétencesCollection) {
        this.compétencesCollection = compétencesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGraphe != null ? idGraphe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Graphe)) {
            return false;
        }
        Graphe other = (Graphe) object;
        if ((this.idGraphe == null && other.idGraphe != null) || (this.idGraphe != null && !this.idGraphe.equals(other.idGraphe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.Graphe[ idGraphe=" + idGraphe + " ]";
    }
    
}
