
public class BinarySearch {
	public static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right) {
			int mid = (left+right)/2;
			
			if(key==arr[mid])
				return mid;
			
			if(key < arr[mid])
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 10, 40 };
        int target = 3;
//        int n = arr.length;

        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index " + result);
	}
}
