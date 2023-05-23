package com.oficina.oficina.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.oficina.Model.Agenda;
import com.oficina.oficina.Repository.AgendaRepository;

@Service
public class AgendaService implements InterfaceService<Agenda>{

  @Autowired
  private AgendaRepository agendaRepository;

  @Override
  public List<Agenda> getAll() {
    List<Agenda> gettedAllAgendaList = agendaRepository.findAll();
    return gettedAllAgendaList;
  }

  @Override
  public Agenda getById(Long id) {
    Agenda gettedAgendaById = agendaRepository.findById(id).orElse(null);
    return gettedAgendaById;
  }

  @Override
  public Agenda insertInDataBase(Agenda myObj) {
    Agenda inserttedAgendaInDb = agendaRepository.save(myObj);
    return inserttedAgendaInDb;
  }

  @Override
  public void deleteRegisterById(Long id) {
    agendaRepository.deleteById(id);
  }
  
}
