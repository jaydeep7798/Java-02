package String;
import java.util.*;
public class countnodidgit {
public static void main(String[] args) {
	int count=0;
	System.out.println("Enter the given number");
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	while(k>0) {
		k=k/10;
		count++;
	}
	System.out.println("count is "+count);
	
}
}
