package collection;
import java.util.*;
public class hashset {
	public static void main(String [] args) 
	{
		HashSet h = new HashSet();
		h.add(50);
		h.add(90);
		h.add(80);
		System.out.println(h);
		Iterator r =h.iterator();
		while(r.hasNext()) {
			System.out.println(r.next());
			
		
		}
	}
}
