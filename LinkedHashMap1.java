import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		Map<Integer,String> lm=new LinkedHashMap<>();
		lm.put(501, "Naresh");
		lm.put(502, "Malthu");
		lm.put(503, "sunny");
		lm.put(504, "suri");
		lm.put(505, "ganni");
		System.out.println(lm);
		lm.entrySet();
		System.out.println(lm.containsKey(501));
		System.out.println(lm.containsValue("NARESH"));
		System.out.println(lm.containsValue("Naresh"));
		System.out.println(lm.get(501));
		System.out.println(lm.put(506,"Naresh"));
		System.out.println(lm.put(507,"Suri"));
		System.out.println(lm);
		System.out.println(lm.replace(506, "sai"));
		System.out.println(lm);
		System.out.println(lm.replace(506, "Sai"));
		System.out.println(lm);
		System.out.println(lm.size());
	}

}
