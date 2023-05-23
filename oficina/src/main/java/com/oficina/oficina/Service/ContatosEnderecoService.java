package com.oficina.oficina.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.oficina.Model.ContatosEndereco;
import com.oficina.oficina.Repository.ContatosEnderecoRepository;

@Service
public class ContatosEnderecoService  implements InterfaceService<ContatosEndereco>{

  @Autowired
  private ContatosEnderecoRepository contatosEnderecoRepository;

  @Override
  public List<ContatosEndereco> getAll() {
    List<ContatosEndereco> enderecoGetAll = contatosEnderecoRepository.findAll();
    return enderecoGetAll;
  }

  @Override
  public ContatosEndereco getById(Long id) {
    ContatosEndereco getEnderecoById = contatosEnderecoRepository.findById(id).orElse(null);
    return getEnderecoById;
  }

  @Override
  public ContatosEndereco insertInDataBase(ContatosEndereco myObj) {
    ContatosEndereco inserttedEnderecoInDb = contatosEnderecoRepository.save(myObj);
    return inserttedEnderecoInDb;
  }

  @Override
  public void deleteRegisterById(Long id) {
    contatosEnderecoRepository.deleteById(id);
  }
  
}
