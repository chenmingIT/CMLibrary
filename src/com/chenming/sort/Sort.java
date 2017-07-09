package com.chenming.sort;


/**
 * 排序的类  int从小到大
 * @author ChenMing
 *
 */
public class Sort{
	
	/*
	 * 1、直接插入排序
	 * 时间复杂度 O(n^2)
	 */
	public static void insertSort( int[] data ) {
		int size = data.length ;
		for(int i=1;i<size;i++){
			//如果大于前面的数说明它目前是最大的 不需要处理
			//小于的话 找到它的位置
			if(data[i]<data[i-1]){
				int temp = data[i] ; //待插入元素
				int j ;
				for(j=i-1;j>=0 && data[j]>temp ;j--)
					data[j+1] = data[j] ;
				data[j+1]= temp ;
			}
		}
	}
	/*
	 * 2、希尔排序
	 * 基于插入排序的，不稳定的排序
	 * dk：增量
	 * 时间复杂度 O(n^1.3)  ->多种说法
	 * 不稳定排序
	 */
	public static void shellSort(int[] data){
		int size = data.length ;
		int dk = size/2 ; 
		while( dk>=1 ){
			for(int k=0;k<dk;k++){
				//对dk个子序进行直接插入排序(1改成dk)
				for(int i=k+dk;i<size;i=i+dk){
					if(data[i]<data[i-dk]){
						int temp = data[i] ; //待插入元素
						int j ; 
						for(j=i-dk;j>=k && data[j]>temp;j=j-dk)
							data[j+dk] = data[j] ;
						data[j+dk] = temp ;
					}
				}
			}
			dk = dk/2 ; 
		}
	}	
	/*
	 * 3、简单选择排序
	 * 时间复杂度 O(n^2)
	 */
	public static void simpleSelectSort(int []data){
		int size = data.length ;
		for(int i=0;i<size;i++){
			int k = i ; //用以存最小值的下标
			for(int j=i+1;j<size;j++){
				if(data[j]<data[k]){
					k = j ;
				}
			}
			//换值
			int temp = data[i] ; 
			data[i] = data[k] ; 
			data[k] = temp ; 
		}
	}
	/*
	 * 4、堆排序 待实现
	 */
	public static void heapSort(int []data){
		
	}
	/*
	 * 5、冒泡排序
	 * 时间复杂度 O(n^2)
	 */
	public static void bubbleSort(int []data){
		int size = data.length ;
		for(int i=0;i<size;i++){
			for(int j=0;j<size-i-1;j++){
				if(data[j]>data[j+1]){
					int temp = data[j] ; 
					data[j] = data[j+1] ; 
					data[j+1] = temp ; 
				}
			}
		}
	}
	/*
	 * 6、快速排序
	 * quickSort 快排函数 
	 * quickRangeSort 对某个范围进行快排
	 * getMiddle 获取快排中间值
	 * 时间复杂度 O(n*log2n)
	 * 不稳定排序
	 */
	public static void quickSort(int []data){
		int left = 0 ; 
		int right = data.length-1 ;
		quickRangeSort(data, left, right);
	}
	private static void quickRangeSort(int []data,int left,int right){
		if(left<right){
			int middle = getMiddle(data, left, right) ; 
			quickRangeSort(data, left, middle-1);
			quickRangeSort(data, middle+1, right);
		}
	}
	private static int getMiddle(int []data,int left,int right){
		int temp = data[left] ;
		while(left<right){
			while(left<right && temp<=data[right])
				right -- ;
			data[left]=data[right] ;
			while(left<right && temp>=data[left])
				left++ ;
			data[right]=data[left] ;
		}
		data[left] = temp ;
		return left ; 
	}
	/*
	 * 7、归并排序
	 * mergeRangeSort 范围归并排序
	 * merge 合并两个有序数列
	 * 时间复杂度 O(n*log2n)
	 * 稳定排序
	 */
	public static void mergeSort(int []data){
		mergeRangeSort(data, 0, data.length-1);
	}
	private static void mergeRangeSort(int []data,int left,int right){
		if(left<right){
			int middle = (left+right)/2 ; 
			mergeRangeSort(data, left, middle);
			mergeRangeSort(data, middle+1, right);
			merge(data,left,middle,right) ;
		}
	}
	private static void merge(int[]data,int left,int middle,int right){
		int [] temp = new int[right-left+1];
		int i = left ;
		int j = middle + 1 ; 
		int k = 0 ; 
		while(i<=middle&j<=right){
			if (data[i]<data[j]){
				temp[k] = data[i] ;
				i++ ;
			}else {
				temp[k] = data[j] ;
				j++ ;
			}
			k++ ;
		}
		//剩余部分
		while(i<=middle){
			temp[k] = data[i] ;
			i++ ;
			k++ ;
		}
		while(j<=right){
			temp[k] = data[j] ;
			j++ ;
			k++ ;
		}
		for(k=0;k<temp.length;k++){
			data[left+k] = temp[k] ;
		}
	}
	/*
	 * 8、基数排序
	 * 时间复杂度 O(n*log2n)
	 * 不稳定排序
	 */
	private static void radixSort(int[]data){
		
	}
}








