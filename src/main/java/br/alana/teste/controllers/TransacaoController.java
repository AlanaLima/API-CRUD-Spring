package br.alana.teste.controllers;



import br.alana.teste.models.Transacao;
import br.alana.teste.services.ContaService;
import br.alana.teste.services.MovimentacaoService;
import br.alana.teste.services.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoservice;
    @Autowired
    private MovimentacaoService movimentacaoservice;
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<Transacao> showAll(){

        return transacaoservice.listar();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Transacao showone(@PathVariable long id){
        return transacaoservice.listarporId(id);
    }

//    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
//    public void deleteone(@PathVariable long id){
//        transacaoservice.deletar(id);
//
//    }
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public void create (@RequestBody Transacao transacao){
            transacaoservice.salvar(transacao);
            movimentacaoservice.Transferir(transacao);
    }
//    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
//    public void update (@PathVariable long id, @RequestBody Transacao transacao){
//
//        transacaoservice.alterar(id,transacao);
//    }
}
