import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ArrayMap {

   public static void main(String[] args) {
      List<HashMap<String, String>> rList = new ArrayList<>();

      HashMap<String, String> pMap = new HashMap<>();

      pMap.put("name", "이름");
      pMap.put("email", "아아아@naver.com");
      pMap.put("addr", "서울임");
      pMap.put("dept", "데데데데데");

      rList.add(pMap);

      pMap = null;

      pMap = new HashMap<>();

      pMap.put("name", "이름2임");
      pMap.put("email", "홍길동@naver.com");
      pMap.put("addr", "주소임");
      pMap.put("dept", "이이이터");

      rList.add(pMap);

      pMap = null;

      Iterator<HashMap<String, String>> it = rList.iterator();
      while (it.hasNext()) {
         HashMap<String, String> rMap = it.next();

         System.out.println("########반복시작임######");
         System.out.println("name+" + rMap.get("name"));
         System.out.println("email+" + rMap.get("email"));
         System.out.println("addr+" + rMap.get("addr"));
         System.out.println("dept+" + rMap.get("dept"));
         rMap = null;
         System.out.println("##############반복끝임#########");
      }
   }
}