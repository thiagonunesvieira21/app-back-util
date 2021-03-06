package br.com.util.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * AcessoFuncionalidade generated by hbm2java
 */
@Entity
@Table(name = "acesso_funcionalidade", schema = "suporte")
public class AcessoFuncionalidade implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idFuncionalidade;
	private String descFuncionalidade;
	private Set<AcessoGrupoFuncionalidade> acessoGrupoFuncionalidades = new HashSet<AcessoGrupoFuncionalidade>();
	private String role;

	public AcessoFuncionalidade() {
	}

	public AcessoFuncionalidade(int idFuncionalidade, String descFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
		this.descFuncionalidade = descFuncionalidade;
	}

	public AcessoFuncionalidade(int idFuncionalidade, String descFuncionalidade,
			Set<AcessoGrupoFuncionalidade> acessoGrupoFuncionalidades) {
		this.idFuncionalidade = idFuncionalidade;
		this.descFuncionalidade = descFuncionalidade;
		this.acessoGrupoFuncionalidades = acessoGrupoFuncionalidades;
	}

	@Id
	@Column(name = "nu_funcionalidade", unique = true, nullable = false, precision = 6, scale = 0)
	public Integer getIdFuncionalidade() {
		return this.idFuncionalidade;
	}

	public void setIdFuncionalidade(Integer idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}

	@Column(name = "de_funcionalidade", nullable = false, length = 60)
	public String getDescFuncionalidade() {
		return this.descFuncionalidade;
	}

	public void setDescFuncionalidade(String descFuncionalidade) {
		this.descFuncionalidade = descFuncionalidade;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "acessoFuncionalidade")
	public Set<AcessoGrupoFuncionalidade> getAcessoGrupoFuncionalidades() {
		return this.acessoGrupoFuncionalidades;
	}

	public void setAcessoGrupoFuncionalidades(Set<AcessoGrupoFuncionalidade> acessoGrupoFuncionalidades) {
		this.acessoGrupoFuncionalidades = acessoGrupoFuncionalidades;
	}
	
	@Column(name = "de_role", nullable = false)
	@NotNull
	@NotEmpty
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
