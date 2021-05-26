
public class Test4 {

	public static void main(String[] args) {
		// 구구단 3의배수에 <3단>출력
		int i = 0, k = 0;
		for (i = 2; i < 10; i++) {
			if (i == 3) {
				System.out.println("<3단>");
			}
			for (k = 1; k < 10; k++) {
				System.out.println(i * k);
			}

		}

	}

}
