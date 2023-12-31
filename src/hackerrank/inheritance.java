package hackerrank;
class arithmatic{
	int add(int a ,int b) {
		return a+b;
	}
}
class adder extends arithmatic{
	//
}

public class inheritance {
	public static void main(String [] args) {
		adder a= new adder();
		int s=a.add(10, 20);
		System.out.println(" My superclass will be; " +a.getClass().getSuperclass().getName());
		System.out.println(s);
		
	}

}
