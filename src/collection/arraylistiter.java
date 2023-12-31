package collection;
import java.util.*;
public class arraylistiter {
	public static void main(String [] args) 
	{
		List<Integer> ob=new ArrayList();
		ob.add(12);
		ob.add(23);
		ob.add(45);
		ob.add(56);
		ob.add(78);
		ob.add(89);
		Iterator r = ob.iterator();
		while(r.hasNext()){
			System.out.println(r.next());
			
		}
	}
}
