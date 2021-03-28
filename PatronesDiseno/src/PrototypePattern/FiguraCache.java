package PrototypePattern;

import java.util.Hashtable;

public class FiguraCache {
	private static Hashtable<String, Figura> figuraMap= new  Hashtable<>();
	
	public static Figura getShape(String shapeId) {
		Figura cacheSahpe= figuraMap.get(shapeId);
		return   (Figura) cacheSahpe.clone();
	}
	
	public static void loadCache() {
		Circle circle= new Circle();
		circle.setId("1");
		figuraMap.put(circle.getId(), circle);
		
		Rectangle rectangle= new Rectangle();
		rectangle.setId("2");
		figuraMap.put(rectangle.getId(), rectangle);
		
		
	}
}
