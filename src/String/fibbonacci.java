package String;

public class fibbonacci {
	public static void main(String[] args) {
		int a=0,b=1;
		int term=10;int c=0;
		for(int i=0;i<=term;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
 