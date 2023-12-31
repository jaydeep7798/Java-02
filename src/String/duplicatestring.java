package String;
public class duplicatestring {
	public static void main(String[] args) {
		String str="mahabharat";
		int length=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) //here we are taking the j value next to the a 
			{
			if(ch[i]==ch[j]) {
				System.out.println("duplicate element are   "+ch[j]);
				break;
			}
		}
		
	}
	}
	}
