package array;

public class stringpalindrome {
	public static void main(String[] args) {
	String s = "madam";
	int i=0,j=s.length()-1,flag=0;
	while(i<j&&flag==0) {
		if(s.charAt(i)!=s.charAt(j))
		{
			flag=1;
		}
		i++;j--;
	}
	if(flag==0) {
	System.out.println(s);
	}

}

	private static Object charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object chatAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}