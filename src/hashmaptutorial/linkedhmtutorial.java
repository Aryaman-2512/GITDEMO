package hashmaptutorial;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhmtutorial {
	
	public static void main(String[] args) {
		   LinkedHashMap<Integer, String> lhm 
		    = new LinkedHashMap<Integer, String>(); 


		lhm.put(1, "practice.geeksforgeeks.org"); 
		lhm.put(2, "code.geeksforgeeks.org"); 
		lhm.put(3, "www.geeksforgeeks.org"); 
		
        System.out.println(lhm); 
        System.out.println("Size ; "+ lhm.size());
        System.out.println("Size ; "+ lhm.remove(2));
        System.out.println(lhm);
        System.out.println("Size ; "+ lhm.containsKey(2));
        System.out.println("Size ; "+ lhm.containsValue("www.geeksforgeeks.org"));
        
	}
 
}
