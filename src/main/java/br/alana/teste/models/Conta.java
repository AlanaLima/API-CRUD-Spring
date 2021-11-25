package br.alana.teste.models;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="contatb")
public class Conta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idconta")
    private long idconta;
    @Column(name="agencia")
    private String agencia;
    @Column(name="saldo")
    private Double saldo;

    //Relaçoes conta usuario

    @OneToOne(mappedBy ="conta")
    private User user;

    public long getIdconta() {
        return idconta;
    }

    public void setIdconta(long idconta) {
        this.idconta = idconta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
