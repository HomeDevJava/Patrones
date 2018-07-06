package SingletonPattern;

public class SingleObject {

	//1.-se declara una propiedad del mismo tipo que la clase
	//private static SingleObject instance = new SingleObject();
	private static SingleObject instance;
	
	//2.-el constructor debe ser private
	private SingleObject() {
		super();
	}

	//3.-se declara un getter estatico para instanciar o obtener la instancia si ya fue creada
	public static SingleObject getInstance() {
		if(instance == null)
			instance= new SingleObject();
		return instance;
	}
	
	public void showMessaage() {
		System.out.println("Hello World!");
	}

}
