package com.robertim.pontointeligente.api.repositories;

import com.robertim.pontointeligente.api.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@org.springframework.stereotype.Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
    Funcionario findByCpf(String cpf);

    Funcionario findByEmail(String email);

    Funcionario findByCpfOrEmail(String cpf,String email);

}
