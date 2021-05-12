import java.io.FileWriter;

public class OtherOOP {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.PI);
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("hello");
		f1.write("java");
		f1.close();

	}

}
