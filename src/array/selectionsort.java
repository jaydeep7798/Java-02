package array;

public class selectionsort {
	public static void selection() {
		int arr[]= {22,33,55,44,99,77};
		for(int i=0;i<arr.length-1;i++)
		{
			int smallest=i;
			for( int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]<j) {
					smallest=j;
				}
				int temp=arr[smallest];
				arr[smallest]=arr[i];
				arr[i]=temp;
			}
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		selectionsort.selection();
	}

}
