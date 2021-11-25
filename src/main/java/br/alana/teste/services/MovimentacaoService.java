package br.alana.teste.services;

import br.alana.teste.models.Conta;
import br.alana.teste.models.Transacao;
import br.alana.teste.repository.ContaRepository;
import br.alana.teste.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {
    @Autowired
    private ContaRepository contaRepository;
    @Autowired
    private TransacaoService transacaoservice;
    @Transactional
    public void Transferir(Transacao transacao){
        //achar conta envia pelos ids
        Optional<Conta> contaenvia=contaRepository.findById((transacao.getIdcontaenvia()));
        Conta contarecebedora=contaRepository.findById((transacao.getIdcontarecebe()));
        //fazer a transferencia
        contaenvia.setSaldo(contaenvia.getSaldo()-(transacao.getValor()));
        contarecebedora.setSaldo(contarecebedora.getSaldo()+(transacao.getValor()));

    }

    //metodo para na hora que dar o get pegar as transacoes tb da conta
    //get um por id, vem uma conta, vamos fazer esse por enquanto
//    public void PegarTransacoesConta(Conta conta){
//        Long idconta=conta.getIdconta();
//        //ver todas transacoes Loop por ele tudo
//        transacaoservice.listar();
        }
        //Se
        //transacoes com idcontaenvia igual a id conta
        //retorna essas transacoes como debito
        //Se transacoes com idcontarecebedora igual a id conta
        //retorna essas transacoes como credito
//        if(idconta== transacao.getIdcontaenvia()){
//            return transacao;
//        }
//        if(idconta== transacao.getIdcontaenvia()){
//            return transacao;
//        }

    }
}
