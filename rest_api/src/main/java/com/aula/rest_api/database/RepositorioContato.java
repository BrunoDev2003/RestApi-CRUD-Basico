package com.aula.rest_api.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.rest_api.entidade.Contato;

public interface RepositorioContato  extends JpaRepository<Contato,Long>{

    void save(com.aula.rest_api.Contato contato);
    
}
