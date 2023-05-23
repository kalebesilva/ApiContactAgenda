package com.oficina.oficina.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.oficina.Model.ContatosTelefone;
import com.oficina.oficina.Repository.ContatosTelefoneRepository;


@Service
public class ContatosTelefoneService implements InterfaceService<ContatosTelefone>{

  @Autowired
  private ContatosTelefoneRepository contatosTelefoneRepository;



  @Override
  public List<ContatosTelefone> getAll() {
    List<ContatosTelefone> gettedAllContactTelefone =  contatosTelefoneRepository.findAll();
    return gettedAllContactTelefone;
  }

  @Override
  public ContatosTelefone getById(Long id) {
    ContatosTelefone gettedTelefoneContactById = contatosTelefoneRepository.findById(id).orElse(null);
    return gettedTelefoneContactById;
  }

  @Override
  public ContatosTelefone insertInDataBase(ContatosTelefone myObj) {
    ContatosTelefone inserttedTelefoneContactInDb = contatosTelefoneRepository.save(myObj);
    return inserttedTelefoneContactInDb;
  }

  @Override
  public void deleteRegisterById(Long id) {
    contatosTelefoneRepository.deleteById(id);
  }
  
}
