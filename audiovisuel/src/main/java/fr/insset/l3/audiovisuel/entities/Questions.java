/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.audiovisuel.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author coren
 */
@Entity
@Table(name = "questions")
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q"),
    @NamedQuery(name = "Questions.findByIdQuestions", query = "SELECT q FROM Questions q WHERE q.idQuestions = :idQuestions"),
    @NamedQuery(name = "Questions.findByQuestions", query = "SELECT q FROM Questions q WHERE q.questions = :questions"),
    @NamedQuery(name = "Questions.findByReponse1", query = "SELECT q FROM Questions q WHERE q.reponse1 = :reponse1"),
    @NamedQuery(name = "Questions.findByReponse2", query = "SELECT q FROM Questions q WHERE q.reponse2 = :reponse2"),
    @NamedQuery(name = "Questions.findByReponse3", query = "SELECT q FROM Questions q WHERE q.reponse3 = :reponse3"),
    @NamedQuery(name = "Questions.findByReponse4", query = "SELECT q FROM Questions q WHERE q.reponse4 = :reponse4"),
    @NamedQuery(name = "Questions.findByTheme", query = "SELECT q FROM Questions q WHERE q.theme = :theme")})
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "idQuestions")
    private Integer idQuestions;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Questions")
    private String questions;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Reponse1")
    private String reponse1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Reponse2")
    private String reponse2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Reponse3")
    private String reponse3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Reponse4")
    private String reponse4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Theme")
    private String theme;

    public Questions() {
    }

    public Questions(Integer idQuestions) {
        this.idQuestions = idQuestions;
    }

    public Questions(Integer idQuestions, String questions, String reponse1, String reponse2, String reponse3, String reponse4, String theme) {
        this.idQuestions = idQuestions;
        this.questions = questions;
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.reponse3 = reponse3;
        this.reponse4 = reponse4;
        this.theme = theme;
    }

    public Integer getIdQuestions() {
        return idQuestions;
    }

    public void setIdQuestions(Integer idQuestions) {
        this.idQuestions = idQuestions;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getReponse1() {
        return reponse1;
    }

    public void setReponse1(String reponse1) {
        this.reponse1 = reponse1;
    }

    public String getReponse2() {
        return reponse2;
    }

    public void setReponse2(String reponse2) {
        this.reponse2 = reponse2;
    }

    public String getReponse3() {
        return reponse3;
    }

    public void setReponse3(String reponse3) {
        this.reponse3 = reponse3;
    }

    public String getReponse4() {
        return reponse4;
    }

    public void setReponse4(String reponse4) {
        this.reponse4 = reponse4;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idQuestions != null ? idQuestions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.idQuestions == null && other.idQuestions != null) || (this.idQuestions != null && !this.idQuestions.equals(other.idQuestions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.audiovisuel.entities.Questions[ idQuestions=" + idQuestions + " ]";
    }
    
}
