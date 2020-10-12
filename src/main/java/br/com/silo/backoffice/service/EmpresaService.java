package br.com.silo.backoffice.service;

import br.com.silo.backoffice.dao.EmpresaDAO;
import br.com.silo.backoffice.domain.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service(value = "empresaService")
public class EmpresaService {
    @Autowired
    EmpresaDAO empresaDAO;

    public Empresa get(String empresaNome) {
        return empresaDAO.findByNome(empresaNome);
    }

    public Empresa get(Long id) {
        Empresa empresa = empresaDAO.findById(id).orElse(null);
        if (empresa == null) {
            throw new UsernameNotFoundException("Empresa não foi encontrada.");
        }
        return empresa;
    }

    public Page<Empresa> get(String empresaNome, Integer pageSize, Integer page) {
        Pageable paging = PageRequest.of(page, pageSize);

        return empresaDAO.findPaged(empresaNome, paging);
    }
}
