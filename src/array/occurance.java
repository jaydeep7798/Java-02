package array;

import java.util.*;

public class occurance {
	public static void main(String[] args) {
		
	
	String s="steepgraphh";
	char[] ch=s.toCharArray();
	Map <Character,Integer> map =new HashMap();
	for(char chh:ch)
	{
		if(!map.containsKey(chh))
		{
			map.put(chh, 1);
		}
		else
		{
			int value =map.get(chh);
			map.put(chh, value+1);
			
		}
	}
	System.out.println(map);
	
}
}
