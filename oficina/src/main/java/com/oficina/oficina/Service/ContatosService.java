package com.oficina.oficina.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oficina.oficina.Model.Contatos;
import com.oficina.oficina.Repository.ContatoRepository;

@Service
public class ContatosService implements InterfaceService<Contatos> {

  private ContatoRepository contactRepository;

  public ContatosService(ContatoRepository contactRepository) {
    this.contactRepository = contactRepository;
  }

  @Override
  public List<Contatos> getAll() {
    List<Contatos> myContactsList = contactRepository.findAll();
    return myContactsList;
  }

  @Override
  public Contatos getById(Long id) {
    Contatos gettedContactById = contactRepository.findById(id).orElse(null);
    return gettedContactById;
  }

  @Override
  public Contatos insertInDataBase(Contatos myObj) {
    Contatos inserttedContactObjInDataBase = contactRepository.save(myObj);
    return inserttedContactObjInDataBase;
  }

  @Override
  public void deleteRegisterById(Long id) {
    contactRepository.deleteById(id);
  }

  public List<Contatos> getAllForThisTable() {
    List<Contatos> theContactList = contactRepository.findAllOfThisTable();
    return theContactList;
  }
  
}
