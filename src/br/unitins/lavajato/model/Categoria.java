package br.unitins.lavajato.model;

public enum Categoria {
	
	CARRO(1, "Carro"), 
	SUV(2, "SUV"), 
	CAMINHONETE(3, "Caminhonete"), 
	MOTO(4, "Moto"), 
	CAMINHAO(5, "Caminh�o");
	
	private int value;
	private String label;
	
	Categoria(int value, String label) {
		this.value = value;
		this.label = label;
	}

	public int getValue() {
		return value;
	}

	public String getLabel() {
		return label;
	}

}
