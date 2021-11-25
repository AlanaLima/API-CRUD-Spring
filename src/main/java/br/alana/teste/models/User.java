package br.alana.teste.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="userstb")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="iduser")
    private long iduser;
    @Column(name="nametb")
    private String name;
    @Column(name="agetb")
    private int age;
//Relação usuario endereco
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idenderecofk")
    private Endereco endereco;
    //Relação usuario conta
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcontafk")
    private Conta conta;
//    @OneToOne(mappedBy ="user" , cascade = CascadeType.ALL)
//    private Conta conta;
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Conta>contas;


    public long getIduser() {
        return iduser;
    }

    public void setIduser(long iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
