package com.oficina.oficina.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ContatosTelefone implements Serializable{
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  private Long telefoneId;

  @ManyToOne
  private Contatos contatoId;

  @Column(nullable = false)
  private String telefone;
  
  public Long getTelefoneId() {
    return telefoneId;
  }
  public void setTelefoneId(Long telefoneId) {
    this.telefoneId = telefoneId;
  }
  public Contatos getContatoId() {
    return contatoId;
  }
  public void setContatoId(Contatos contatoId) {
    this.contatoId = contatoId;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
}
