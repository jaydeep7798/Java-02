package array;

public class bubblesort {
	public static void bubblesort() {
		int arr[]= {22,55,66,33,44,99};
		int n =arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		bubblesort.bubblesort();
	}
	

}
