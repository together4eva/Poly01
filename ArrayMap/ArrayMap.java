import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ArrayMap {

   public static void main(String[] args) {
      List<HashMap<String, String>> rList = new ArrayList<>();

      HashMap<String, String> pMap = new HashMap<>();

      pMap.put("name", "�̸�");
      pMap.put("email", "�ƾƾ�@naver.com");
      pMap.put("addr", "������");
      pMap.put("dept", "����������");

      rList.add(pMap);

      pMap = null;

      pMap = new HashMap<>();

      pMap.put("name", "�̸�2��");
      pMap.put("email", "ȫ�浿@naver.com");
      pMap.put("addr", "�ּ���");
      pMap.put("dept", "��������");

      rList.add(pMap);

      pMap = null;

      Iterator<HashMap<String, String>> it = rList.iterator();
      while (it.hasNext()) {
         HashMap<String, String> rMap = it.next();

         System.out.println("########�ݺ�������######");
         System.out.println("name+" + rMap.get("name"));
         System.out.println("email+" + rMap.get("email"));
         System.out.println("addr+" + rMap.get("addr"));
         System.out.println("dept+" + rMap.get("dept"));
         rMap = null;
         System.out.println("##############�ݺ�����#########");
      }
   }
}