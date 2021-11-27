package br.alana.teste.controllers;

import br.alana.teste.models.Transacao;
import br.alana.teste.services.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/extrato")
public class ExtratoController {
    @Autowired
    private MovimentacaoService movimentacaoservice;
    //    @RequestMapping(method = RequestMethod.GET, value = "/extrato/{id}")
//    public List<Transacao> Extrato(@PathVariable Long id){
//        return movimentacaoservice.PegarTransacoesConta(id);
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/debito/{id}")
    public List<Transacao> Debitos(@PathVariable Long id){
        return movimentacaoservice.PegarTransacoesContaDebito(id);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/credito/{id}")
    public List<Transacao> Creditos(@PathVariable Long id){
        return movimentacaoservice.PegarTransacoesContaCredito(id);
    }
}
