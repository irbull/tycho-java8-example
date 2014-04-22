package org.example.gumball;

public class GumBall {
	public enum Color {
		RED, GREEN, BLUE
	};

	private final Color color;

	public GumBall(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
