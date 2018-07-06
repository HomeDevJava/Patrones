package FactoryPattern;

/*el patron fabrica devuelve un objeto atraves de un metodo publico,
 *  del mismo tipo que la Interfaz, en este caso Shape*/

public class ShapeFactory {

	public Shape getShape(String shapeTipo) {
		if (shapeTipo == null) {
			return null;
		}
		if (shapeTipo.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeTipo.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeTipo.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}

}
