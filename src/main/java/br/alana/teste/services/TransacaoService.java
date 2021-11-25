package br.alana.teste.services;


import br.alana.teste.models.Conta;
import br.alana.teste.models.Transacao;
import br.alana.teste.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    public Transacao salvar(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public List<Transacao> listar() {
        return transacaoRepository.findAll();
    }

    public Transacao listarporId(long idtransacao){
        Optional<Transacao> transacao = transacaoRepository.findById(idtransacao);
        return transacao.get();
    }

    public void alterar ( long idtransacao,Transacao transacao){
        transacaoRepository.findById(idtransacao);
        transacao.setIdtransacao(idtransacao);
        transacaoRepository.save(transacao);
    }
    public void deletar(long idtransacao){
        transacaoRepository.deleteById(idtransacao);

    }

}
