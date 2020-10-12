package br.com.silo.backoffice.domain.dto;

import br.com.silo.backoffice.domain.Empresa;
import br.com.silo.backoffice.domain.Veiculo;

public class VeiculoDTO {

    Long id;

    String modeloVeiculo;

    String placaVeiculo;

    Empresa empresa;

    String codEquipamento;

    String numeroLinha;

    Long totalLugares;

    Long lugaresSentado;

    Long lugaresEmPe;

    public static VeiculoDTO converter(Veiculo veiculo) {
        VeiculoDTO veiculoDTO = new VeiculoDTO();
        veiculoDTO.setModeloVeiculo(veiculo.getModeloVeiculo());
        veiculoDTO.setPlacaVeiculo(veiculo.getPlacaVeiculo());
        veiculoDTO.setEmpresa(veiculo.getEmpresa());
        veiculoDTO.setId(veiculo.getId());
        veiculoDTO.setCodEquipamento(veiculo.getCodEquipamento());
        veiculoDTO.setNumeroLinha(veiculo.getNumeroLinha());
        veiculoDTO.setTotalLugares(veiculo.getTotalLugares());
        veiculoDTO.setLugaresSentado(veiculo.getLugaresSentado());
        veiculoDTO.setLugaresEmPe(veiculo.getLugaresEmPe());
        return veiculoDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(String codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public String getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(String numeroLinha) {
        this.numeroLinha = numeroLinha;
    }

    public Long getTotalLugares() {
        return totalLugares;
    }

    public void setTotalLugares(Long totalLugares) {
        this.totalLugares = totalLugares;
    }

    public Long getLugaresSentado() {
        return lugaresSentado;
    }

    public void setLugaresSentado(Long lugaresSentado) {
        this.lugaresSentado = lugaresSentado;
    }

    public Long getLugaresEmPe() {
        return lugaresEmPe;
    }

    public void setLugaresEmPe(Long lugaresEmPe) {
        this.lugaresEmPe = lugaresEmPe;
    }
}
