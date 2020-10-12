package br.com.silo.backoffice.domain.dto;

import br.com.silo.backoffice.domain.Empresa;
import br.com.silo.backoffice.domain.Equipamento;


public class EquipamentoDTO {

    Long id;

    String codEquipamento;

    String descricaoEquipamento;

    String statusEquipamento;

    Empresa empresa;

    Long empresaId;

    public static EquipamentoDTO converter(Equipamento equipamento) {
        EquipamentoDTO equipamentoDTO = new EquipamentoDTO();
        equipamentoDTO.setId(equipamento.getId());
        equipamentoDTO.setCodEquipamento(equipamento.getCodEquipamento());
        equipamentoDTO.setDescricaoEquipamento(equipamento.getDescricaoEquipamento());
        equipamentoDTO.setStatusEquipamento(equipamento.getStatusEquipamento());
        equipamentoDTO.setEmpresa(equipamento.getEmpresa());
        return equipamentoDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(String codEquipamento) {
        this.codEquipamento = codEquipamento;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    }
