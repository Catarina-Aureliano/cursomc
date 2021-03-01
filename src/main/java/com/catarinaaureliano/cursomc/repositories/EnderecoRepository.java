package com.catarinaaureliano.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catarinaaureliano.cursomc.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}

//esta é a operação de acesso a dados referente ao objeto endereco
// objeto da camada de acesso a dados referete ao tipo endereco