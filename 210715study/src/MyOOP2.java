class Print{
	public static String delimiter="";
	public Print(String delimiter) {
		this.delimiter = delimiter;
	}
	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
public class MyOOP2 {

	public static void main(String[] args) {
		Print p1 = new Print("====");
		p1.A();
		p1.B();
		
		Print p2 = new Print("****");
		p2.A();
		p2.A();

	}
}
