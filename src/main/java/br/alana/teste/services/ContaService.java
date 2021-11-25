package br.alana.teste.services;


import br.alana.teste.models.Conta;
import br.alana.teste.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    public Conta salvar(Conta conta) {
        return contaRepository.save(conta);
    }

    public List<Conta> listar() {
        return contaRepository.findAll();
    }

    public Conta listarporId(long idconta){
        Optional<Conta> conta = contaRepository.findById(idconta);
        return conta.get();
    }

    public void alterar ( long idconta,Conta conta){
        contaRepository.findById(idconta);
        conta.setIdconta(idconta);
        contaRepository.save(conta);
    }
    public void deletar(long idconta){
        contaRepository.deleteById(idconta);

    }


}
