import java.io.FileWriter;
import java.io.IOException;

public class OthersOOOP {

	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("hello");
		f1.write("java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("hello");
		f2.write("jave2");
		f2.close();
		
		f1.write("!!!");
		f1.close();
		
	}

}
