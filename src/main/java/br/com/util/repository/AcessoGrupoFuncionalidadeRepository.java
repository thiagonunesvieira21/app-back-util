package br.com.util.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.util.entity.AcessoGrupoFuncionalidade;
import br.com.util.entity.AcessoGrupoFuncionalidadeId;

public interface AcessoGrupoFuncionalidadeRepository extends JpaRepository<AcessoGrupoFuncionalidade, AcessoGrupoFuncionalidadeId> {
	
}
