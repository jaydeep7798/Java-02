package coding_practice_String;

public class dupicate {
	public static void main(String[] args) {
		int s[]= {88,99,77,88,99,22,11,22,66};
		dupicate.unique(s);
	}

	private static void unique(int[] s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length;i++)
		{
			int j =s[i];
			for(int k=i+1;k<s.length;k++)
			{
				if(s[k]==s[i])
				{
					System.out.println(s[k]);
				}
			}
			
		}
	}

}
