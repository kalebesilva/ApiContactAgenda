package com.oficina.oficina.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ContatosEmail implements Serializable {

  @Id
  @GeneratedValue(strategy =  GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  private Long emailId;

  @ManyToOne
  private Contatos contatoId;

  @Column(nullable = false)
  private String email;

  public Long getEmailId() {
    return emailId;
  }

  public void setEmailId(Long emailId) {
    this.emailId = emailId;
  }

  public Contatos getContatoId() {
    return contatoId;
  }

  public void setContatoId(Contatos contatoId) {
    this.contatoId = contatoId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  
}
