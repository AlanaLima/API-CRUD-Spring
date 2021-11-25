package br.alana.teste.controllers;

import br.alana.teste.models.User;
import br.alana.teste.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userservice;
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<User> showAll(){

        return userservice.listar();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public User showone(@PathVariable long id){
        return userservice.listarporId(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteone(@PathVariable long id){
         userservice.deletar(id);

    }
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public User create (@RequestBody User user){

        return userservice.salvar(user);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void update (@PathVariable long id, @RequestBody User user){

        userservice.alterar(id,user);
    }

    }

