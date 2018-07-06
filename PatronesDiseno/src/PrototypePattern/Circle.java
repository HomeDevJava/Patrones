package PrototypePattern;

public class Circle extends Figura {

	public Circle() {
		type="Rectangle";
	}
	
	public void draw() {
		System.out.println("Adentro del Circulo:: metodo draw()");
	}
}
