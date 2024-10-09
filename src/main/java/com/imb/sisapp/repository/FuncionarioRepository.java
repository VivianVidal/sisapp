package com.imb.sisapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imb.sisapp.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
