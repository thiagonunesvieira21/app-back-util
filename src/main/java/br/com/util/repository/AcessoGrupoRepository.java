package br.com.util.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.util.entity.AcessoGrupo;

public interface AcessoGrupoRepository extends JpaRepository<AcessoGrupo, Integer>{
	
	public List<AcessoGrupo> findByNuGrupoPai(Integer id);
	
}
