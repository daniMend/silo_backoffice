package br.com.silo.backoffice.controller;

import br.com.silo.backoffice.domain.Empresa;
import br.com.silo.backoffice.domain.dto.EmpresaDTO;
import br.com.silo.backoffice.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Page<Empresa> getEmpresa(@RequestParam String empresaNome, @RequestParam Integer pageSize, @RequestParam Integer page) {
        System.out.println(empresaNome);
        return empresaService.get(empresaNome, pageSize, page);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public EmpresaDTO getUserByID(@PathVariable Long id) {
        return EmpresaDTO.converter(empresaService.get(id));
    }


}
