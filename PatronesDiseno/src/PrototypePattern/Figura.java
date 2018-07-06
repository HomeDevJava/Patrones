package PrototypePattern;

import PrototypePattern.Shape;

public abstract class Figura implements Shape {

	private String id;
	protected String type;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
	}
	
	public Shape clonar() {
		Figura clone= null;
		try {
			clone=(Figura) super.clone();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return  clone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Figura [id=" + id + ", type=" + type + "]";
	}
	
	
	

}
