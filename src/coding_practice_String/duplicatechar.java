package coding_practice_String;

public class duplicatechar {
	
	public static void main(String[] args) {
		String s="jaydeepp";
		char ch[] =s.toCharArray();
		duplicatechar.checkchar(ch);	
	}
	private static void checkchar(char ch[]) {
		// TODO Auto-generated method stub
		for(int i=0;i<ch.length;i++)
		{
		  char d=ch[i];
		  for(int j=i+1;j<ch.length;j++)
		  {
			  if(ch[i]==ch[j])
			  {
				  System.out.println(ch[j]);
				  
			  }
		  }
		}
		
	}

}
