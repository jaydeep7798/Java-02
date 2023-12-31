package array;

public class demo {
	public static void main(String [] args) {
		//int arr[]= new int[5];
		int arr[]= {1,2,3,4,5,55,7};
		int min ,max;
		max=arr[0];
		min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]< max) 
				max=arr[i];
		}
		System.out.println(max);
	}

}
