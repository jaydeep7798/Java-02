package  hackerrank;
import java.util.Scanner;

interface  Arithmatic
{
	 int divisor_sum1();
}
 class xx implements Arithmatic
 {
	public int divisor_sum1() 
	{   Scanner s=new Scanner(System.in);
	    int k=s.nextInt();
		int sum =0;
		for(int i=1;i<=k;i++)
		{
			if(k% i==0) 
			{
				 sum+=i;
			}
		    //return sum; 
		}
		return sum;
	}
 }
public class interfaces 
{
	public static void main(String [] args) 
	{
		Arithmatic ob = new xx();
		ob.divisor_sum1();
	}
}


