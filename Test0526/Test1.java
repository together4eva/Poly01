
public class Test1 {

	public static void main(String[] args) {
		// 2~9단출력 3단 5단에만 <3단>출력

		int i = 2, k = 1;
		while (i < 10) {
			k = 1;
			while (k < 10) {
				if (i ==3 || i == 5) {
					System.out.println("<3단>");
				}
				System.out.println(i + "*" + k + "=" + i * k);
				k++;
			}
			i++;
		}
	}

}

//k= 1을 하는 이유 : while문 반복 k<10 조건  10되면 반복이 불가능하기 때문에 다시 k의 값을 1로 초기화시켜서
//                 반복되게함