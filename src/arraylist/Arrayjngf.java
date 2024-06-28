package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayjngf {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    Iterator<String> loopitem = cars.iterator();
	    
	    while(loopitem.hasNext())
	    {
	    	System.out.println(loopitem.next());
	    	
	    }
	}
	
}
