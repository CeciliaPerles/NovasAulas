package entities;

import entities.enums.Color;

public class Retangle extends AbstractShape{

	private Double base;
	private Double altura;
		
	public Retangle(Color color, Double base, Double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

}
