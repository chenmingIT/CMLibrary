package com.chenming.datastructure;

import java.util.Arrays;

public class StringClass {
	public static void main(String []args){
		String string = "chenming" ; 
		System.out.print("转成char数组：");
		//转成char数组
		char []ch = string.toCharArray() ;
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
		System.out.print("\n"+"数组排序：");
		//数组排序
		int[] data = {12,34,2,56,23,90,4} ;
		Arrays.sort(data);
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
		//数组转字符串
		System.out.print("\n"+"数组转字符串：");
		String dataStr = Arrays.toString(data);
		System.out.print(dataStr);
		//获得某个索引处的字符 
		System.out.print("\n"+"获得某个索引处的字符 ：");
		System.out.print(string.charAt(2));
		//获得子字符串
		System.out.print("\n"+"获得子字符串 ：");
		System.out.print( string.substring(2, 4));
		//字符串转数字
		String intData = "123" ;
		System.out.print("\n"+"字符串转数字 ：");
		System.out.print( Integer.valueOf(intData));
	}
}







