package com.libertas.cadastro_veiculo_spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertas.cadastro_veiculo_spring.pojo.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}
