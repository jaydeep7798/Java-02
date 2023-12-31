package coding_practice_String;

import java.util.Arrays;

public class anagram 
{
	
	public static void main(String[] args) {
		String s ="jay";
		String ss="ajyh";
		char ch[]=s.toCharArray();
		char chh[]=ss.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(chh);
		if(ch.length==chh.length)
		{
			if(Arrays.equals(ch, chh)==true)
			{
				System.out.println(" the Strings is anagram");
			}
			else {
				System.out.println(" The Strings is npot Anagram");
			}
		}
		else
		{
			System.out.println(" Please Provide the valid String ");
		}
		
	}

}
