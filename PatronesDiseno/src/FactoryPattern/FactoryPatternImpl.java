package FactoryPattern;

public class FactoryPatternImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory fabrica= new ShapeFactory();
		
		Shape shape1= fabrica.getShape("CIRCLE");
		Shape shape2= fabrica.getShape("SQUARE");
		Shape shape3= fabrica.getShape("RECTANGLE");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
	}

}
