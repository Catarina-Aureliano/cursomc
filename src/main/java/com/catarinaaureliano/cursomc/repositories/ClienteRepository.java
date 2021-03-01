package com.catarinaaureliano.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catarinaaureliano.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}

//esta é a operação de acesso a dados referente ao objeto cliente
// objeto da camada de acesso a dados referete ao tipo cliente