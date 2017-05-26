package algorithm;

public class A5TheQuickSort {
	
	public static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}
	
	public static void quicksort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		
		int pivot = array[(left + right)/2];
		int index = partition(array, left, right, pivot);
		quicksort(array, left, index - 1);
		quicksort(array, index, right);
		
		
	}
	
	public static int partition(int[] array, int left, int right, int pivot) {
		
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			
			while (array[right] > pivot) {
				right--;
			}
			
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
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
		quicksort(numbers);
		
		//排序后数组
		System.out.println("新数组: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		

		
	}

}
