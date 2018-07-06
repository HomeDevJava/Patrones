package PrototypePattern;

public class App {

	public static void main(String[] args) {
		
		Rectangle r= new Rectangle();
		r.setId("1");
		
		Rectangle r2=(Rectangle) r.clonar();
		
		r.draw();
		
		r2.draw();
		
		boolean igual= r == r2;
		System.out.println(igual);
		
		System.out.println(r.toString());
		System.out.println(r2.toString());

	}

}
