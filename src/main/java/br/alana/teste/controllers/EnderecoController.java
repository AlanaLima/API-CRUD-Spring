package br.alana.teste.controllers;



import br.alana.teste.models.Endereco;
import br.alana.teste.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoservice;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<Endereco> showAll(){
        return enderecoservice.listar();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Endereco showone(@PathVariable long id){
        return enderecoservice.listarporId(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteone(@PathVariable long id){
        enderecoservice.deletar(id);

    }
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Endereco create (@RequestBody Endereco endereco){

        return enderecoservice.salvar(endereco);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void update (@PathVariable long id, @RequestBody Endereco endereco){
        enderecoservice.alterar(id,endereco);
    }
}
