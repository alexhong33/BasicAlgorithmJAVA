package algorithm;

public class A2TheSelectSort {
	
	static final int SIZE=10;
	
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	
	public static void selectSort(int[] arr) {
		
		for (int i=0; i<arr.length-1; i++) {
			
			int index = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j]<arr[index]) {
					index = j;
				}
			}
			swap(arr, i, index);
			printArr(arr, i);
		}
		
	}
	
	//输出每一步的排序情况
	public static void printArr(int[] arr, int i) {
		System.out.println("第"+i+"步排序结果: ");
		for (int k=0; k<arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
		System.out.print("\n");
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
		selectSort(numbers);
		
		//排序后数组
		System.out.println("新数组: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

}
