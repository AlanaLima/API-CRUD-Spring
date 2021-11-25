package br.alana.teste.services;

import br.alana.teste.models.Endereco;
import br.alana.teste.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> listar() {
        return enderecoRepository.findAll();
    }

    public Endereco listarporId(long idendereco){
        Optional<Endereco> endereco = enderecoRepository.findById(idendereco);
        return endereco.get();
    }

    public void alterar ( long idendereco,Endereco endereco){
        enderecoRepository.findById(idendereco);
        endereco.setIdendereco(idendereco);
        enderecoRepository.save(endereco);
    }
    public void deletar(long idendereco){
        enderecoRepository.deleteById(idendereco);

    }
}
