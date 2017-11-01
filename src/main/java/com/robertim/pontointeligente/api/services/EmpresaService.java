package com.robertim.pontointeligente.api.services;

import com.robertim.pontointeligente.api.entities.Empresa;

import java.util.Optional;


public interface EmpresaService {

    // retorna uma empresa pelo CNPJ
    Optional<Empresa> buscaPorCnpj(String cnpj);

    // cadastra uma nova empresa no banco de dados
    Empresa persistir(Empresa empresa);

}
