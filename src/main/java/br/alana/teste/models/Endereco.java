package br.alana.teste.models;

import javax.persistence.*;

@Entity
@Table(name="enderecotb")
public class Endereco {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idendereco")
    private long idendereco;

    @Column(name="rua")
    private String rua;
    @Column(name="numero")
    private int numero;

    @OneToOne(mappedBy= "endereco")
    private User user;

    public long getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(long idendereco) {
        this.idendereco = idendereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
