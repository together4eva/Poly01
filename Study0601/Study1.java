
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Study1 {
	public static void main(String[] args) {
		List list = new ArrayList(10);
		list.add("����");
		list.add("�ϳ��Ѽ�");
		list.add("�ݴټ�");
		
		Iterator it = list.iterator();
		if (it.hasNext()) {
		   String next = (String)it.next();
		   System.out.println("<"+next+">");
		}		   
		while (it.hasNext()) {
			String next = (String)it.next();
			System.out.println(next);
		}			
	}
}