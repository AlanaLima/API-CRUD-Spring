package br.alana.teste.services;

import br.alana.teste.models.Conta;
import br.alana.teste.models.Transacao;
import br.alana.teste.models.User;
import br.alana.teste.repository.ContaRepository;
import br.alana.teste.repository.TransacaoRepository;
import br.alana.teste.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {
    @Autowired
    private ContaService contaservice;

    @Autowired
    private TransacaoRepository transacaorepository;

    @Autowired
    private ContaRepository contaRepository;

    @Transactional
    public void Transferir(Transacao transacao) {
        Conta contaenvia = contaservice.listarporId((transacao.getIdcontaenvia()));
        Conta contarecebedora=contaRepository.findByConta(transacao.getContarecebe());

        contaenvia.setSaldo(contaenvia.getSaldo() - (transacao.getValor()));
        contarecebedora.setSaldo(contarecebedora.getSaldo() + (transacao.getValor()));
    }

    public List<Transacao> PegarTransacoesContaDebito(Long idconta){
        return transacaorepository.findBycontaenviaId(idconta);
    }
    public List<Transacao> PegarTransacoesContaCredito(Long idconta){
        Conta contarecebedora=contaservice.listarporId(idconta);
        return transacaorepository.findBycontarecebe(contarecebedora.getNconta());
    }
}






