package com.oficina.oficina.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oficina.oficina.Model.Contatos;
import com.oficina.oficina.Service.ContatosService;

@RestController
@RequestMapping("/contatos")
public class ContatosController implements InterfaceController<Contatos>{

  @Autowired
  private ContatosService contatosService;

  @Override
  @GetMapping("/")
  public ResponseEntity<List<Contatos>> getAll() {
    List<Contatos> gettedAllContactInformation = contatosService.getAll();
    return new ResponseEntity<List<Contatos>>(gettedAllContactInformation,HttpStatus.OK);
  }
  
  @GetMapping("getall/")
  public ResponseEntity<List<Contatos>> getAllOfThisTable(){
    List<Contatos> contacts = contatosService.getAllForThisTable();
    return new ResponseEntity<List<Contatos>>(contacts,HttpStatus.OK);
  }
  
  @Override
  @PostMapping("/")
  public ResponseEntity<Contatos> insertIn(@RequestBody Contatos obj) {
    Contatos inserttedContact = contatosService.insertInDataBase(obj);
    return new ResponseEntity<Contatos>(inserttedContact,HttpStatus.OK);
  }


  
}
