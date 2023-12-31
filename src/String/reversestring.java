package String;
public class reversestring {
	public static void main(String[] args) {
	   String l="jaydeep";
	   String v="";// to store the string
	   int o=l.length();
	   for(int i=o-1;i>=0;i--){
		   v=v+l.charAt(i);
	   }
	   System.out.println(v);
	}
}
