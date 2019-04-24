package br.unitins.lavajato.model;

public enum Marca {

	VOLKSWAGEN(1, "Volkswagen"), HONDA(2, "Honda");

	private Marca(int value, String label) {
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
