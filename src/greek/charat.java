package greek;
public class charat {
	public static  void main(String [] args)
	{
		String s="jaydeep";
		String s1="jayendra";
		System.out.println(s.charAt(2));
		System.out.println(s.codePointAt(1));
		System.out.println(s.compareTo(s1));
		String s3=s.concat(s1);
		System.out.println(s3);
		if(s.equals(s1)) {
			System.out.println("True");
		}
	    System.out.println("False");
	    System.out.println(s.hashCode());
	    System.out.println(s.indexOf("y"));
	    System.out.println(s.length());
	    System.out.println(s.substring(1,5));
	    System.out.println(s.toUpperCase());
	    System.out.println(s.toLowerCase());
	    System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
	    

	}

}
