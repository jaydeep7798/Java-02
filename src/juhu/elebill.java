package juhu;
import java.util.*;
public class elebill{
	String customername;
	double unitconsumed;
	double billamount;
	elebill(){}
	elebill(double uc,double bl){
		unitconsumed=uc;
		billamount=bl;
	}
	public void calculatebillamount() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unit= ");
		double x = sc.nextDouble();
		double a,b,c,d,f,s,h,v;
		if(x<=100) 
		{
			a=5*x;
		System.out.println("bill amount amount ="+a);
		}
		else if(x>100&&x<200)
		{   //b=-500;
		    x=x-100;
			s=x*7;
			b=+500;
			b=b+s;
			System.out.println("Bill amount will be="+b);
			}
		else if(x>=200)
		        x=x-300;
				v=x*10;
				h=1900;
				h=h+v;
				System.out.println("Bill amount will be ="+h);
		}
public static void main(String [] args){
	//Scanner sc = new Scanner(System.in);
	//double x = sc.nextDouble();
    elebill e=new elebill();
    e.calculatebillamount();
    
}	
}







