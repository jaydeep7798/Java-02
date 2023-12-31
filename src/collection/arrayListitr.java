package collection;
import java.util.*;
public class arrayListitr {
 public static void main(String [] args)
 {
	 List<Integer> ob  =new ArrayList();
	 ob.add(33);
	 ob.add(233);
	 ob.add(852);
	
	ListIterator i =ob.listIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	while(i.hasPrevious()) {
		System.out.println(i.previous());
	}
 }
}
