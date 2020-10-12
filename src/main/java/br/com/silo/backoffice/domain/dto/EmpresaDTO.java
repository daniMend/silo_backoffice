package br.com.silo.backoffice.domain.dto;

import br.com.silo.backoffice.domain.Empresa;

public class EmpresaDTO {

    Long id;

    String empresaNome;

    public static EmpresaDTO converter(Empresa empresa) {
        EmpresaDTO empresaDTO = new EmpresaDTO();
        empresaDTO.setId(empresaDTO.getId());
        empresaDTO.setEmpresaNome(empresa.getEmpresa_nome());
        return empresaDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresaNome() {
        return empresaNome;
    }

    public void setEmpresaNome(String empresa) {
        this.empresaNome = empresa;
    }
}
