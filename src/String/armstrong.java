package String;

public class armstrong {
	 
	public static void main(String[] args) {
		int arm=0;
		int k=153;
		int c=k;
		while(k>0) {
			int rem=k%10;
			arm=(rem*rem*rem)+arm;
			k=k/10;	
		}
		if(c==arm) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("Not an armstrong number");
		}
		
	}
}
