package br.com.util.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AcessoGrupoFuncionalidadeId generated by hbm2java
 */
@Embeddable
public class AcessoGrupoFuncionalidadeId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int idGrupo;
	private int idFuncionalidade;

	public AcessoGrupoFuncionalidadeId() {
	}

	public AcessoGrupoFuncionalidadeId(int idGrupo, int idFuncionalidade) {
		this.idGrupo = idGrupo;
		this.idFuncionalidade = idFuncionalidade;
	}

	@Column(name = "nu_grupo", nullable = false, precision = 6, scale = 0)
	public int getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Column(name = "nu_funcionalidade", nullable = false, precision = 6, scale = 0)
	public int getIdFuncionalidade() {
		return this.idFuncionalidade;
	}

	public void setIdFuncionalidade(int idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AcessoGrupoFuncionalidadeId))
			return false;
		AcessoGrupoFuncionalidadeId castOther = (AcessoGrupoFuncionalidadeId) other;

		return (this.getIdGrupo() == castOther.getIdGrupo())
				&& (this.getIdFuncionalidade() == castOther.getIdFuncionalidade());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdGrupo();
		result = 37 * result + this.getIdFuncionalidade();
		return result;
	}

}