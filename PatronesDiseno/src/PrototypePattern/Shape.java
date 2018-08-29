package PrototypePattern;

public interface Shape extends Cloneable {

	void draw();
	//Shape clonar();
	Shape clone() throws CloneNotSupportedException;
	
	
}
