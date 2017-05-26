package algorithm;

public class A7TheMergeSort {
	
	public static void mergesort(int[] array) {
		
		mergesort(array, new int[array.length], 0, array.length-1);
		
		
	}
	
	public static void mergesort(int[] array, int[] temp, int leftStart, int rightEnd) {
		
		if (leftStart >= rightEnd) {
			return;
		}
		
		int middle = (leftStart + rightEnd) / 2;
		//排列 左边部分
		mergesort(array, temp, leftStart, middle);
		//排列 右边部分
		mergesort(array, temp, middle + 1, rightEnd);
		//合并左右两部分数组
		mergeHalves(array, temp, leftStart, rightEnd);
		
	}
	
	public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
		
		//左边末端 
		int leftEnd = (rightEnd + leftStart) / 2;
		//右边起点
		int rightStart = leftEnd + 1;
		//长度
		int size = rightEnd - leftStart + 1;
		
		
		//左起点
		int left = leftStart;
		//右起点
		int right = rightStart;
		//新数组的左起点
		int index = leftStart;
		
		
		//当左起点 小于等于 左末端    且  右起点  小于等于 右末端
		while (left <= leftEnd && right <= rightEnd) {
			
			//如果左边数小于 右边, 把左边数放入新数组temp中
			if (array[left] <= array[right]) {
				temp[index] = array[left];
				left++;
				
			//反之把右边数放入新数组temp中	
			} else {
				temp[index] = array[right];
				right++	;	
				
			}
			index++;
		}
		/** 
		 * public static void arraycopy(
		 * 
		 * 		Object src 源数组,
		        int srcPos 起始位置,
		        Object dest 目标数组,
		        int destPos 起始位置,
		        int length  复制长度
		        )
		*/
		System.arraycopy(array, left, temp, index, leftEnd - left + 1);
		System.arraycopy(array, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
		
	}
	
	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = (int) (Math.random()*100);
		}
		
		//输出原数组
		System.out.println("原数组: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		
		System.out.print("\n");
		mergesort(numbers);
		
		//输出排序后的数组
		System.out.println("排序后数组: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

}
