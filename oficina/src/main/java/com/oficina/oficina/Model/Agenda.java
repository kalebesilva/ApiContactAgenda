package com.oficina.oficina.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Agenda implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false, unique = true)
  private Long agendaId;

  @ManyToOne
  private Contatos contatoId;

  @ManyToOne
  private User userId;


  public Long getAgendaId() {
    return agendaId;
  }
  public void setAgendaId(Long agendaId) {
    this.agendaId = agendaId;
  }
  public Contatos getContatoId() {
    return contatoId;
  }
  public void setContatoId(Contatos contatoId) {
    this.contatoId = contatoId;
  }
  public User getUserId() {
    return userId;
  }
  public void setUserId(User userId) {
    this.userId = userId;
  }


  
  
}
