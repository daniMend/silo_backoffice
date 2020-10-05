package br.com.silo.backoffice.domain;

import javax.persistence.*;

@Entity
@Table(name = "equipamento")
public class Equipamento {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String cod_equipamento;

    @Column(nullable = false)
    String descricaoEquipamento;

    @Column(nullable = false)
    String statusEquipamento;

    @Column
    String empresa;

    @Column
    Long empresaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodEquipamento() {
        return cod_equipamento;
    }

    public void setCodEquipamento(String codEquipamento) {
        this.cod_equipamento = codEquipamento;
    }

    public String getDescricaoEquipamento() {
        return descricaoEquipamento;
    }

    public void setDescricaoEquipamento(String descricaoEquipamento) {
        this.descricaoEquipamento = descricaoEquipamento;
    }

    public String getStatusEquipamento() {
        return statusEquipamento;
    }

    public void setStatusEquipamento(String statusEquipamento) {
        this.statusEquipamento = statusEquipamento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Long getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Long empresaId) {
        this.empresaId = empresaId;
    }
    }
