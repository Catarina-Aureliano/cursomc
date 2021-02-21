package com.catarinaaureliano.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catarinaaureliano.cursomc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}

//esta é a operação de acesso a dados referente ao objeto cidade
// objeto da camada de acesso a dados referente ao tipo cidade