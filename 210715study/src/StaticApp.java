class Foo{
	public static String classVar = "i class var";
	public String instanceVar = "i intance var";
	
	public static void classMethod() {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar); //error
	}
	public void instanceMethod() {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar);
	}
}
public class StaticApp {

	public static void main(String[] args) {
		
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar); //error
//		Foo.classMethod(); //error
		
		

	}

}
