package algorithm;

public class A1TheBubbleSort {
	
	
	static final int SIZE = 10;
	
	public static void bubbleSort(int[] a) {
		
		
		int temp;
		
		for(int i=1; i<a.length; i++) {
			
			for(int j=0; j<a.length-i; j++) {
				
				//将相邻两个数进行比较, 较大的数往后冒泡
				if(a[j] > a[j+1]) {
					//交换相邻两个数
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
			
			System.out.print("第" + i + "步排序结果: ");
			
			for(int k=0; k<a.length; k++) {
				
				System.out.print(" " + a[k]);
			}
			
			System.out.print("\n");
		}	
		
	}
	

	public static void main(String[] arg) {
		
		
		/*
		 * 创建一个随机数 数组 容量为10
		 */
		int[] numbers = new int[SIZE];
		
		int i;
		
		for(i=0; i<SIZE; i++) {
			
			numbers[i] = (int) (100 + Math.random()*(100+1));
		}
		
		//输出排序前的数组
		System.out.print("排序前的数组为: \n");
		
		
		
		
		for(i=0; i<SIZE; i++) {
			
			System.out.print(numbers[i] + " ");
		}
		System.out.print("\n");
		
		
		bubbleSort(numbers);
		System.out.print("排序后的数组为: \n");
		
		for(i=0; i<SIZE; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.print("\n");
		
		
	}

}
