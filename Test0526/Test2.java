
public class Test2 {

	public static void main(String[] args) {
		// 10~ 100증가 배열 for 입력 while출력

		int i = 0;
		int[] num = new int[10];
		for (i = 0; i < 10; i++) {
			num[i] = (i + 1) * 10;
		}
		while (i < 10) {
			System.out.println(num[i]);
			i++;
		}

	}

}
