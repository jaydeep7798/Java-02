/*
 1) create a multi-threaded application by using  "extends Thread " method. 
 create 2 threads. they should display characters from A to J.
 */
package hackerrank;

abstract class parent {
	public abstract String demo();
}
class  child extends parent{
	public String demo() 
	{
		return "jaydeep shivnath rajput";
	}
}
class abtractt{
public static void main(String [] args) {
	child s= new child();
	String j=s.demo();
	System.out.println("My name is -"+j);
}
}