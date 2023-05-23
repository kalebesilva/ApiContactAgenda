package com.oficina.oficina.Model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contatos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long contId;

    @Column(nullable = false)
    private String contFirstname;
    
    @Column(nullable = false)
    private String contLastname;
    
    @Column(nullable = false)
    private Date dataNasc;
    
    @Column(nullable = false)
    private String anotacoes;

   
    public Long getContId() {
        return contId;
    }

    public void setContId(Long contId) {
        this.contId = contId;
    }

    public String getContFirstname() {
        return contFirstname;
    }

    public void setContFirstname(String contFirstname) {
        this.contFirstname = contFirstname;
    }

    public String getContLastname() {
        return contLastname;
    }

    public void setContLastname(String contLastname) {
        this.contLastname = contLastname;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    
    

}
