package br.unitins.lavajato.model;

public enum Categoria {

	CARRO(1, "Carro"), SUV(2, "SUV"), CAMINHONETE(3, "cAminhonete"), MOTO(4, "Moto"), CAMINHAO(5, "Caminhão");

	private Categoria(int value, String label) {
		this.value = value;
		this.label = label;
	}

	private int value;
	private String label;

	public int getValue() {
		return value;
	}

	public String getLabel() {
		return label;
	}

}
