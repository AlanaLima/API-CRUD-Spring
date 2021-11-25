package br.alana.teste.controllers;


import br.alana.teste.models.Conta;
import br.alana.teste.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contas")
public class ContaController {
    @Autowired
    private ContaService contaservice;
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<Conta> showAll(){

        return contaservice.listar();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Conta showone(@PathVariable long id){
        return contaservice.listarporId(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteone(@PathVariable long id){
        contaservice.deletar(id);

    }
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Conta create (@RequestBody Conta conta){

        return contaservice.salvar(conta);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void update (@PathVariable long id, @RequestBody Conta conta){

        contaservice.alterar(id,conta);
    }
}
