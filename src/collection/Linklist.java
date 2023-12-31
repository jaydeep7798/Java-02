package collection;
import java.util.*;

public class Linklist {
	public static void main(String [] args) {
		LinkedList p  = new LinkedList();
		p.add("jaydeep");
		p.add(30);
		p.add(60);
		p.set(0, "raj");
		p.removeLast();
		System.out.println(p);	
	}

}
