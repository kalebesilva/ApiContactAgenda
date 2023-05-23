package com.oficina.oficina.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ContatosEndereco implements Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  private Long enderecoId;

  @ManyToOne
  private Contatos contatoId;

  @Column(nullable = false)
  private Integer numero;

  @Column(nullable = false)
  private String rua;

  @Column(nullable = false)
  private String bairro;
  
  @Column(nullable = false)
  private String cidade;
  
  @Column(nullable = false)
  private String estado;
 
  @Column(nullable = false)
  private String pais;

  public Long getEnderecoId() {
    return enderecoId;
  }

  public void setEnderecoId(Long enderecoId) {
    this.enderecoId = enderecoId;
  }

  public Contatos getContatoId() {
    return contatoId;
  }

  public void setContatoId(Contatos contatoId) {
    this.contatoId = contatoId;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }



}
