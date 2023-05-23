package com.oficina.oficina.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.oficina.Model.ContatosEmail;
import com.oficina.oficina.Repository.ContatosEmailRepository;

@Service
public class ContatosEmailService implements InterfaceService<ContatosEmail>{

  @Autowired
  private ContatosEmailRepository contatosEmailRepository;

  @Override
  public List<ContatosEmail> getAll() {
    List<ContatosEmail> gettedAllEmails = contatosEmailRepository.findAll();
    return gettedAllEmails;
  }

  @Override
  public ContatosEmail getById(Long id) {
    ContatosEmail getOneEmailById = contatosEmailRepository.findById(id).orElse(null);
    return getOneEmailById;
  }

  @Override
  public ContatosEmail insertInDataBase(ContatosEmail myObj) {
    ContatosEmail inserttedEmailInDb = contatosEmailRepository.save(myObj);
    return inserttedEmailInDb;
  }

  @Override
  public void deleteRegisterById(Long id) {
    contatosEmailRepository.deleteById(id);
  
  
}

}
