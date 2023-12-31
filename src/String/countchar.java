package String;

public class countchar {
	public static void main(String[] args) {
		String s= "jaydeep";
		int count=0;
		int l=s.length();
		if(l>0){
			for(int i=l-1;i>=0;i--) {
				count++;
			}
		}
		System.out.println(count);
	}

}
