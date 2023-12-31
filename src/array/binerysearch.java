package array;

public class binerysearch {
	public static void  binery(int arr[],int first,int last,int key) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
				first=mid+1;}
				else if(arr[mid]==key) {
					System.out.println("Element is found "+arr[mid]);
					break;
				}
				else {
					last=mid-1;				
			}
			mid=first+last/2; 	
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int first=0;
		int last=arr.length-1;
		int key =7;
		binery(arr,0,last,key);
		
	}

}
