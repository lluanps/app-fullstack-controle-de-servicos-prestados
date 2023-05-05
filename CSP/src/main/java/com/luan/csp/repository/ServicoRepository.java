package com.luan.csp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luan.csp.model.Cliente;
import com.luan.csp.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer>{

}
