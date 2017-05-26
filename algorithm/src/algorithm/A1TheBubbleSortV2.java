package algorithm;

public class A1TheBubbleSortV2 {
	
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	
	public static void bubblesort(int[] array) {
		
		boolean isSorted = false;
		int lastUnsorted = array.length - 1;
		while(!isSorted) {
			isSorted = true;
			for(int i=0; i<lastUnsorted; i++) {
				
				if(array[i] > array[i+1]) {
					swap(array, i, i+1);
					isSorted = false;
				}
				
			}
			lastUnsorted--;
			
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
		bubblesort(numbers);
		
		//排序后数组
		System.out.println("新数组: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		

		
	}

}
