package com.oficina.oficina.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oficina.oficina.Model.Contatos;

public interface ContatoRepository extends JpaRepository<Contatos, Long>{

  @Query(
    "SELECT c , ce  FROM Contatos c LEFT JOIN ContatosEndereco ce " +
    " ON c.contId = ce.enderecoId"
  )
  public List<Contatos> findAllOfThisTable();


  
  
}
