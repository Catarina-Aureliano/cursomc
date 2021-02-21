package com.catarinaaureliano.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catarinaaureliano.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}

//esta é a operação de acesso a dados referente ao objeto estado
// objeto da camada de acesso a dados referente ao tipo estado