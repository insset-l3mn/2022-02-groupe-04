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



/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "questionnaire")
@NamedQueries({
    @NamedQuery(name = "Questionnaire.findAll", query = "SELECT q FROM Questionnaire q"),
    @NamedQuery(name = "Questionnaire.findByIdQuestionnaire", query = "SELECT q FROM Questionnaire q WHERE q.idQuestionnaire = :idQuestionnaire")})
public class Questionnaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idQuestionnaire")
    private Integer idQuestionnaire;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionnaire")
    private Collection<Questions> questionsCollection;

    public Questionnaire() {
    }

    public Questionnaire(Integer idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public Integer getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(Integer idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public Collection<Questions> getQuestionsCollection() {
        return questionsCollection;
    }

    public void setQuestionsCollection(Collection<Questions> questionsCollection) {
        this.questionsCollection = questionsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idQuestionnaire != null ? idQuestionnaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questionnaire)) {
            return false;
        }
        Questionnaire other = (Questionnaire) object;
        if ((this.idQuestionnaire == null && other.idQuestionnaire != null) || (this.idQuestionnaire != null && !this.idQuestionnaire.equals(other.idQuestionnaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.Questionnaire[ idQuestionnaire=" + idQuestionnaire + " ]";
    }
    
}
