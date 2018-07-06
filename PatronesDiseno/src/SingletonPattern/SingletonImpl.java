package SingletonPattern;

public class SingletonImpl {

	public static void main(String[] args) {
		SingleObject obj=SingleObject.getInstance();
		obj.showMessaage();
		
		SingleObject obj2= SingleObject.getInstance();
		obj2.showMessaage();
		
		boolean rpta= obj instanceof SingleObject;
		System.out.println(rpta);

	}

}
