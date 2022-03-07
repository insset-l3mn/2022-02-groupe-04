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
public class RéponsesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idR\u00e9ponses")
    private int idRéponses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Questions_idQuestions")
    private int questionsidQuestions;

    public RéponsesPK() {
    }

    public RéponsesPK(int idRéponses, int questionsidQuestions) {
        this.idRéponses = idRéponses;
        this.questionsidQuestions = questionsidQuestions;
    }

    public int getIdRéponses() {
        return idRéponses;
    }

    public void setIdRéponses(int idRéponses) {
        this.idRéponses = idRéponses;
    }

    public int getQuestionsidQuestions() {
        return questionsidQuestions;
    }

    public void setQuestionsidQuestions(int questionsidQuestions) {
        this.questionsidQuestions = questionsidQuestions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRéponses;
        hash += (int) questionsidQuestions;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RéponsesPK)) {
            return false;
        }
        RéponsesPK other = (RéponsesPK) object;
        if (this.idRéponses != other.idRéponses) {
            return false;
        }
        if (this.questionsidQuestions != other.questionsidQuestions) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.R\u00e9ponsesPK[ idR\u00e9ponses=" + idRéponses + ", questionsidQuestions=" + questionsidQuestions + " ]";
    }
    
}
