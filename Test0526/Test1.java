
public class Test1 {

	public static void main(String[] args) {
		// 2~9����� 3�� 5�ܿ��� <3��>���

		int i = 2, k = 1;
		while (i < 10) {
			k = 1;
			while (k < 10) {
				if (i ==3 || i == 5) {
					System.out.println("<3��>");
				}
				System.out.println(i + "*" + k + "=" + i * k);
				k++;
			}
			i++;
		}
	}

}

//k= 1�� �ϴ� ���� : while�� �ݺ� k<10 ����  10�Ǹ� �ݺ��� �Ұ����ϱ� ������ �ٽ� k�� ���� 1�� �ʱ�ȭ���Ѽ�
//                 �ݺ��ǰ���