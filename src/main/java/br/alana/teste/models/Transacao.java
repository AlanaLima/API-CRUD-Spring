package br.alana.teste.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="transacaotb")
public class Transacao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idtransacao")
    private long idtransacao;

    @Column(name="valor")
    private Double valor;

    @Column(name="idcontaenvia")
    private Long Idcontaenvia;

    @Column(name="contarecebe")
    private Long contarecebe;

//    @Column(name="idcontarecebe")
//    private Long Idcontarecebe;


    public long getIdtransacao() {
        return idtransacao;
    }

    public void setIdtransacao(long idtransacao) {
        this.idtransacao = idtransacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Long getIdcontaenvia() {
        return Idcontaenvia;
    }

    public void setIdcontaenvia(Long idcontaenvia) {
        Idcontaenvia = idcontaenvia;
    }

    public Long getContarecebe() {
        return contarecebe;
    }

    public void setContarecebe(Long contarecebe) {
        this.contarecebe = contarecebe;
    }
}
