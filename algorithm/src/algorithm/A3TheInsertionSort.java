package algorithm;

public class A3TheInsertionSort {

	
	public static void insertionSort(int[] arr) {
		for (int i=1; i<arr.length; i++) {
			int key = arr[i];
			int n = i-1;
			while ((n>-1) && (arr[n]>key)) {
				arr[n+1] = arr[n];
				n--;
			}
			arr[n+1] = key;
		}
		
	}
	
	
	public static void main(String[] arg) {
		
		int[] numbers = new int[10];
		for(int i=0; i<numbers.length; i++) {
			//Math.random()是一个大于0 小于1的double数
			numbers[i] = (int) (100 + Math.random()*(100+1));
		}

		//原数组
		System.out.println("原数组: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.print("\n");
		//排序
		insertionSort(numbers);
		
		//排序后数组
		System.out.println("新数组: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.print("\n");
		System.out.println(numbers.length + "");
	}	
}
