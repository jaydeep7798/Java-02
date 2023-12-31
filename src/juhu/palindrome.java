package juhu;
import java.util.*;

public class palindrome {
	
	public static void main(String[] args) {
	int o = 0;
		Scanner sc =new Scanner(System.in);
		int p=sc.nextInt();
		int s =p;
		while(p>=0) {
			
			int k=0;
			o=p%10;
			p=p/10;	
		}
		if(s==o) { 
			System.out.println("palindrome");
		}
		System.out.println("Not palindrome");
	}

}
