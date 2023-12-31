package String;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		int s=0,r,c;
		Scanner sc=new Scanner(System.in);
	    int k =sc.nextInt();
	    c=k;
	    while(k>0) {
	    r=k%10;// remainder will be one 
	    s=(s*10)+r;//intial the value will be the s=0 and first the value will be stored into the
	    //s then value of the s will be change 
	    k=k/10;//k value will be reduced 
	    }
	    if(c==s) {
	    	System.out.println("palindrome number");
	    
	    }
	    else {
	    	System.out.println("Not palindrome number");
	   }
	
	 }
	}

