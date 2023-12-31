package coding_practice_String;

import java.util.*;

public class eachoccuranchar {
public static void main(String[] args) {
	String s = "jayendra";
	Map<Character ,Integer> map= new HashMap();
	char []ch =s.toCharArray();
	for(char chh:ch)
	{
		if(!map.containsKey(ch))
		{
		  map.put(ch, 1);
		}
		else
		{
			int value=map.get(ch);
			map.put(ch, value +1);
		}
		
	}
	
	
	
}
}
