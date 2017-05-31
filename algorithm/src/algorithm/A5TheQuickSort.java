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
		//当尾端位置 大于 首端位置
		while (left <= right) {
			//当首端的数 小于 pivot 则left++移动到下一个数
			while (array[left] < pivot) {
				left++;
			}
			
			//当尾端的数 大于pivot 则right--移动到下一个数
			while (array[right] > pivot) {
				right--;
			}
			
			//如果首端位置 小于等于 尾端位置
			if (left <= right) {
				//交换首位数
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
