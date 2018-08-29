package PrototypePattern;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Rectangle r= new Rectangle();
		r.setId("1");
		r.draw();
		
		//Rectangle r2=(Rectangle) r.clonar();
		Rectangle r2= (Rectangle) r.clone();
		r2.draw();
		
		
		Shape rr= new Circle();		
		rr.draw();
		
		
		
		boolean igual= r == r2;
		System.out.println(igual);
		
		System.out.println(r.toString());
		System.out.println(r2.toString());

	}

}
