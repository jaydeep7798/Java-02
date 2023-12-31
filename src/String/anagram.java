package String;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String s ="abe";
		String ss="bca";
		s=s.toLowerCase();
		ss=ss.toLowerCase();
		if(s.length()==ss.length())
		{
			char []a =s.toCharArray();
			char []aa=ss.toCharArray();
			Arrays.sort(a);
			Arrays.sort(aa);
			boolean result =Arrays.equals(a, aa);
			if(result)
			{
				System.out.println(" String is Anagram");
			}
			else {
				System.out.println("string is not anagram");
			}
		}
	}

}
