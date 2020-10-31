package br.com.silo.backoffice.service;

import br.com.silo.backoffice.dao.EquipamentoDAO;
import br.com.silo.backoffice.dao.VeiculoDAO;
import br.com.silo.backoffice.domain.Equipamento;
import br.com.silo.backoffice.domain.Veiculo;
import br.com.silo.backoffice.domain.dto.EquipamentoDTO;
import br.com.silo.backoffice.domain.dto.VeiculoDTO;
import br.com.silo.backoffice.exception.BadRequestException;
import br.com.silo.backoffice.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import static br.com.silo.backoffice.service.EquipamentoService.*;

@Service(value = "veiculoService")
public class VeiculoService {
    @Autowired
    VeiculoDAO veiculoDAO;
    @Autowired
    EquipamentoDAO equipamentoDAO;
    @Autowired
    EquipamentoService equipamentoService;
    EquipamentoDTO equipamentoDTO;

    public Veiculo get(String placaVeiculo) {
        return veiculoDAO.findByUsername(placaVeiculo);
    }

    public Veiculo get(Long id) {
        Veiculo veiculo = veiculoDAO.findById(id).orElse(null);
        if (veiculo == null) {
            throw new NotFoundException();
        }
        return veiculo;
    }

    public Page<Veiculo> get(String placaVeiculo, Integer pageSize, Integer page) {
        Pageable paging = PageRequest.of(page, pageSize);

        return veiculoDAO.findPaged(placaVeiculo, paging);
    }

    public void saveVeiculo(VeiculoDTO veiculoDTO) {

        Boolean valid = isValidVeiculo(veiculoDTO.getPlacaVeiculo(), 0L);
        if (!valid) {
            throw new BadRequestException("Já existe um veículo com esta placa.");
        }

        Veiculo veiculo = new Veiculo();
        veiculo.setId(veiculoDTO.getId());
        veiculo.setPlacaVeiculo(veiculoDTO.getPlacaVeiculo());
        veiculo.setEmpresa(veiculoDTO.getEmpresa());
        veiculo.setModeloVeiculo(veiculoDTO.getModeloVeiculo());
        veiculo.setEquipamento(veiculoDTO.getEquipamento());
        veiculo.setNumeroLinha(veiculoDTO.getNumeroLinha());
        veiculo.setTotalLugares(veiculoDTO.getTotalLugares());
        veiculo.setLugaresSentado(veiculoDTO.getLugaresSentado());
        veiculo.setLugaresEmPe(veiculoDTO.getLugaresEmPe());

        veiculoDAO.save(veiculo);

        Equipamento equipamento = equipamentoDAO.findById(veiculoDTO.getEquipamento().getId()).orElse(null);

        updateEqptStatus(equipamento,"ATIVO");

    }

    public void updateVeiculo(VeiculoDTO veiculoDTO) {

        Boolean valid = isValidVeiculo(veiculoDTO.getPlacaVeiculo(), veiculoDTO.getId());
        if (!valid) {
            throw new BadRequestException("Já existe um veículo com esta placa");
        }

        Veiculo veiculo = veiculoDAO.findById(veiculoDTO.getId()).orElse(null);

        //Verifica se veiculo existe.
        if (veiculo == null) {
            throw new NotFoundException();
        }

        Equipamento oldEqpto = equipamentoDAO.findById(veiculo.getEquipamento().getId()).orElse(null);


        veiculo.setPlacaVeiculo(veiculoDTO.getPlacaVeiculo());

        veiculo.setPlacaVeiculo(veiculoDTO.getPlacaVeiculo());
        veiculo.setEmpresa(veiculoDTO.getEmpresa());
        veiculo.setModeloVeiculo(veiculoDTO.getModeloVeiculo());
        veiculo.setEquipamento(veiculoDTO.getEquipamento());
        veiculo.setNumeroLinha(veiculoDTO.getNumeroLinha());
        veiculo.setTotalLugares(veiculoDTO.getTotalLugares());
        veiculo.setLugaresSentado(veiculoDTO.getLugaresSentado());
        veiculo.setLugaresEmPe(veiculoDTO.getLugaresEmPe());

        veiculoDAO.save(veiculo);

        Equipamento newEqpto = equipamentoDAO.findById(veiculoDTO.getEquipamento().getId()).orElse(null);



        if ((newEqpto!=oldEqpto)&&(newEqpto!=null)&&(oldEqpto!=null)) {
            updateEqptStatus(oldEqpto,"INATIVO");
            updateEqptStatus(newEqpto,"ATIVO");
        } if ((newEqpto!=null)&&(oldEqpto==null)){
            updateEqptStatus(newEqpto,"ATIVO");
        } if ((newEqpto==null)&&(oldEqpto!=null)){
            updateEqptStatus(oldEqpto,"INATIVO");
        }

    }

    //Atualiza o status do equipamento
    public void updateEqptStatus(Equipamento equipamento,String status) {

        equipamentoDTO = EquipamentoDTO.converter(equipamento);
        equipamentoDTO.setStatusEquipamento(status);
        equipamentoService.updateEquipamento(equipamentoDTO);
    }


    public Boolean isValidVeiculo(String placaVeiculo, Long id) {
        Veiculo veiculo = veiculoDAO.findByUsername(placaVeiculo);

        if (veiculo == null)
            return true;

        if (id != 0) {
            return veiculo.getId().equals(id);
        } else {
            return false;
        }
    }

    public void deleteVeiculo(Long id) {
        Veiculo veiculo = veiculoDAO.findById(id).orElse(null);

        //Verifica se usuário existe.
        if (veiculo == null) {
            throw new NotFoundException();
        }

        Equipamento equipamento = equipamentoDAO.findById(veiculo.getEquipamento().getId()).orElse(null);

        updateEqptStatus(equipamento,"INATIVO");

        veiculoDAO.delete(veiculo);
    }
}
