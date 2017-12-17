package com.vin.core.lambda;

public class Apple {

	private Color  color;
	
	public Apple(Color color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	
	
	
	public Apple(Integer weight) {
		super();
		this.weight = weight;
	}




	public Apple() {
		super();
	}

	private Integer	weight;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Color:"+color+", Weight:"+weight+"]\n";
	}
	
}
