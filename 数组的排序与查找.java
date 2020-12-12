package test;
//数组排序与查找
import java.util.Scanner;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,5,3,6,8,2};
		//数组的排序
		System.out.println("排序前：");
		for(int x :arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println("排序后：");
		for(int x :arr) {
			System.out.print(x+" ");
		}
		//数组的查找
		System.out.println();
		System.out.print("请输入查找值：");
		int key = sc.nextInt();
		int find = -1;
		if((find = Arrays.binarySearch(arr, key))>-1)
		{
			System.out.println("找到该值 在"+find+"位置");
		}
		else
			System.out.println("未找到该值");
	}
}
