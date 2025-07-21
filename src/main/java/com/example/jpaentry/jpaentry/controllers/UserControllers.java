package com.example.jpaentry.jpaentry.controllers;

import com.example.jpaentry.jpaentry.entity.Users;
import com.example.jpaentry.jpaentry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserControllers {
    @Autowired UserRepository users;


    @GetMapping("/started")
public String healthcheck(){

    return "Stared successfully";
}




    @GetMapping("/getusers")
    public List<Users> allusers() {
        return users.findAll();
    }

    @PostMapping("/uploddata")
    public String uploaddata(@RequestBody Users user){

        users.save(user);
        return "Data is saved in db ";
    }


    @PutMapping("/replacedata")
    public String replaceData(@RequestBody Users user) {
        if (users.existsById(user.getId())) {
            users.save(user);
            return "User data Updated";
        } else {
            return "User not found with this id  " + user.getId();
        }




    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        if (users.existsById(id)) {
            users.deleteById(id);
            return "User with id " + id + "  is deleted success";
        } else {
            return "User not found with " + id;
        }
    }






}
