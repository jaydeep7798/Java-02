package coding_practice_String;

public class bubblesort {
	
	public static void main(String[] args) {
		int [] ss = {22,55,88,77,44,33};
		bubblesort.sorting(ss);
		bubblesort.print(ss);
		
		
	}

	private static void print(int[] ss) {
		// TODO Auto-generated method stub
		for(int i=0;i<ss.length;i++) {
			System.out.println(ss[i]);
		}
		
	}

	private static void sorting(int[] ss) {
		// TODO Auto-generated method stub
		for(int i=0;i<ss.length-1;i++)
		{
			for(int j=0;j<ss.length-1;j++)
			{
				if(ss[j]>ss[j+1])
				{
					int temp =ss[j];
					ss[j]=ss[j+1];
					ss[j+1]=temp; 
				}
			}
		}
		
	}
	

}
