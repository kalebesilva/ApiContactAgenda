package com.oficina.oficina.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface InterfaceController<MyObj> {

  public ResponseEntity<List<MyObj>> getAll();
  public ResponseEntity<MyObj> insertIn (MyObj obj);
  
}
