package br.com.silo.backoffice.dao;

import br.com.silo.backoffice.domain.Empresa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaDAO extends PagingAndSortingRepository<Empresa, Long> {

    @Query(nativeQuery = true, value = "SELECT m FROM empresa m WHERE m.empresa_nome = ?1")
    Empresa findByNome(String empresaNome);

    @Query(nativeQuery = true, value = "SELECT * FROM empresa WHERE empresa_nome LIKE concat('%', ?1,'%')")
    Page<Empresa> findPaged(String empresaNome, Pageable pageable);
}
