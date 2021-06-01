
public class Array2 {

	public static void main(String[] args) {
		int i;
		
		int[] num = new int[10];
		for(i=0; i<10; i++) {
			num[i]=(i+1)*10;
		}
		i=0;
		while(i<10) {
			System.out.println(num[i]);
			i++;
		}

	}

}
