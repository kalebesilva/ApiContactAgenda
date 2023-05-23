package com.oficina.oficina.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.oficina.Model.User;
import com.oficina.oficina.Repository.UserRepository;

@Service
public class UserService implements InterfaceService<User> {

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getAll() {
    List<User> myUserList = userRepository.findAll();
    return myUserList;
  }

  @Override
  public User getById(Long id) {
    User gettedUserById = userRepository.findById(id).orElse(null);
    return gettedUserById;
  }

  @Override
  public User insertInDataBase(User myObj) {
    User inserttedUserInDb = userRepository.save(myObj);
    return inserttedUserInDb;
  }

  @Override
  public void deleteRegisterById(Long id) {
    userRepository.deleteById(id);
  }
  
}
