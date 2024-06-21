package com.example.SpringAPI.Service;

import com.example.SpringAPI.Model.User;
import com.example.SpringAPI.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
     @Autowired
     private UserRepo userRepo;

     public List<User> getAll(){
         return userRepo.findAll();
     }

     public User get(int id){
          return userRepo.findById(id).orElseThrow(() -> new UserNotFoundException(id));
     }

     public User createUser(User user){
          if (user.getfName() == null || user.getlName() == null
                  || user.getDateOfBirth() == null || user.getEmail() == null
                  || user.getPhoneNumber()== null) {
               throw new UserBadRequestException();
          }
          else {
               userRepo.save(user);
               return user;
          }

     }

     public User updateUser(int id,User user){
          User updatedUser = userRepo.findById(id)
                  .orElseThrow(() -> new UserNotFoundException(id));
          if (user.getfName() == null || user.getlName() == null
          || user.getDateOfBirth() == null || user.getEmail() == null
          || user.getPhoneNumber()== null) {
               throw new UserBadRequestException();
          }
          else {
          updatedUser.setfName(user.getfName());
          updatedUser.setlName(user.getlName());
          updatedUser.setDateOfBirth(user.getDateOfBirth());
          updatedUser.setEmail(user.getEmail());
          updatedUser.setPhoneNumber(user.getPhoneNumber());
          userRepo.save(updatedUser);
          return updatedUser;
          }
     }

     public User deleteUser(int id){
          User user = userRepo.findById(id)
                  .orElseThrow(() -> new UserNotFoundException(id));
          userRepo.deleteById(id);
          return user;
     }

}
