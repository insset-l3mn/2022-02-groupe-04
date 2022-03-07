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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "formateur")
@NamedQueries({
    @NamedQuery(name = "Formateur.findAll", query = "SELECT f FROM Formateur f"),
    @NamedQuery(name = "Formateur.findByIdFormateur", query = "SELECT f FROM Formateur f WHERE f.idFormateur = :idFormateur"),
    @NamedQuery(name = "Formateur.findByNom", query = "SELECT f FROM Formateur f WHERE f.nom = :nom"),
    @NamedQuery(name = "Formateur.findByPrenom", query = "SELECT f FROM Formateur f WHERE f.prenom = :prenom"),
    @NamedQuery(name = "Formateur.findByUniversit\u00e9", query = "SELECT f FROM Formateur f WHERE f.universit\u00e9 = :universit\u00e9"),
    @NamedQuery(name = "Formateur.findByMail", query = "SELECT f FROM Formateur f WHERE f.mail = :mail")})
public class Formateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFormateur")
    private Integer idFormateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Universit\u00e9")
    private String université;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mail")
    private String mail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formateuridFormateur")
    private Collection<Graphe> grapheCollection;
    @JoinColumn(name = "Parcours_idParcours", referencedColumnName = "idParcours")
    @ManyToOne(optional = false)
    private Parcours parcoursidParcours;
    @JoinColumn(name = "Questions_idQuestions", referencedColumnName = "idQuestions")
    @ManyToOne(optional = false)
    private Questions questionsidQuestions;

    public Formateur() {
    }

    public Formateur(Integer idFormateur) {
        this.idFormateur = idFormateur;
    }

    public Formateur(Integer idFormateur, String nom, String prenom, String université, String mail) {
        this.idFormateur = idFormateur;
        this.nom = nom;
        this.prenom = prenom;
        this.université = université;
        this.mail = mail;
    }

    public Integer getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(Integer idFormateur) {
        this.idFormateur = idFormateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUniversité() {
        return université;
    }

    public void setUniversité(String université) {
        this.université = université;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Collection<Graphe> getGrapheCollection() {
        return grapheCollection;
    }

    public void setGrapheCollection(Collection<Graphe> grapheCollection) {
        this.grapheCollection = grapheCollection;
    }

    public Parcours getParcoursidParcours() {
        return parcoursidParcours;
    }

    public void setParcoursidParcours(Parcours parcoursidParcours) {
        this.parcoursidParcours = parcoursidParcours;
    }

    public Questions getQuestionsidQuestions() {
        return questionsidQuestions;
    }

    public void setQuestionsidQuestions(Questions questionsidQuestions) {
        this.questionsidQuestions = questionsidQuestions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormateur != null ? idFormateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formateur)) {
            return false;
        }
        Formateur other = (Formateur) object;
        if ((this.idFormateur == null && other.idFormateur != null) || (this.idFormateur != null && !this.idFormateur.equals(other.idFormateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.Formateur[ idFormateur=" + idFormateur + " ]";
    }
    
}
