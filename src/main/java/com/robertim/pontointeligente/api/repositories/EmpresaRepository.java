package com.robertim.pontointeligente.api.repositories;

import com.robertim.pontointeligente.api.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    @Transactional(readOnly = true)
    Empresa findByCnpj(String cnpj);

}
