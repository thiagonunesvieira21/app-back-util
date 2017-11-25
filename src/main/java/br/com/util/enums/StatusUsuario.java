package br.com.util.enums;

public enum StatusUsuario {
	
	ATIVO(1);
	
	private final int value;
	
	private StatusUsuario(int value) {
		this.value = value;
	}
	
	public int value() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return Integer.toString(value);
	}

}
