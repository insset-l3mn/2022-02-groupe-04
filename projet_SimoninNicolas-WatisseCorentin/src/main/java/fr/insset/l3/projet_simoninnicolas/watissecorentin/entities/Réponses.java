/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "r\u00e9ponses")
@NamedQueries({
    @NamedQuery(name = "R\u00e9ponses.findAll", query = "SELECT r FROM R\u00e9ponses r"),
    @NamedQuery(name = "R\u00e9ponses.findByIdR\u00e9ponses", query = "SELECT r FROM R\u00e9ponses r WHERE r.r\u00e9ponsesPK.idR\u00e9ponses = :idR\u00e9ponses"),
    @NamedQuery(name = "R\u00e9ponses.findByPoints", query = "SELECT r FROM R\u00e9ponses r WHERE r.points = :points"),
    @NamedQuery(name = "R\u00e9ponses.findByQuestionsidQuestions", query = "SELECT r FROM R\u00e9ponses r WHERE r.r\u00e9ponsesPK.questionsidQuestions = :questionsidQuestions")})
public class Réponses implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RéponsesPK réponsesPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Points")
    private int points;
    @JoinTable(name = "utilisateur_has_r\u00e9ponses", joinColumns = {
        @JoinColumn(name = "R\u00e9ponses_idR\u00e9ponses", referencedColumnName = "idR\u00e9ponses")}, inverseJoinColumns = {
        @JoinColumn(name = "Utilisateur_idUtilisateur", referencedColumnName = "idUtilisateur")})
    @ManyToMany
    private Collection<Utilisateur> utilisateurCollection;
    @JoinColumn(name = "Questions_idQuestions", referencedColumnName = "idQuestions", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Questions questions;

    public Réponses() {
    }

    public Réponses(RéponsesPK réponsesPK) {
        this.réponsesPK = réponsesPK;
    }

    public Réponses(RéponsesPK réponsesPK, int points) {
        this.réponsesPK = réponsesPK;
        this.points = points;
    }

    public Réponses(int idRéponses, int questionsidQuestions) {
        this.réponsesPK = new RéponsesPK(idRéponses, questionsidQuestions);
    }

    public RéponsesPK getRéponsesPK() {
        return réponsesPK;
    }

    public void setRéponsesPK(RéponsesPK réponsesPK) {
        this.réponsesPK = réponsesPK;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Collection<Utilisateur> getUtilisateurCollection() {
        return utilisateurCollection;
    }

    public void setUtilisateurCollection(Collection<Utilisateur> utilisateurCollection) {
        this.utilisateurCollection = utilisateurCollection;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (réponsesPK != null ? réponsesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Réponses)) {
            return false;
        }
        Réponses other = (Réponses) object;
        if ((this.réponsesPK == null && other.réponsesPK != null) || (this.réponsesPK != null && !this.réponsesPK.equals(other.réponsesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.R\u00e9ponses[ r\u00e9ponsesPK=" + réponsesPK + " ]";
    }
    
}
