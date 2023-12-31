package array;

public class reverse {
	public static void main(String [] args)
	{
		int[] a = new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		int key=2;
		for(int i =0;i<=a.length-1;i++) {
			if(a[i]==key) {
		System.out.println(a[i]);
		System.out.println(i);
		}
	}	
	}}
