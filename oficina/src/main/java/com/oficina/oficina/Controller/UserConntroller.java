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

import com.oficina.oficina.Model.User;
import com.oficina.oficina.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserConntroller implements InterfaceController<User> {

  @Autowired
  private UserService userService;

  @Override
  @GetMapping("/")
  public ResponseEntity<List<User>> getAll() {
    
    List<User> usersGetAll = userService.getAll();
    return new ResponseEntity<List<User>>(usersGetAll, HttpStatus.OK);
  }

  @Override
  @PostMapping("/")
  public ResponseEntity<User> insertIn(@RequestBody User obj) {

    User insertedDb = userService.insertInDataBase(obj);
    return new ResponseEntity<User>(insertedDb, HttpStatus.OK);
    
  }
  
}
