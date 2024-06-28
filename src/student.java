import java.util.HashMap;


public class student {
 public static void main(String[] args) {
	HashMap<String, HashMap<Integer, Integer>> student = new HashMap<String, HashMap<Integer, Integer>>();
	
	HashMap<Integer, Integer> markssemester  = new HashMap<Integer, Integer>();
	
	markssemester.put(1, 99);
	markssemester.put(2, 89);
	
	student.put("Vipul", markssemester);
	System.out.println(student);
}
}
