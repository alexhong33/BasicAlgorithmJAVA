package algorithm;

public class A4TheShellSort {
	
	static void shellSort (int[] arr)
	{
		int i, j;
		int r, temp;
		
		//r为arr的中间index
		for (r=arr.length/2; r>=1; r/=2) {
			
			for (i=r; i<arr.length; i++) {
				//temp中间index的值
				temp = arr[i];
				//第一次运算j=0, 第二次为1 随着i++
				j = i - r;
				//当 后置位数 < 前置位数
				while (j>=0 && temp<arr[j]) {
					//后置位数 = 前置位数
					arr[j+r] = arr[j];
					//结束
					j-=r;
					
				}		
				//当 后置位数 >= 前置位数时 
				arr[j+r]=temp;
			}
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
		shellSort(numbers);
		
		//排序后数组
		System.out.println("新数组: ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		

		
	}

}
