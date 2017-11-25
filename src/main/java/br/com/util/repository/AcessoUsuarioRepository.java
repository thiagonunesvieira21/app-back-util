package br.com.util.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.util.entity.AcessoUsuario;

public interface AcessoUsuarioRepository extends JpaRepository<AcessoUsuario, Integer>{
	
	AcessoUsuario findByDeLogin(String login);
}
