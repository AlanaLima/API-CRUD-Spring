package br.alana.teste.repository;

import br.alana.teste.models.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    //    List<Transacao> findBycontaenviaIdOrcontarecebeId(Long id);
    @Query(value = "SELECT * FROM transacaotb WHERE Idcontaenvia= ?1", nativeQuery = true)
    List<Transacao> findBycontaenviaId(Long id);
    @Query(value = "SELECT * FROM transacaotb WHERE contarecebe= ?1", nativeQuery = true)
    List<Transacao> findBycontarecebe(Long conta);

}
