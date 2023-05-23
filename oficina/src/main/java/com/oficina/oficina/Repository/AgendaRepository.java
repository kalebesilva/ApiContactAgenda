package com.oficina.oficina.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oficina.oficina.Model.Agenda;

public interface AgendaRepository  extends JpaRepository<Agenda, Long>{
  
}
