package hackerrank; 
class A {
	void show() {
		System.out.println(" this is show of A");
	}
}
class B extends A{
	void show() {
		System.out.println(" this is also the shows of B");
	}
}
	 
public class datatype {
	static void perform(A ref) {
		ref.show();
		if(ref instanceof B) {
		B ob=(B)ref;
		ob.show();}
	}
	
public static void main(String [] args) {
		perform(new B());
		perform(new A());
		//perform(new B());
	}
	}

