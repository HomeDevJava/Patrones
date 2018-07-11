package FacadePattern;

public class ShapeFacade {
	
	private Shape circulo;
	private Shape rectangulo;

	public ShapeFacade() {
		circulo= new Circle();
		rectangulo= new Rectangle();
	}
	
	public void drawCircle() {
		circulo.draw();
	}
	
	public void drawRectangle() {
		rectangulo.draw();
	}

}
