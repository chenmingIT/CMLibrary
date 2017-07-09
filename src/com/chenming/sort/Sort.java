package com.chenming.sort;


/**
 * �������  int��С����
 * @author ChenMing
 *
 */
public class Sort{
	
	/*
	 * 1��ֱ�Ӳ�������
	 * ʱ�临�Ӷ� O(n^2)
	 */
	public static void insertSort( int[] data ) {
		int size = data.length ;
		for(int i=1;i<size;i++){
			//�������ǰ�����˵����Ŀǰ������ ����Ҫ����
			//С�ڵĻ� �ҵ�����λ��
			if(data[i]<data[i-1]){
				int temp = data[i] ; //������Ԫ��
				int j ;
				for(j=i-1;j>=0 && data[j]>temp ;j--)
					data[j+1] = data[j] ;
				data[j+1]= temp ;
			}
		}
	}
	/*
	 * 2��ϣ������
	 * ���ڲ�������ģ����ȶ�������
	 * dk������
	 * ʱ�临�Ӷ� O(n^1.3)  ->����˵��
	 * ���ȶ�����
	 */
	public static void shellSort(int[] data){
		int size = data.length ;
		int dk = size/2 ; 
		while( dk>=1 ){
			for(int k=0;k<dk;k++){
				//��dk���������ֱ�Ӳ�������(1�ĳ�dk)
				for(int i=k+dk;i<size;i=i+dk){
					if(data[i]<data[i-dk]){
						int temp = data[i] ; //������Ԫ��
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
	 * 3����ѡ������
	 * ʱ�临�Ӷ� O(n^2)
	 */
	public static void simpleSelectSort(int []data){
		int size = data.length ;
		for(int i=0;i<size;i++){
			int k = i ; //���Դ���Сֵ���±�
			for(int j=i+1;j<size;j++){
				if(data[j]<data[k]){
					k = j ;
				}
			}
			//��ֵ
			int temp = data[i] ; 
			data[i] = data[k] ; 
			data[k] = temp ; 
		}
	}
	/*
	 * 4�������� ��ʵ��
	 */
	public static void heapSort(int []data){
		
	}
	/*
	 * 5��ð������
	 * ʱ�临�Ӷ� O(n^2)
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
	 * 6����������
	 * quickSort ���ź��� 
	 * quickRangeSort ��ĳ����Χ���п���
	 * getMiddle ��ȡ�����м�ֵ
	 * ʱ�临�Ӷ� O(n*log2n)
	 * ���ȶ�����
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
	 * 7���鲢����
	 * mergeRangeSort ��Χ�鲢����
	 * merge �ϲ�������������
	 * ʱ�临�Ӷ� O(n*log2n)
	 * �ȶ�����
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
		//ʣ�ಿ��
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
	 * 8����������
	 * ʱ�临�Ӷ� O(n*log2n)
	 * ���ȶ�����
	 */
	private static void radixSort(int[]data){
		
	}
}








