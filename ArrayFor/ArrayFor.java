public class ArrayFor {

	public static void main(String[] args) {
		int[] num =new int[10];
		
		for(int i =0; i<num.length; i++) {
			num[i]=((i+1)*10);
			
			System.out.println(num[i]);
		}
//		int i=0;
//		while(i<10)
//			System.out.println("num[" +i+"]"+num[i]);		
//		i++;
	}
}



/* 10
 * 20
 * 30
 * 40
 * 50
 * 60
 * 70
 * 80
 * 90
 * 100
 * 되는 값을 가지는 배열
 */
