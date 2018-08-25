package com.brunno.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunno.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {

}
