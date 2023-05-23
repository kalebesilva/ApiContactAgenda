package com.oficina.oficina.Service;

import java.util.List;

public interface InterfaceService<Obj> {

  public List<Obj> getAll();
  public Obj getById(Long id);
  public Obj insertInDataBase(Obj myObj);
  public void deleteRegisterById(Long id);




  
}
