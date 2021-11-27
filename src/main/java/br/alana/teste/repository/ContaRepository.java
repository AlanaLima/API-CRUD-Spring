package br.alana.teste.repository;

import br.alana.teste.models.Conta;
import br.alana.teste.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.LockModeType;
import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
    @Query(value = "SELECT * FROM contatb WHERE conta = ?1", nativeQuery = true)
    Conta findByConta(Long conta);
}
