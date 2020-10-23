package br.com.silo.backoffice.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "historico")
public class Historico {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    Equipamento equipamento;

    @ManyToOne
    @JoinColumn(nullable = false)
    Veiculo veiculo;

    @Column(nullable = false)
    Date datahora;

    @Column(nullable = false)
    Long qtdPassageiros;

    @Column(nullable = false)
    String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

    public Long getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(Long qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
